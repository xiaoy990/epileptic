package com.join.epileptic.service.hzhFlupService.impl;

import com.join.epileptic.entity.hzhFlup.HzhFlup;
import com.join.epileptic.entity.hzhFlup.HzhFlupDto;
import com.join.epileptic.entity.hzhGeneral.HzhGeneral;
import com.join.epileptic.mapper.hzhFlup.HzhFlupMapper;
import com.join.epileptic.service.hzhFlupService.HzhFlupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HzhFlupServiceImpl implements HzhFlupService {

    @Autowired
    HzhFlupMapper hzhFlupMapper;

    @Override
    public List<HzhFlupDto> multiSelect(HzhFlup hzhTreat, HzhGeneral hzhGeneral) {
        return hzhFlupMapper.multiSelect(hzhTreat,hzhGeneral);
    }

    @Override
    public void deleteByPrimaryKey(Integer id) {
        hzhFlupMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void updateByPrimaryKey(HzhFlup hzhFlup) {
        hzhFlupMapper.updateByPrimaryKey(hzhFlup);
    }

    @Override
    public void insert(HzhFlup hzhFlup) {
        hzhFlupMapper.insert(hzhFlup);
    }
}
