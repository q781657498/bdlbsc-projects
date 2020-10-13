package com.bdlbsc.government.mapper;

import com.bdlbsc.government.entity.BdRole;
import java.util.List;

public interface BdRoleMapper {
    /**
     *
     * @mbg.generated 2020-09-25
     */
    int deleteByPrimaryKey(Long roleId);

    /**
     *
     * @mbg.generated 2020-09-25
     */
    int insert(BdRole record);

    /**
     *
     * @mbg.generated 2020-09-25
     */
    BdRole selectByPrimaryKey(Long roleId);

    /**
     *
     * @mbg.generated 2020-09-25
     */
    List<BdRole> selectAll();

    /**
     *
     * @mbg.generated 2020-09-25
     */
    int updateByPrimaryKey(BdRole record);
}