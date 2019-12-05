package com.join.epileptic.mapper.hzhDiagnose;

import com.join.epileptic.entity.hzhDiagnose.HzhDiagnose;
import com.join.epileptic.entity.hzhDiagnose.HzhDiagnoseDto;
import com.join.epileptic.entity.hzhDiagnose.HzhDiagnoseExample;
import com.join.epileptic.entity.hzhGeneral.HzhGeneral;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.join.epileptic.mapper.MyBatisBaseDao;

import java.util.List;

/**
 * HzhDiagnoseMapper继承基类
 */
@Repository
public interface HzhDiagnoseMapper extends MyBatisBaseDao<HzhDiagnose, Integer, HzhDiagnoseExample> {
    List<HzhDiagnoseDto> multiSelect(@Param("hzhDiagnose") HzhDiagnose hzhDiagnose, @Param("hzhGeneral")HzhGeneral hzhGeneral);
}