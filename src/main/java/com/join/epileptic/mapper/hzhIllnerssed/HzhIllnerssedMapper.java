package com.join.epileptic.mapper.hzhIllnerssed;

import com.join.epileptic.entity.hzhIllnerssed.HzhIllnerssed;
import com.join.epileptic.entity.hzhIllnerssed.HzhIllnerssedExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.join.epileptic.mapper.MyBatisBaseDao;

import java.util.List;

/**
 * HzhIllnerssedMapper继承基类
 */
@Repository
public interface HzhIllnerssedMapper extends MyBatisBaseDao<HzhIllnerssed, Integer, HzhIllnerssedExample> {
    List<HzhIllnerssed> multiSelect(@Param("hzhIllnerssed") HzhIllnerssed hzhIllnerssed);
}