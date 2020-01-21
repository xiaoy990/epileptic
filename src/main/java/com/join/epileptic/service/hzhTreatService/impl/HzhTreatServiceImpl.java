package com.join.epileptic.service.hzhTreatService.impl;

import com.join.epileptic.entity.hzhGeneral.HzhGeneral;
import com.join.epileptic.entity.hzhTreat.HzhTreat;
import com.join.epileptic.entity.hzhTreat.HzhTreatDto;
import com.join.epileptic.mapper.hzhTreat.HzhTreatMapper;
import com.join.epileptic.service.hzhTreatService.HzhTreatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HzhTreatServiceImpl implements HzhTreatService {

    @Autowired
    HzhTreatMapper hzhTreatMapper;

    @Override
    public List<HzhTreatDto> multiSelect(HzhTreat hzhTreat, HzhGeneral hzhGeneral) {
        return hzhTreatMapper.multiSelect(hzhTreat,hzhGeneral);
    }

    @Override
    public void deleteByPrimaryKey(Integer id) {
        hzhTreatMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void updateByPrimaryKey(HzhTreat hzhTreat) {
        hzhTreatMapper.updateByPrimaryKey(hzhTreat);
    }

    @Override
    public void insert(HzhTreat hzhTreat) {
        hzhTreatMapper.insert(hzhTreat);
    }
}
