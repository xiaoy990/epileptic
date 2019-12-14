package com.join.epileptic.service.hzhAssist;

import com.join.epileptic.entity.hzhAssist.HzhAssist;


import java.util.List;

/**
 * @Author:ljx
 * @Date:2019/11/28
 * @Description:
 */
public interface HzhAssistService {
    int insert(HzhAssist hzhAssist);
    int updateById(HzhAssist hzhAssist);
    int deleteById(int id);
    List<HzhAssist> multiSelect(HzhAssist hzhAssist);
}
