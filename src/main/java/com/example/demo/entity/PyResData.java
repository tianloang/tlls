package com.example.demo.entity;

import java.util.Date;

public class PyResData {


    private Long id;
    private String Name;
    private String Ztream;
    private String Ktream;
    private String odd;
    private String time;
    private String Zgrade;
    private String Kgrade;
    private String Bigodd;
    private String smodd;
    private String matchId;
    private Date createTime;
    private Date countTime;
    private String money;
    private String status;

    public String getZtream() {
        return Ztream;
    }

    public void setZtream(String ztream) {
        Ztream = ztream;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCountTime() {
        return countTime;
    }

    public void setCountTime(Date countTime) {
        this.countTime = countTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getMatchId() {
        return matchId;
    }

    public void setMatchId(String matchId) {
        this.matchId = matchId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getzName() {
        return Ztream;
    }

    public void setzName(String zName) {
        Ztream = zName;
    }

    public String getKtream() {
        return Ktream;
    }

    public void setKtream(String ktream) {
        Ktream = ktream;
    }

    public String getOdd() {
        return odd;
    }

    public void setOdd(String odd) {
        this.odd = odd;
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

    public String getBigodd() {
        return Bigodd;
    }

    public void setBigodd(String bigodd) {
        Bigodd = bigodd;
    }

    public String getSmodd() {
        return smodd;
    }

    public void setSmodd(String smodd) {
        this.smodd = smodd;
    }


}
