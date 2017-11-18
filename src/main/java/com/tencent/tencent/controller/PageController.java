package com.tencent.tencent.controller;

import com.tencent.tencent.domain.Card;
import com.tencent.tencent.domain.Users;
import com.tencent.tencent.repository.UsersRepository;
import com.tencent.tencent.service.DataService;
import com.tencent.tencent.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
public class PageController {
    @Autowired
    private DataService dataService;
    @Autowired
    private InfoService infoService;
    @Autowired
            private UsersRepository usersRepository;
            private Users users;
            HttpSession session;

    @GetMapping("index")
    public String index(@RequestParam("number") String number, HttpServletRequest request,Model model) {
        session=request.getSession();
        session.setAttribute("card_number", number);
        users=usersRepository.findByIdserial(number);
        session.setAttribute("name", users.getUsername());
        model.addAttribute("posts", infoService.getPost());
        return "ka-news";
    }

    @RequestMapping("bath")
    public String bath() {
        return "ge-bathNumber";
    }

    @RequestMapping("user_info")
    public String getInfo(){
        return "info";
    }
    @RequestMapping("lost")
    public String getLost(Model model){
        model.addAttribute("lostList",infoService.getLostInfo());
        return "ka-lose";
    }
    @RequestMapping("iden")
    public String idenGet(@RequestParam("openid")String openid){
        System.out.print(openid);
        return "ka-news";
    }
}