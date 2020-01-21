package com.join.epileptic.service.hzhDiagnoseService.impl;

import com.join.epileptic.entity.hzhDiagnose.HzhDiagnose;
import com.join.epileptic.entity.hzhDiagnose.HzhDiagnoseDto;
import com.join.epileptic.entity.hzhGeneral.HzhGeneral;
import com.join.epileptic.mapper.hzhDiagnose.HzhDiagnoseMapper;
import com.join.epileptic.service.hzhDiagnoseService.HzhDiagnoseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HzhDiagnoseServiceImpl implements HzhDiagnoseService {

    @Autowired
    HzhDiagnoseMapper hzhDiagnoseMapper;

    @Override
    public List<HzhDiagnoseDto> multiSelect(HzhDiagnose hzhDiagnose, HzhGeneral hzhGeneral) {
        return hzhDiagnoseMapper.multiSelect(hzhDiagnose,hzhGeneral);
    }

    @Override
    public void deleteByPrimaryKey(Integer id) {
        hzhDiagnoseMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void updateByPrimaryKey(HzhDiagnose hzhGeneral) {
        hzhDiagnoseMapper.updateByPrimaryKey(hzhGeneral);
    }

    @Override
    public void insert(HzhDiagnose hzhGeneral) {
        hzhDiagnoseMapper.insert(hzhGeneral);
    }
}
