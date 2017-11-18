package com.tencent.tencent.repository;

import com.tencent.tencent.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UsersRepository extends JpaRepository<Users,Integer>{
    Users findByIdserial(String number);
}
