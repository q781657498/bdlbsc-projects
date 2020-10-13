package com.bdlbsc.government.mapper;

import com.bdlbsc.government.entity.GovernmentDbaddress;
import java.util.List;

public interface GovernmentDbaddressMapper {
    /**
     *
     * @mbg.generated 2020-09-25
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2020-09-25
     */
    int insert(GovernmentDbaddress record);

    /**
     *
     * @mbg.generated 2020-09-25
     */
    GovernmentDbaddress selectByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2020-09-25
     */
    List<GovernmentDbaddress> selectAll();

    /**
     *
     * @mbg.generated 2020-09-25
     */
    int updateByPrimaryKey(GovernmentDbaddress record);
}