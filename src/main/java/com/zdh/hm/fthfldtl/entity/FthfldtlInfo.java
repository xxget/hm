package com.zdh.hm.fthfldtl.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 接口信息实体类
 *
 * @author xxg
 * @since 2021-02-23 11:14:11
 */
public class FthfldtlInfo implements Serializable {
    private static final long serialVersionUID = -87747681728346584L;

    /**
     * 抄表时间
     */
    private Date colltime;
    /**
     * 表网络类型
     */
    private String porttype;
    /**
     * gps卡号码
     */
    private String portid;
    /**
     * 设备逻辑地址（设备号）
     */
    private Integer devaddr;
    /**
     * 密度
     */
    private Object density;
    /**
     * 温度
     */
    private Object tempretu;
    /**
     * 计量压力
     */
    private Object pressure;
    /**
     * 计量差压
     */
    private Object diffpres;
    /**
     * 瞬时流量
     */
    private Object flow;
    /**
     * 累计流量
     */
    private Object sumflow;
    /**
     * 用户id
     */
    private String userid;
    /**
     * 状态
     */
    private String status;
    /**
     * 复述
     */
    private Integer retrycnt;

    private Object prest;

    private Object diffpt;
    /**
     * 诊断信息编码
     */
    private Object resetinfo;
    /**
     * 市电报警
     */
    private Object warninfo;


    public Date getColltime() {
        return colltime;
    }

    public void setColltime(Date colltime) {
        this.colltime = colltime;
    }

    public String getPorttype() {
        return porttype;
    }

    public void setPorttype(String porttype) {
        this.porttype = porttype;
    }

    public String getPortid() {
        return portid;
    }

    public void setPortid(String portid) {
        this.portid = portid;
    }

    public Integer getDevaddr() {
        return devaddr;
    }

    public void setDevaddr(Integer devaddr) {
        this.devaddr = devaddr;
    }

    public Object getDensity() {
        return density;
    }

    public void setDensity(Object density) {
        this.density = density;
    }

    public Object getTempretu() {
        return tempretu;
    }

    public void setTempretu(Object tempretu) {
        this.tempretu = tempretu;
    }

    public Object getPressure() {
        return pressure;
    }

    public void setPressure(Object pressure) {
        this.pressure = pressure;
    }

    public Object getDiffpres() {
        return diffpres;
    }

    public void setDiffpres(Object diffpres) {
        this.diffpres = diffpres;
    }

    public Object getFlow() {
        return flow;
    }

    public void setFlow(Object flow) {
        this.flow = flow;
    }

    public Object getSumflow() {
        return sumflow;
    }

    public void setSumflow(Object sumflow) {
        this.sumflow = sumflow;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getRetrycnt() {
        return retrycnt;
    }

    public void setRetrycnt(Integer retrycnt) {
        this.retrycnt = retrycnt;
    }

    public Object getPrest() {
        return prest;
    }

    public void setPrest(Object prest) {
        this.prest = prest;
    }

    public Object getDiffpt() {
        return diffpt;
    }

    public void setDiffpt(Object diffpt) {
        this.diffpt = diffpt;
    }

    public Object getResetinfo() {
        return resetinfo;
    }

    public void setResetinfo(Object resetinfo) {
        this.resetinfo = resetinfo;
    }

    public Object getWarninfo() {
        return warninfo;
    }

    public void setWarninfo(Object warninfo) {
        this.warninfo = warninfo;
    }

}
