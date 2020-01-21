package com.join.epileptic.controller.hzhFlupController;

import com.join.epileptic.entity.hzhFlup.HzhFlup;
import com.join.epileptic.entity.hzhFlup.HzhFlupDto;
import com.join.epileptic.entity.hzhGeneral.HzhGeneral;
import com.join.epileptic.service.hzhFlupService.HzhFlupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("flup")
public class HzhFlupController {
    @Autowired
    HzhFlupService hzhFlupService;

    @RequestMapping("selectFlup")
    public List<HzhFlupDto> multiSelect(HzhFlup hzhTreat, HzhGeneral hzhGeneral) {
        return hzhFlupService.multiSelect(hzhTreat,hzhGeneral);
    }

    @RequestMapping("delFlup")
    public void deleteByPrimaryKey(Integer id) {
        hzhFlupService.deleteByPrimaryKey(id);
    }

    @RequestMapping("updateFlup")
    public void updateByPrimaryKey(HzhFlup hzhFlup) {
        hzhFlupService.updateByPrimaryKey(hzhFlup);
    }

    @RequestMapping("insertFlup")
    public void insert(HzhFlup hzhFlup) {
        hzhFlupService.insert(hzhFlup);
    }
}
