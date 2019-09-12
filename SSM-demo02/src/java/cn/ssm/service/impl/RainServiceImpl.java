package cn.ssm.service.impl;

import cn.ssm.mapper.RainMapper;
import cn.ssm.pojo.RainQuality;
import cn.ssm.service.RainService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RainServiceImpl implements RainService {

    @Resource
    private RainMapper rainMapper;

    public List<RainQuality> rainList() {
        return rainMapper.rainList();
    }
}
