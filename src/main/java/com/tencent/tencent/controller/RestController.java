package com.tencent.tencent.controller;


import com.tencent.tencent.repository.UsersRepository;
import com.tencent.tencent.repository.WechatInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.soap.SAAJResult;

@Controller
public class RestController {
    @Autowired
    private UsersRepository usersRepository;
    @Autowired
    private WechatInfoRepository wechatInfoRepository;
    @RequestMapping("exist")
    @ResponseBody
    public String isExist(@RequestParam("number") String number){
        System.out.print("exist?number"+number );
         if (wechatInfoRepository.findByUsernumber(number).size()==0){
             return "no";
         }
         else return "exist";
    }
}
