package com.nglogin.demo.service.impl;

import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
import com.nglogin.demo.service.IQuartzTestService;
import lombok.extern.log4j.Log4j2;

/**
 * @author daqun.gong
 * @version 1.0
 * @date 2019/9/22
 */
@Log4j2
public class QuartzTestServiceImpl implements IQuartzTestService {

    @Override
    public void doSomething() {
        //TODO
       log.info("here do sign login in;now is "+ DateUtil.now());
    }
}
