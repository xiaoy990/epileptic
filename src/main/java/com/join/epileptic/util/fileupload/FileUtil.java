package com.join.epileptic.util.fileupload;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @author xiaoy990
 * 功能：存储文件
 */
@Component
public class FileUtil {

    //从配置文件中读取地址 方便多环境
    @Value("${headPicPath}")
    private String filePath;

    public String saveFile(MultipartFile multipartFile){
        //尝试创建目录
        File file = new File(filePath);
        if(!file.exists()){
            if (!file.mkdirs()) try {
                throw new Exception("makeDir failure");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        //help to get the file's type
        StringBuilder stringBuilder = new StringBuilder();
        int begin = multipartFile.getOriginalFilename().lastIndexOf(".");
        int end = multipartFile.getOriginalFilename().length();
        //为文件指定路径并更名为路径+UUID+文件类型
        UUID uuid = UUID.randomUUID();
        StringBuilder sb = stringBuilder.append(filePath).append(uuid.toString()).append(multipartFile.getOriginalFilename(), begin, end);
        String fileUrl = sb.toString();
        //尝试存储
        try {
            multipartFile.transferTo(new File(fileUrl));
        } catch (IOException e) {
            e.printStackTrace();
        }
        //返回文件地址
        return fileUrl;
    }
}
