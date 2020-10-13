package com.bdlbsc.government.entity;

/**
 * bd_role_menu 
 * @author liushuai 2020-09-25
 */
public class BdRoleMenu {
    /**
     * @column role_id
     * @desc 角色id
     * @required true
     */
    private Long roleId;

    /**
     * @column menu_id
     * @desc 菜单id
     * @required true
     */
    private Long menuId;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }
}