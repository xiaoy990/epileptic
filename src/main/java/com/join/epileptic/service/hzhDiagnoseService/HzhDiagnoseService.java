package com.join.epileptic.service.hzhDiagnoseService;

import com.join.epileptic.entity.hzhDiagnose.HzhDiagnose;
import com.join.epileptic.entity.hzhDiagnose.HzhDiagnoseDto;
import com.join.epileptic.entity.hzhGeneral.HzhGeneral;

import java.util.List;

public interface HzhDiagnoseService {
    List<HzhDiagnoseDto> multiSelect(HzhDiagnose hzhDiagnose, HzhGeneral hzhGeneral);
    void deleteByPrimaryKey(Integer id);
    void updateByPrimaryKey(HzhDiagnose hzhDiagnose);
    void insert(HzhDiagnose hzhDiagnose);
}
