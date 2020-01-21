package com.join.epileptic.service.hzhFlupService;

import com.join.epileptic.entity.hzhFlup.HzhFlup;
import com.join.epileptic.entity.hzhFlup.HzhFlupDto;
import com.join.epileptic.entity.hzhGeneral.HzhGeneral;

import java.util.List;

public interface HzhFlupService {
    List<HzhFlupDto> multiSelect(HzhFlup hzhTreat, HzhGeneral hzhGeneral);
    void deleteByPrimaryKey(Integer id);
    void updateByPrimaryKey(HzhFlup hzhFlup);
    void insert(HzhFlup hzhFlup);
}
