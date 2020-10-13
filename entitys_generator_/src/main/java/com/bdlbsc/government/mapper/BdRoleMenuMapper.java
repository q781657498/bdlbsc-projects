package com.bdlbsc.government.mapper;

import com.bdlbsc.government.entity.BdRoleMenu;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BdRoleMenuMapper {
    /**
     *
     * @mbg.generated 2020-09-25
     */
    int deleteByPrimaryKey(@Param("roleId") Long roleId, @Param("menuId") Long menuId);

    /**
     *
     * @mbg.generated 2020-09-25
     */
    int insert(BdRoleMenu record);

    /**
     *
     * @mbg.generated 2020-09-25
     */
    List<BdRoleMenu> selectAll();
}