package com.tencent.tencent.repository;

import com.tencent.tencent.domain.Record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RecordRepository extends JpaRepository<Record,Integer> {
 @Query(value = " select count(*)from (select DISTINCT CARDNO,CARDID from jour_list where JDATETIME > ?1 AND CompCode=?2) as d",nativeQuery = true)
    Integer getCount(String JDATETIME,String CompCode);
}
