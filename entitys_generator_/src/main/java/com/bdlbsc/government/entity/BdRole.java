package com.bdlbsc.government.entity;

import java.util.Date;

/**
 * bd_role 
 * @author liushuai 2020-09-25
 */
public class BdRole {
    /**
     * @column role_id
     * @desc 
     * @required true
     */
    private Long roleId;

    /**
     * @column role_name
     * @desc 角色名称
     */
    private String roleName;

    /**
     * @column role_code
     * @desc 角色权限字符串
     */
    private String roleCode;

    /**
     * @column description
     * @desc 描述
     */
    private String description;

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
     * @column status
     * @desc 状态（0禁用1启用）
     * @required true
     */
    private String status;

    /**
     * @column remark
     * @desc 备注
     */
    private String remark;

    /**
     * @column create_username
     * @desc 创建人
     */
    private String createUsername;

    /**
     * @column create_userid
     * @desc 创建人id
     */
    private String createUserid;

    /**
     * @column organization_id
     * @desc 组织id
     */
    private String organizationId;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreateUsername() {
        return createUsername;
    }

    public void setCreateUsername(String createUsername) {
        this.createUsername = createUsername;
    }

    public String getCreateUserid() {
        return createUserid;
    }

    public void setCreateUserid(String createUserid) {
        this.createUserid = createUserid;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }
}