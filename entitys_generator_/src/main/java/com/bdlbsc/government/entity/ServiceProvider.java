package com.bdlbsc.government.entity;

import java.util.Date;

/**
 * service_provider 
 * @author liushuai 2020-09-25
 */
public class ServiceProvider {
    /**
     * @column id
     * @desc 主键id
     * @required true
     */
    private Long id;

    /**
     * @column operator_id
     * @desc 运营商id
     */
    private Long operatorId;

    /**
     * @column names
     * @desc 服务商名称
     * @required true
     */
    private String names;

    /**
     * @column logo_url
     * @desc logo地址
     * @required true
     */
    private String logoUrl;

    /**
     * @column shop_contact
     * @desc 商铺电话
     * @required true
     */
    private String shopContact;

    /**
     * @column address
     * @desc 地址
     * @required true
     */
    private String address;

    /**
     * @column address_x
     * @desc 地址经度
     */
    private String addressX;

    /**
     * @column address_y
     * @desc 地址纬度
     */
    private String addressY;

    /**
     * @column hourse_numbers
     * @desc 门牌号
     * @required true
     */
    private String hourseNumbers;

    /**
     * @column classified_management
     * @desc 经营分类
     */
    private String classifiedManagement;

    /**
     * @column business_license_url
     * @desc 营业执照
     * @required true
     */
    private String businessLicenseUrl;

    /**
     * @column business_certificate_
     * @desc 经营许可证
     * @required true
     */
    private String businessCertificate;

    /**
     * @column principle_name
     * @desc 负责人姓名
     * @required true
     */
    private String principleName;

    /**
     * @column principle_contact
     * @desc 负责人联系方式
     * @required true
     */
    private String principleContact;

    /**
     * @column principle_idcard
     * @desc 负责人身份证号码
     * @required true
     */
    private String principleIdcard;

    /**
     * @column create_time
     * @desc 
     * @required true
     */
    private Date createTime;

    /**
     * @column update_time
     * @desc 
     */
    private Date updateTime;

    /**
     * @column is_delete
     * @desc 是否删除
     * @required true
     */
    private String isDelete;

    /**
     * @column status
     * @desc 停用0，启用1
     * @required true
     */
    private String status;

    /**
     * @column manager_name
     * @desc 管理员姓名
     */
    private String managerName;

    /**
     * @column manager_phone
     * @desc 管理员手机号
     */
    private String managerPhone;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getShopContact() {
        return shopContact;
    }

    public void setShopContact(String shopContact) {
        this.shopContact = shopContact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddressX() {
        return addressX;
    }

    public void setAddressX(String addressX) {
        this.addressX = addressX;
    }

    public String getAddressY() {
        return addressY;
    }

    public void setAddressY(String addressY) {
        this.addressY = addressY;
    }

    public String getHourseNumbers() {
        return hourseNumbers;
    }

    public void setHourseNumbers(String hourseNumbers) {
        this.hourseNumbers = hourseNumbers;
    }

    public String getClassifiedManagement() {
        return classifiedManagement;
    }

    public void setClassifiedManagement(String classifiedManagement) {
        this.classifiedManagement = classifiedManagement;
    }

    public String getBusinessLicenseUrl() {
        return businessLicenseUrl;
    }

    public void setBusinessLicenseUrl(String businessLicenseUrl) {
        this.businessLicenseUrl = businessLicenseUrl;
    }

    public String getBusinessCertificate() {
        return businessCertificate;
    }

    public void setBusinessCertificate(String businessCertificate) {
        this.businessCertificate = businessCertificate;
    }

    public String getPrincipleName() {
        return principleName;
    }

    public void setPrincipleName(String principleName) {
        this.principleName = principleName;
    }

    public String getPrincipleContact() {
        return principleContact;
    }

    public void setPrincipleContact(String principleContact) {
        this.principleContact = principleContact;
    }

    public String getPrincipleIdcard() {
        return principleIdcard;
    }

    public void setPrincipleIdcard(String principleIdcard) {
        this.principleIdcard = principleIdcard;
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

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getManagerPhone() {
        return managerPhone;
    }

    public void setManagerPhone(String managerPhone) {
        this.managerPhone = managerPhone;
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