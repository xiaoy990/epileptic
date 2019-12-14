package com.join.epileptic.controller.assistController;

import com.join.epileptic.entity.hzhAssist.HzhAssist;
import com.join.epileptic.entity.hzhGeneral.HzhGeneral;
import com.join.epileptic.mapper.hzhGeneral.HzhGeneralMapper;
import com.join.epileptic.util.fileupload.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@CrossOrigin
@RequestMapping("/assist")
public class AssistController_XY {

    @Autowired
    FileUtil fileUtil;

    @Autowired
    HzhGeneralMapper hzhGeneralMapper;

    @RequestMapping("/insertAssist")
    public String insertAssist(HzhAssist hzhAssist, MultipartFile file){
        if (file!=null && !file.isEmpty()){
            String fileUrl = fileUtil.saveFile(file);
            System.out.println(fileUrl);
            hzhAssist.setHeadpic(fileUrl);
        }
        return HttpStatus.OK.toString();
    }

    @RequestMapping("/insertGeneral")
    public void insertGeneral(HzhGeneral hzhGeneral){
        hzhGeneralMapper.insert(hzhGeneral);
    }
}
