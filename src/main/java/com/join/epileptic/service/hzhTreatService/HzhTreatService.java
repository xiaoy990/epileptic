package com.join.epileptic.service.hzhTreatService;

import com.join.epileptic.entity.hzhGeneral.HzhGeneral;
import com.join.epileptic.entity.hzhTreat.HzhTreat;
import com.join.epileptic.entity.hzhTreat.HzhTreatDto;

import java.util.List;

public interface HzhTreatService {
    List<HzhTreatDto> multiSelect(HzhTreat hzhTreat, HzhGeneral hzhGeneral);
    void deleteByPrimaryKey(Integer id);
    void updateByPrimaryKey(HzhTreat hzhTreat);
    void insert(HzhTreat hzhTreat);
}
