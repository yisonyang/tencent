package com.tencent.tencent.service;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.tencent.tencent.domain.Posts;
import com.tencent.tencent.repository.PostsRepository;
import com.tencent.tencent.repository.RecordRepository;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.rmi.log.LogInputStream;

import java.lang.ref.SoftReference;
import java.net.ServerSocket;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Service
public class DataService {
    @Autowired
    private RecordRepository recordRepository;
    @Autowired
    private PostsRepository postsRepository;
    public String getTime(){
        Calendar calendar=Calendar.getInstance();
        calendar.add(Calendar.MINUTE,-10);
        String lastTime=new SimpleDateFormat("yyyyMMddHHmmss").format(calendar.getTime());
        return lastTime;
    }
    public Integer getNumber(String CompCode){
        Integer number=recordRepository.getCount("20170112000000 ",CompCode);
        return number;
    }

}
