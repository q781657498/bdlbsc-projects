package com.bdlbsc.government.entity;

/**
 * bd_user_role 
 * @author liushuai 2020-09-25
 */
public class BdUserRole {
    /**
     * @column user_id
     * @desc 用户id
     * @required true
     */
    private String userId;

    /**
     * @column role_id
     * @desc 角色id
     * @required true
     */
    private Long roleId;

    /**
     * @column organization_id
     * @desc 组织id
     */
    private String organizationId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }
}