package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;


public class PyData implements Serializable {


    private Long id;
    private String title;
    private String Ztream;
    private String Ktream;
    private String bigOddName;
    private String time;
    private String Zgrade;
    private String Kgrade;
    private String bigOdds;
    private String smOdds;
    private Date createTime;
    private String matchTime;
    private String odd;

    private String name;
    private String iphone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIphone() {
        return iphone;
    }

    public void setIphone(String iphone) {
        this.iphone = iphone;
    }

    public String getOdd() {
        return odd;
    }

    public void setOdd(String odd) {
        this.odd = odd;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getZtream() {
        return Ztream;
    }

    public void setZtream(String ztream) {
        Ztream = ztream;
    }

    public String getKtream() {
        return Ktream;
    }

    public void setKtream(String ktream) {
        Ktream = ktream;
    }

    public String getBigOddName() {
        return bigOddName;
    }

    public void setBigOddName(String bigOddName) {
        this.bigOddName = bigOddName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getZgrade() {
        return Zgrade;
    }

    public void setZgrade(String zgrade) {
        Zgrade = zgrade;
    }

    public String getKgrade() {
        return Kgrade;
    }

    public void setKgrade(String kgrade) {
        Kgrade = kgrade;
    }

    public String getBigOdds() {
        return bigOdds;
    }

    public void setBigOdds(String bigOdds) {
        this.bigOdds = bigOdds;
    }

    public String getSmOdds() {
        return smOdds;
    }

    public void setSmOdds(String smOdds) {
        this.smOdds = smOdds;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setMatchTime(String matchTime) {
        this.matchTime = matchTime;
    }

    public String getMatchTime() {
        return matchTime;
    }
}
