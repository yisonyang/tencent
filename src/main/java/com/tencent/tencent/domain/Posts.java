package com.tencent.tencent.domain;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.sql.Date;

@Entity
@Table(name="card_news")
public class Posts {
    @Id
    @GeneratedValue
    private Integer id;
    @NotNull
    private String title="";
    @NotNull
    private Date postDate=null;
    @NotNull
    private String content="";
    private String uoloader="";

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUoloader() {
        return uoloader;
    }

    public void setUoloader(String uoloader) {
        this.uoloader = uoloader;
    }
}
