package com.join.epileptic.controller.hzhAssist;

import com.join.epileptic.entity.hzhAssist.HzhAssist;
import com.join.epileptic.service.hzhAssist.HzhAssistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author:ljx
 * @Date:2019/11/28
 * @Description:
 */
@RestController
@CrossOrigin
@RequestMapping("/assist")
public class HzhAssistController {
    @Autowired
    HzhAssistService hzhAssistService;

    @RequestMapping("/insert")
    public int insert(@RequestBody HzhAssist hzhAssist){
        return hzhAssistService.insert(hzhAssist);
    }

    @RequestMapping("/selectHzhAssist")
    public List<HzhAssist> listAll(HzhAssist hzhAssist){
        return hzhAssistService.multiSelect(hzhAssist);
    }

    @RequestMapping("/updateById")
    public int updateById(@RequestBody HzhAssist hzhAssist){
        return hzhAssistService.updateById(hzhAssist);
    }

    @RequestMapping("/deleteById")
    public int deleteById(@RequestBody int id){
        return hzhAssistService.deleteById(id);
    }

}
