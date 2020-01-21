package com.join.epileptic.service.hzhIllnerssed;

import com.join.epileptic.entity.hzhGeneral.HzhGeneral;
import com.join.epileptic.entity.hzhIllnerssed.HzhIllnerssed;
import com.join.epileptic.entity.hzhIllnerssed.HzhIllnerssedDto;
import com.join.epileptic.mapper.hzhIllnerssed.HzhIllnerssedMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author:ljx
 * @Date:2019/11/28
 * @Description:
 */
public interface HzhIllnerssedService {
    int insert(HzhIllnerssed hzhIllnerssed);
    int updateById(HzhIllnerssed hzhIllnerssed);
    int deleteById(int id);
    List<HzhIllnerssedDto> multiSelect(HzhIllnerssed hzhIllnerssed, HzhGeneral hzhGeneral);
}
