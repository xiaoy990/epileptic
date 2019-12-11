package com.join.epileptic.mapper.hzhTreat;

import com.join.epileptic.entity.hzhGeneral.HzhGeneral;
import com.join.epileptic.entity.hzhTreat.HzhTreat;
import com.join.epileptic.entity.hzhTreat.HzhTreatDto;
import com.join.epileptic.entity.hzhTreat.HzhTreatExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.join.epileptic.mapper.MyBatisBaseDao;

import java.util.List;

/**
 * HzhTreatMapper继承基类
 */
@Repository
public interface HzhTreatMapper extends MyBatisBaseDao<HzhTreat, Integer, HzhTreatExample> {
    List<HzhTreatDto> multiSelect(@Param("hzhTreat") HzhTreat hzhTreat, @Param("hzhGeneral") HzhGeneral hzhGeneral);
}