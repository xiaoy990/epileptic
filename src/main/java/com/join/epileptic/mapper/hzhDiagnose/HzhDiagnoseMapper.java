package com.join.epileptic.mapper.hzhDiagnose;

import com.join.epileptic.entity.hzhDiagnose.HzhDiagnose;
import com.join.epileptic.entity.hzhDiagnose.HzhDiagnoseExample;
import org.springframework.stereotype.Repository;
import com.join.epileptic.mapper.MyBatisBaseDao;

/**
 * HzhDiagnoseMapper继承基类
 */
@Repository
public interface HzhDiagnoseMapper extends MyBatisBaseDao<HzhDiagnose, Integer, HzhDiagnoseExample> {
}