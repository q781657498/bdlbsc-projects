package com.bdlbsc.government.mapper;

import com.bdlbsc.government.entity.OperaterageDbaddress;
import java.util.List;

public interface OperaterageDbaddressMapper {
    /**
     *
     * @mbg.generated 2020-09-25
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2020-09-25
     */
    int insert(OperaterageDbaddress record);

    /**
     *
     * @mbg.generated 2020-09-25
     */
    OperaterageDbaddress selectByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2020-09-25
     */
    List<OperaterageDbaddress> selectAll();

    /**
     *
     * @mbg.generated 2020-09-25
     */
    int updateByPrimaryKey(OperaterageDbaddress record);
}