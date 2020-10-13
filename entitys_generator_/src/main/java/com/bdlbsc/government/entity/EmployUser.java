package com.bdlbsc.government.entity;

import java.util.Date;

/**
 * employ_user 
 * @author liushuai 2020-09-25
 */
public class EmployUser {
    /**
     * @column id
     * @desc 
     * @required true
     */
    private String id;

    /**
     * @column org_id
     * @desc 组织机构id
     * @required true
     */
    private Long orgId;

    /**
     * @column username
     * @desc 登录名
     */
    private String username;

    /**
     * @column userpic
     * @desc 头像
     */
    private String userpic;

    /**
     * @column user_role
     * @desc 用户角色（0,老板 1，员工）
     */
    private String userRole;

    /**
     * @column birthday
     * @desc 生日
     */
    private String birthday;

    /**
     * @column age
     * @desc 年龄
     */
    private Integer age;

    /**
     * @column sex
     * @desc 性别  0 男 1 女 2 其他
     */
    private String sex;

    /**
     * @column email
     * @desc 
     */
    private String email;

    /**
     * @column mobile
     * @desc 手机
     */
    private String mobile;

    /**
     * @column status
     * @desc 用户状态 0无效 1 有效
     */
    private String status;

    /**
     * @column hire_date
     * @desc 入职时间
     */
    private String hireDate;

    /**
     * @column create_time
     * @desc 
     */
    private Date createTime;

    /**
     * @column update_time
     * @desc 
     */
    private Date updateTime;

    /**
     * @column job
     * @desc 职务
     */
    private String job;

    /**
     * @column health_pic
     * @desc 健康证
     */
    private String healthPic;

    /**
     * @column standard_culture
     * @desc 文化程度
     */
    private String standardCulture;

    /**
     * @column province_code
     * @desc 
     */
    private String provinceCode;

    /**
     * @column province
     * @desc 省
     */
    private String province;

    /**
     * @column city_code
     * @desc 
     */
    private String cityCode;

    /**
     * @column city
     * @desc 市
     */
    private String city;

    /**
     * @column county_code
     * @desc 
     */
    private String countyCode;

    /**
     * @column county
     * @desc 县
     */
    private String county;

    /**
     * @column address
     * @desc 详细地址
     */
    private String address;

    /**
     * @column is_delete
     * @desc 是否删除  1是 0否
     */
    private String isDelete;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpic() {
        return userpic;
    }

    public void setUserpic(String userpic) {
        this.userpic = userpic;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getHealthPic() {
        return healthPic;
    }

    public void setHealthPic(String healthPic) {
        this.healthPic = healthPic;
    }

    public String getStandardCulture() {
        return standardCulture;
    }

    public void setStandardCulture(String standardCulture) {
        this.standardCulture = standardCulture;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }
}