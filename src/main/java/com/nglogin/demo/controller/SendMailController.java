package com.nglogin.demo.controller;

import cn.hutool.extra.mail.MailUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author daqun.gong
 * @version 1.0
 * @date 2019/9/22
 */
@RestController
@RequestMapping("/mail")
public class SendMailController {

    @GetMapping(value = "/send")
    public String sendMail(@RequestParam String content){
        MailUtil.send("632781475@qq.com", "测试定时签到邮件", content, false);
//        MailUtil.send("gdq1991@126.com", "测试定时签到邮件", content, false);
        return "OK";
    }

    @GetMapping(value = "/test")
    public String test(){
        return "TEST";
    }
}
