package com.bdlbsc.government.mapper;

import com.bdlbsc.government.entity.EmployUser;
import java.util.List;

public interface EmployUserMapper {
    /**
     *
     * @mbg.generated 2020-09-25
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2020-09-25
     */
    int insert(EmployUser record);

    /**
     *
     * @mbg.generated 2020-09-25
     */
    EmployUser selectByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2020-09-25
     */
    List<EmployUser> selectAll();

    /**
     *
     * @mbg.generated 2020-09-25
     */
    int updateByPrimaryKey(EmployUser record);
}