package com.bdlbsc.government.entity;

import java.util.Date;

/**
 * government_dbAddress 政府和级联地址的关联表
 * @author liushuai 2020-09-25
 */
public class GovernmentDbaddress {
    /**
     * @column id
     * @desc 
     * @required true
     */
    private String id;

    /**
     * @column government_id
     * @desc 政府id
     * @required true
     */
    private Long governmentId;

    /**
     * @column address_id
     * @desc 具体地址的id
     */
    private String addressId;

    /**
     * @column address_name
     * @desc 具体地址名称
     */
    private String addressName;

    /**
     * @column level
     * @desc 地址的等级
     */
    private String level;

    /**
     * @column creator
     * @desc 创建人
     */
    private String creator;

    /**
     * @column create_time
     * @desc 创建时间
     */
    private Date createTime;

    /**
     * @column update_time
     * @desc 更新时间（用户每次登录都会刷新此时间）
     */
    private Date updateTime;

    /**
     * @column province_id
     * @desc 省码
     */
    private String provinceId;

    /**
     * @column province_name
     * @desc 
     */
    private String provinceName;

    /**
     * @column city_id
     * @desc 市码
     */
    private String cityId;

    /**
     * @column city_name
     * @desc 
     */
    private String cityName;

    /**
     * @column county_id
     * @desc 县码
     */
    private String countyId;

    /**
     * @column county_name
     * @desc 
     */
    private String countyName;

    /**
     * @column street_id
     * @desc 街道id
     */
    private String streetId;

    /**
     * @column street_name
     * @desc 
     */
    private String streetName;

    /**
     * @column community_id
     * @desc 社区id
     */
    private String communityId;

    /**
     * @column community_name
     * @desc 
     */
    private String communityName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getGovernmentId() {
        return governmentId;
    }

    public void setGovernmentId(Long governmentId) {
        this.governmentId = governmentId;
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
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

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountyId() {
        return countyId;
    }

    public void setCountyId(String countyId) {
        this.countyId = countyId;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getStreetId() {
        return streetId;
    }

    public void setStreetId(String streetId) {
        this.streetId = streetId;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCommunityId() {
        return communityId;
    }

    public void setCommunityId(String communityId) {
        this.communityId = communityId;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }
}