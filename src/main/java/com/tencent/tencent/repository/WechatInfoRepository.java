package com.tencent.tencent.repository;

import com.tencent.tencent.domain.WechatInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WechatInfoRepository extends JpaRepository<WechatInfo,Integer> {
    List<WechatInfo> findByUsernumber(String number);

}
