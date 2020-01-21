package com.join.epileptic.controller.hzhDiagnoseController;

import com.join.epileptic.entity.hzhDiagnose.HzhDiagnose;
import com.join.epileptic.entity.hzhDiagnose.HzhDiagnoseDto;
import com.join.epileptic.entity.hzhGeneral.HzhGeneral;
import com.join.epileptic.service.hzhDiagnoseService.HzhDiagnoseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("diagnose")
public class HzhDiagnoseController {

    @Autowired
    HzhDiagnoseService hzhDiagnoseService;

    @RequestMapping("selectDiagnose")
    public List<HzhDiagnoseDto> multiSelect(HzhDiagnose hzhDiagnose, HzhGeneral hzhGeneral) {
        return hzhDiagnoseService.multiSelect(hzhDiagnose,hzhGeneral);
    }

    @RequestMapping("delDiagnose")
    public void deleteByPrimaryKey(Integer id) {
        hzhDiagnoseService.deleteByPrimaryKey(id);
    }

    @RequestMapping("updateDiagnose")
    public void updateByPrimaryKey(HzhDiagnose hzhGeneral) {
        hzhDiagnoseService.updateByPrimaryKey(hzhGeneral);
    }

    @RequestMapping("insertDiagnose")
    public void insert(HzhDiagnose hzhGeneral) {
        hzhDiagnoseService.insert(hzhGeneral);
    }
}
