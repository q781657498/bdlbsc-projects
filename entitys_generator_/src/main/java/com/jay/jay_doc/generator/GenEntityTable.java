package com.jay.jay_doc.generator;

import com.jay.jay_doc.utils.Underline2Camel;
import com.mysql.jdbc.StringUtils;

import java.io.*;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.filechooser.FileSystemView;


/**
 * @author jay【jiangmang.1992@163.com】
 * date: 18-7-17
 */
public class GenEntityTable {

    private static String driver;
    private static String user;
    private static String pwd;
    private static String url;
    private static String exportPackageName;
    private static String exportPackagePath;
    private static List<String> removePreFix = new ArrayList<>();
    private static List<String> removeSuffix = new ArrayList<>();
    private static List<String> createTables = new ArrayList<>();

    private static Connection getConnection = null;
    private static StringBuffer importJars = new StringBuffer();

    public static void main(String[] args) {
        GenEntityTable gen = new GenEntityTable();
        gen.initProperties();
        if(StringUtils.isNullOrEmpty(exportPackagePath)) {
            FileSystemView fsv = FileSystemView.getFileSystemView();
            exportPackagePath = fsv.getHomeDirectory().toString();
        }
        getConnection = gen.getConnections();
        try {
            DatabaseMetaData dbmd = getConnection.getMetaData();
            ResultSet resultSet = dbmd.getTables(null, "%", "%", new String[] { "TABLE" });
            while (resultSet.next()) {
                importJars.setLength(0);
                String tableName = resultSet.getString("TABLE_NAME");
                String tableMark = resultSet.getString("REMARKS");
                //这里干掉IF可对库里面所有表直接生成
                System.out.println(createTables.size());
                if(createTables.size() > 0){
                    if(createTables.contains(tableName))
                        gen.createEntityCode(dbmd, tableName, tableMark);
                } else {
                    gen.createEntityCode(dbmd, tableName, tableMark);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    private synchronized void initProperties() {
        try {
            InputStream prop = GenEntityTable.class.getResourceAsStream("/jdbc.properties");
            if(prop == null) {
                System.err.println("配置文件未找到");
            }
            Properties properties = new Properties();
            properties.load(prop);
            driver = properties.getProperty("com.jay.doc.jdbc.driver");
            user = properties.getProperty("com.jay.doc.jdbc.username");
            pwd = properties.getProperty("com.jay.doc.jdbc.password");
            url = properties.getProperty("com.jay.doc.jdbc.url");
            exportPackageName = properties.getProperty("com.jay.doc.export.package_name");
            exportPackagePath = properties.getProperty("com.jay.doc.export.package_path");
            String[] prefixes = properties.getProperty("com.jay.doc.remove_prefix").split(",");
            for (String pre : prefixes) {
                if(!StringUtils.isNullOrEmpty(pre)) {
                    removePreFix.add(pre);
                }
            }
            String[] suffixes = properties.getProperty("com.jay.doc.remove_suffix").split(",");
            for (String suf : suffixes) {
                if(!StringUtils.isNullOrEmpty(suf)) {
                    removeSuffix.add(suf);
                }
            }
            String[] tables = properties.getProperty("com.jay.doc.create_tables").split(",");
            for (String table : tables) {
                if(!StringUtils.isNullOrEmpty(table)) {
                    createTables.add(table);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * 创建实体代码
     * @param dbmd
     * @param tableName
     * @param tableMark
     */
    private void createEntityCode(DatabaseMetaData dbmd, String tableName, String tableMark) {
        try {
            //ResultSet rs =getConnection.getMetaData().getColumns(null, getXMLConfig.getSchema(),tableName.toUpperCase(), "%");//其他数据库不需要这个方法的，直接传null，这个是oracle和db2这么用
            ResultSet rs1 = dbmd.getColumns(null, "%", tableName, "%");
            ResultSet rs2 = dbmd.getColumns(null, "%", tableName, "%");
            String className = removeFixName(tableName);
            String filePath = exportPackagePath + File.separator+ Underline2Camel.underline2Camel(className, false)+".java";
            File directory = new File(filePath);
            FileWriter fw = new FileWriter(directory);
            PrintWriter pw = new PrintWriter(fw);
            pw.write("package " + exportPackageName + ";\r\n");
            pw.write("\r\n");
            pw.write("/**\r\n");
            pw.write(" * " + tableName + " "+tableMark+"\r\n");
            pw.write(" * @author " + "zhao.mr" + " " + getDate()+ "\r\n");
            pw.write(" */ \r\n");
            pw.write("public class " + Underline2Camel.underline2Camel(className, false) + " {\r\n");
            System.out.println();
            System.out.println(tableName+"表信息：");
            System.out.println();
            while(rs1.next()){
                if (!directory.exists()) {
                    boolean success = directory.createNewFile();
                }
                String type = sqlType2JavaType(rs1.getString("TYPE_NAME"));
                String name = rs1.getString("COLUMN_NAME");
                String remark = rs1.getString("REMARKS");
                boolean isNullAble = rs1.getBoolean("IS_NULLABLE");
                System.out.println("private " +type+"	"+rs1.getString("COLUMN_NAME")+";");
                createPrType(pw,type,name,remark,isNullAble);
            }
            //提供Get和Set方法
            pw.write("\r\n");
            while(rs2.next()){
                String name = rs2.getString("COLUMN_NAME");
                String type = rs2.getString("TYPE_NAME");
                createMethod(pw,type,name);
            }
            pw.write("}\r\n");
            pw.flush();
            pw.close();

            insertNewWord(("package " + exportPackageName + ";\r\n\r\n").length(),importJars.toString(),filePath);

            System.out.println();
            System.out.println();
            System.out.println("=====注意☆信息=====");
            System.out.println();
            System.out.println("	生成成功！文件在你的桌面。");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private String removeFixName(String name) {
        String fixName = name;
        for (String fix : removePreFix) {
            if(!StringUtils.isNullOrEmpty(fix) && name.contains(fix)) {
                fixName = fixName.replaceFirst("^"+fix,"");
                break;
            }
        }
        for (String fix : removeSuffix) {
            if(!StringUtils.isNullOrEmpty(fix) && name.contains(fix)) {
                fixName = fixName.replaceFirst(fix+"$","");
                break;
            }
        }
        return fixName;
    }



    /**生成属性*/
    private void createPrType(PrintWriter pw,String type,String name,String remark,boolean isNullAble){
        pw.write("\t/**\r\n");
        pw.write("\t * @column "+name+"\r\n");
        pw.write("\t * @desc "+remark+"\r\n");
        if(!isNullAble)
            pw.write("\t * @required true\r\n");
        pw.write("\t */\r\n");
        name = Underline2Camel.underline2Camel(name, true);
        pw.write("\tprivate " +type+" "+name+";\r\n");
    }

    /**生成方法*/
    private void createMethod(PrintWriter pw,String type,String name){
        String methodName = Underline2Camel.underline2Camel(name, false);
        String filedName = Underline2Camel.underline2Camel(name, true);
        pw.write("\tpublic void set" + methodName + "("+ sqlType2JavaType(type) + " " + filedName+ "){\r\n");
        pw.write("\t\tthis." + filedName + " = " + filedName + ";\r\n");
        pw.write("\t}\r\n");
        if("Boolean".equalsIgnoreCase(type)) {
            pw.write("\tpublic " + sqlType2JavaType(type) + " is"+ methodName + "(){\r\n");
        } else {
            pw.write("\tpublic " + sqlType2JavaType(type) + " get"+ methodName + "(){\r\n");
        }
        pw.write("\t\treturn " + filedName + ";\r\n");
        pw.write("\t}\r\n");
        pw.write("\r\n");
    }


    /**
     * 创建数据库连接
     * @return connection
     */
    private Connection getConnections() {
        try {
            Class.forName(driver);
            getConnection = DriverManager.getConnection(url, user, pwd);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return getConnection;
    }

    /**
     * sql类型与Java类型转换
     * @param sqlType sqlType
     * @return javaType
     */
    private String sqlType2JavaType(String sqlType) {
        sqlType = Arrays.asList(sqlType.toLowerCase().split(" ")).get(0);
        String str = null;
        if ("bit".equals(sqlType)) {
            str = "boolean";
        } else if ("tinyint".equals(sqlType)) {
            str = "Byte";
        } else if ("smallint".equals(sqlType)) {
            str = "Short";
        } else if ("int".equals(sqlType)) {
            str = "Integer";
        } else if ("bigint".equals(sqlType)) {
            str = "Long";
        } else if ("float".equals(sqlType)) {
            str = "Float";
        } else if (Arrays.asList("decimal","numeric","real","money","smallmoney","double").contains(sqlType)) {
            str = "Double";
        } else if (Arrays.asList("varchar","char","varchar2","nvarchar","nchar","text").contains(sqlType)) {
            str = "String";
        } else if ("datetime".equals(sqlType) || "date".equals(sqlType)) {
            str = "Date";
            if(importJars.indexOf("import java.util.Date") < 0) {
                importJars.append("import java.util.Date;\r\n");
            }
        } else if (Arrays.asList("image","blob").contains(sqlType)) {
            str = "Blob";
            if(importJars.indexOf("import java.sql.Blob;\r\n") < 0) {
                importJars.append("import java.sql.Blob;\r\n");
            }
        }
        return str;
    }


    /**
     * 获取格式化的时间
     * @return formatDate
     */
    private static String getDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(new Date());
    }


    private static void insertNewWord(long skip, String str, String fileName) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(fileName, "rw");
            if (skip < 0 || skip > randomAccessFile.length()) {
                return;
            }
            byte[] b = str.getBytes();
            randomAccessFile.setLength(randomAccessFile.length() + b.length);
            //把后面的内容往后面挪
            for (long i = randomAccessFile.length() - 1; i > b.length + skip - 1; i--) {
                randomAccessFile.seek(i - b.length);
                byte temp = randomAccessFile.readByte();
                randomAccessFile.seek(i);
                randomAccessFile.writeByte(temp);
            }
            randomAccessFile.seek(skip);
            randomAccessFile.write(b);
            randomAccessFile.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

