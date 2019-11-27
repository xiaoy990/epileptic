package com.join.epileptic.mapper.hzhTreat;

import com.join.epileptic.entity.hzhTreat.HzhTreat;
import com.join.epileptic.entity.hzhTreat.HzhTreatExample;
import org.springframework.stereotype.Repository;
import com.join.epileptic.mapper.MyBatisBaseDao;
/**
 * HzhTreatMapper继承基类
 */
@Repository
public interface HzhTreatMapper extends MyBatisBaseDao<HzhTreat, Integer, HzhTreatExample> {
}