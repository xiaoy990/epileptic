package com.join.epileptic.controller.hzhInborn;

import com.join.epileptic.entity.hzhInborn.HzhInborn;
import com.join.epileptic.service.hzhInborn.HzhInbornService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author:ljx
 * @Date:2019/11/28
 * @Description:
 */
@Controller
@CrossOrigin
@RequestMapping("/hzhInborn")
public class HzhInbornController {
    @Autowired
    HzhInbornService hzhInbornService;

    @RequestMapping("/insert")
    public int insert(@RequestBody HzhInborn hzhInborn){
        return hzhInbornService.insert(hzhInborn);
    }

    @RequestMapping("/listAll")
    public List<HzhInborn> listAll(){
        return hzhInbornService.multiSelect(new HzhInborn());
    }

    @RequestMapping("/updateById")
    public int updateById(@RequestBody HzhInborn hzhInborn){
        return hzhInbornService.updateById(hzhInborn);
    }

    @RequestMapping("/deleteById")
    public int deleteById(@RequestBody int id){
        return hzhInbornService.deleteById(id);
    }
}
