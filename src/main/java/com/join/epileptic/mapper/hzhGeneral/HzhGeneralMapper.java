package com.join.epileptic.mapper.hzhGeneral;

import com.join.epileptic.entity.hzhGeneral.HzhGeneral;
import com.join.epileptic.entity.hzhGeneral.HzhGeneralExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.join.epileptic.mapper.MyBatisBaseDao;

import java.util.List;

/**
 * HzhGeneralMapper继承基类
 */

@Repository
public interface HzhGeneralMapper extends MyBatisBaseDao<HzhGeneral, Integer, HzhGeneralExample> {
    List<HzhGeneral> multiSelect(@Param("hzhGeneral") HzhGeneral hzhGeneral);
}