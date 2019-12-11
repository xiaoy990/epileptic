package com.join.epileptic.mapper.hzhFlup;

import com.join.epileptic.entity.hzhFlup.HzhFlup;
import com.join.epileptic.entity.hzhFlup.HzhFlupDto;
import com.join.epileptic.entity.hzhFlup.HzhFlupExample;
import com.join.epileptic.entity.hzhGeneral.HzhGeneral;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.join.epileptic.mapper.MyBatisBaseDao;

import java.util.List;

/**
 * HzhFlupMapper继承基类
 */
@Repository
public interface HzhFlupMapper extends MyBatisBaseDao<HzhFlup, Integer, HzhFlupExample> {
    List<HzhFlupDto> multiSelect(@Param("hzhFlup")HzhFlup hzhFlup, @Param("hzhGeneral")HzhGeneral hzhGeneral);
}