package com.bdlbsc.government.entity;

import java.util.Date;

/**
 * user_organization 用户和供应商的关联表
 * @author liushuai 2020-09-25
 */
public class UserOrganization {
    /**
     * @column id
     * @desc 
     * @required true
     */
    private Integer id;

    /**
     * @column user_id
     * @desc 登用户id
     */
    private String userId;

    /**
     * @column org_id
     * @desc 机构id
     */
    private Long orgId;

    /**
     * @column org_name
     * @desc 机构名称
     */
    private String orgName;

    /**
     * @column org_type
     * @desc 机构名称（1运营商，2服务商，3政府）
     */
    private String orgType;

    /**
     * @column org_type_name
     * @desc 
     */
    private String orgTypeName;

    /**
     * @column creator
     * @desc 创建人
     */
    private String creator;

    /**
     * @column create_time
     * @desc 
     * @required true
     */
    private Date createTime;

    /**
     * @column update_time
     * @desc 更新时间（用户每次登录都会刷新此时间）
     */
    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getOrgType() {
        return orgType;
    }

    public void setOrgType(String orgType) {
        this.orgType = orgType;
    }

    public String getOrgTypeName() {
        return orgTypeName;
    }

    public void setOrgTypeName(String orgTypeName) {
        this.orgTypeName = orgTypeName;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
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
}