package com.tencent.tencent.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "jour_list")
public class Record
{
    @Id
    @GeneratedValue
    private Integer id;
    @NotNull
    private String JDATATIME;
    private String CARDNO;
    private String CARDID;
    @NotNull
    private String CompCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJDATATIME() {
        return JDATATIME;
    }

    public void setJDATATIME(String JDATATIME) {
        this.JDATATIME = JDATATIME;
    }

    public String getCARDNO() {
        return CARDNO;
    }

    public void setCARDNO(String CARDNO) {
        this.CARDNO = CARDNO;
    }

    public String getCARDID() {
        return CARDID;
    }

    public void setCARDID(String CARDID) {
        this.CARDID = CARDID;
    }

    public String getCompCode() {
        return CompCode;
    }

    public void setCompCode(String compCode) {
        CompCode = compCode;
    }
}
