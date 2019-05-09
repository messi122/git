package com.example.email.controller;

import com.example.email.utils.MailUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @ClassName: com.example.email.controller
 * @Author: yuyong
 * @CreateDate: 2018/11/7 18:20
 * @UpdateUser:
 * @UpdateDate: 2018/11/7 18:20
 * @UpdateRemark:
 * @Version: 1.0
 * @since JDK 1.8
 */
@RestController
public class SendController {
    @Autowired
    private MailUtils mailUtils;

    @RequestMapping(value = "/send")
    public String send() throws Exception{
        mailUtils.sendVerifyEmailMail("1103023317@qq.com","10086");
        mailUtils.sendSimpleMail("1103023317@qq.com");
        return "SUESCESS";
    }

}
