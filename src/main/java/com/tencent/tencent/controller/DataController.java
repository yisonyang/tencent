package com.tencent.tencent.controller;

import com.tencent.tencent.domain.Users;
import com.tencent.tencent.domain.WechatInfo;
import com.tencent.tencent.repository.PostsRepository;
import com.tencent.tencent.repository.UsersRepository;
import com.tencent.tencent.repository.WechatInfoRepository;
import com.tencent.tencent.service.DataService;
import org.apache.tomcat.jni.Time;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.handler.UserRoleAuthorizationInterceptor;

import javax.persistence.Entity;
import java.util.Calendar;
import java.util.Date;

@Controller
public class DataController {
    @Autowired
    private DataService dataService;
    @Autowired
    private PostsRepository postsRepository;
    @Autowired
    private WechatInfoRepository wechatInfoRepository;
    @Autowired
    private UsersRepository usersRepository;
    private Users users;
    @RequestMapping("bathNumber")
    @ResponseBody
    public String bathNumber(){
      Integer number=dataService.getNumber("0044");
      return String.valueOf(number);
    }
    @RequestMapping("transiden")
    @ResponseBody
    public void getIden(@RequestBody WechatInfo wechatInfo){
        System.out.print(wechatInfo.getProvince());
        System.out.print(wechatInfo.getOpenid());
       users=usersRepository.findByIdserial(wechatInfo.getUsernumber());
        wechatInfo.setUsername(users.getUsername());
        wechatInfoRepository.save(wechatInfo);
    }
}
