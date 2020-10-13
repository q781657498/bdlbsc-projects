package com.bdlbsc.government.entity;

import java.util.Date;

/**
 * platform_product_category 平台产品类别表
 * @author liushuai 2020-09-25
 */
public class PlatformProductCategory {
    /**
     * @column id
     * @desc 主键id
     * @required true
     */
    private Long id;

    /**
     * @column create_time
     * @desc 创建时间
     */
    private Date createTime;

    /**
     * @column update_time
     * @desc 修改时间
     */
    private Date updateTime;

    /**
     * @column create_id
     * @desc 创建人id
     * @required true
     */
    private Long createId;

    /**
     * @column create_name
     * @desc 创建人名称
     */
    private String createName;

    /**
     * @column classfiy_level
     * @desc 分类级别
     */
    private Long classfiyLevel;

    /**
     * @column classfiy_name
     * @desc 分类名称
     */
    private String classfiyName;

    /**
     * @column parent_id
     * @desc 所属分类（父节点id）
     */
    private Long parentId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getCreateId() {
        return createId;
    }

    public void setCreateId(Long createId) {
        this.createId = createId;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public Long getClassfiyLevel() {
        return classfiyLevel;
    }

    public void setClassfiyLevel(Long classfiyLevel) {
        this.classfiyLevel = classfiyLevel;
    }

    public String getClassfiyName() {
        return classfiyName;
    }

    public void setClassfiyName(String classfiyName) {
        this.classfiyName = classfiyName;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }
}