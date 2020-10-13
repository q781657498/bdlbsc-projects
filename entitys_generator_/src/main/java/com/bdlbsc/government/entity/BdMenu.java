package com.bdlbsc.government.entity;

import java.util.Date;

/**
 * bd_menu 菜单权限表
 * @author liushuai 2020-09-25
 */
public class BdMenu {
    /**
     * @column menu_id
     * @desc 菜单ID
     * @required true
     */
    private Long menuId;

    /**
     * @column menu_name
     * @desc 菜单名称
     * @required true
     */
    private String menuName;

    /**
     * @column parent_id
     * @desc 父菜单ID
     */
    private Long parentId;

    /**
     * @column order_num
     * @desc 显示顺序
     */
    private Integer orderNum;

    /**
     * @column url
     * @desc 请求地址
     */
    private String url;

    /**
     * @column menu_type
     * @desc 菜单类型（M目录 C菜单 F按钮）
     */
    private String menuType;

    /**
     * @column visible
     * @desc 菜单状态（0显示 1隐藏）
     */
    private String visible;

    /**
     * @column perms
     * @desc 权限标识
     */
    private String perms;

    /**
     * @column icon
     * @desc 菜单图标
     */
    private String icon;

    /**
     * @column create_by
     * @desc 创建者
     */
    private String createBy;

    /**
     * @column create_time
     * @desc 创建时间
     */
    private Date createTime;

    /**
     * @column update_by
     * @desc 更新者
     */
    private String updateBy;

    /**
     * @column update_time
     * @desc 更新时间
     */
    private Date updateTime;

    /**
     * @column remark
     * @desc 备注
     */
    private String remark;

    /**
     * @column organization_id
     * @desc 组织id
     */
    private String organizationId;

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType;
    }

    public String getVisible() {
        return visible;
    }

    public void setVisible(String visible) {
        this.visible = visible;
    }

    public String getPerms() {
        return perms;
    }

    public void setPerms(String perms) {
        this.perms = perms;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }
}