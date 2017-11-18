package com.tencent.tencent.service;

import com.tencent.tencent.domain.Card;
import com.tencent.tencent.repository.CardRepository;
import com.tencent.tencent.repository.PostsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InfoService {
    @Autowired
    private PostsRepository postsRepository;
    @Autowired
    private CardRepository cardRepository;
    public List getPost() {
        List posts=postsRepository.findAll();
        return posts;
    }
    public List<Card> getLostInfo(){
        return cardRepository.findAll();
    }
}
