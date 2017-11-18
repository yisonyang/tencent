package com.tencent.tencent.domain;

import groovy.lang.GrabExclude;
import org.hibernate.service.spi.InjectService;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.criteria.CriteriaBuilder;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="users")
public class Users {
    @Id
    @GeneratedValue
    private Integer cardid;
    @NotNull
    private String idserial;
    @NotNull
    private String username;
    @NotNull
    private String idserial1;

    public Integer getCardid() {
        return cardid;
    }

    public void setCardid(Integer cardid) {
        this.cardid = cardid;
    }

    public String getIdserial() {
        return idserial;
    }

    public void setIdserial(String idserial) {
        this.idserial = idserial;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getIdserial1() {
        return idserial1;
    }

    public void setIdserial1(String idserial1) {
        this.idserial1 = idserial1;
    }
}
