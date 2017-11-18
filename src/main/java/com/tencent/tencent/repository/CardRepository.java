package com.tencent.tencent.repository;

import com.tencent.tencent.domain.Card;
import org.omg.PortableInterceptor.INACTIVE;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CardRepository extends JpaRepository<Card,Integer> {

}
