package com.bdlbsc.government.mapper;

import com.bdlbsc.government.entity.UserOrganization;
import java.util.List;

public interface UserOrganizationMapper {
    /**
     *
     * @mbg.generated 2020-09-25
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2020-09-25
     */
    int insert(UserOrganization record);

    /**
     *
     * @mbg.generated 2020-09-25
     */
    UserOrganization selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2020-09-25
     */
    List<UserOrganization> selectAll();

    /**
     *
     * @mbg.generated 2020-09-25
     */
    int updateByPrimaryKey(UserOrganization record);
}