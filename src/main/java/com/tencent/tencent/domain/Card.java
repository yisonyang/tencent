package com.tencent.tencent.domain;

import org.springframework.data.annotation.TypeAlias;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.sql.Date;


@Entity
@Table(name = "card_info")
public class Card {
    @Id
    @GeneratedValue
    private Integer id;
    @NotNull
    private String card_number;
    @NotNull
    private String card_owner;
    @NotNull
    private Date relate_date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCard_number() {
        return card_number;
    }

    public void setCard_number(String card_number) {
        this.card_number = card_number;
    }

    public String getCard_owner() {
        return card_owner;
    }

    public void setCard_owner(String card_owner) {
        this.card_owner = card_owner;
    }

    public Date getRelate_date() {
        return relate_date;
    }

    public void setRelate_date(Date relate_date) {
        this.relate_date = relate_date;
    }
}
