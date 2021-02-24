package com.zdh.hm.fthfldev.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Fthfldev)实体类
 *
 * @author xxg
 * @since 2021-02-24 11:24:57
 */
public class Fthfldev implements Serializable {
    private static final long serialVersionUID = -15383363677260365L;

    private String devname;

    private String porttype;

    private Integer devaddr;

    private String colltype;

    private String portid;

    private String baudrate;

    private String fcollect;

    private String compname;

    private Date insttime;

    private Date chktime;

    private Integer collhint;

    private Integer collrint;

    private String status;

    private Date collstat;

    private String userid;

    private String flowunit;

    private String sumfunit;

    private String diffunit;

    private String presunit;

    private String tempunit;

    private String densunit;

    private Integer flowdot;

    private Integer sumfdot;

    private Integer diffdot;

    private Integer presdot;

    private Integer tempdot;

    private Integer densdot;

    private Object dpzero;

    private Object pzero;

    private Object dpcut;

    private Object flowmax;

    private Object flowmin;

    private String owner;

    private Integer chargeDay;


    public String getDevname() {
        return devname;
    }

    public void setDevname(String devname) {
        this.devname = devname;
    }

    public String getPorttype() {
        return porttype;
    }

    public void setPorttype(String porttype) {
        this.porttype = porttype;
    }

    public Integer getDevaddr() {
        return devaddr;
    }

    public void setDevaddr(Integer devaddr) {
        this.devaddr = devaddr;
    }

    public String getColltype() {
        return colltype;
    }

    public void setColltype(String colltype) {
        this.colltype = colltype;
    }

    public String getPortid() {
        return portid;
    }

    public void setPortid(String portid) {
        this.portid = portid;
    }

    public String getBaudrate() {
        return baudrate;
    }

    public void setBaudrate(String baudrate) {
        this.baudrate = baudrate;
    }

    public String getFcollect() {
        return fcollect;
    }

    public void setFcollect(String fcollect) {
        this.fcollect = fcollect;
    }

    public String getCompname() {
        return compname;
    }

    public void setCompname(String compname) {
        this.compname = compname;
    }

    public Date getInsttime() {
        return insttime;
    }

    public void setInsttime(Date insttime) {
        this.insttime = insttime;
    }

    public Date getChktime() {
        return chktime;
    }

    public void setChktime(Date chktime) {
        this.chktime = chktime;
    }

    public Integer getCollhint() {
        return collhint;
    }

    public void setCollhint(Integer collhint) {
        this.collhint = collhint;
    }

    public Integer getCollrint() {
        return collrint;
    }

    public void setCollrint(Integer collrint) {
        this.collrint = collrint;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCollstat() {
        return collstat;
    }

    public void setCollstat(Date collstat) {
        this.collstat = collstat;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getFlowunit() {
        return flowunit;
    }

    public void setFlowunit(String flowunit) {
        this.flowunit = flowunit;
    }

    public String getSumfunit() {
        return sumfunit;
    }

    public void setSumfunit(String sumfunit) {
        this.sumfunit = sumfunit;
    }

    public String getDiffunit() {
        return diffunit;
    }

    public void setDiffunit(String diffunit) {
        this.diffunit = diffunit;
    }

    public String getPresunit() {
        return presunit;
    }

    public void setPresunit(String presunit) {
        this.presunit = presunit;
    }

    public String getTempunit() {
        return tempunit;
    }

    public void setTempunit(String tempunit) {
        this.tempunit = tempunit;
    }

    public String getDensunit() {
        return densunit;
    }

    public void setDensunit(String densunit) {
        this.densunit = densunit;
    }

    public Integer getFlowdot() {
        return flowdot;
    }

    public void setFlowdot(Integer flowdot) {
        this.flowdot = flowdot;
    }

    public Integer getSumfdot() {
        return sumfdot;
    }

    public void setSumfdot(Integer sumfdot) {
        this.sumfdot = sumfdot;
    }

    public Integer getDiffdot() {
        return diffdot;
    }

    public void setDiffdot(Integer diffdot) {
        this.diffdot = diffdot;
    }

    public Integer getPresdot() {
        return presdot;
    }

    public void setPresdot(Integer presdot) {
        this.presdot = presdot;
    }

    public Integer getTempdot() {
        return tempdot;
    }

    public void setTempdot(Integer tempdot) {
        this.tempdot = tempdot;
    }

    public Integer getDensdot() {
        return densdot;
    }

    public void setDensdot(Integer densdot) {
        this.densdot = densdot;
    }

    public Object getDpzero() {
        return dpzero;
    }

    public void setDpzero(Object dpzero) {
        this.dpzero = dpzero;
    }

    public Object getPzero() {
        return pzero;
    }

    public void setPzero(Object pzero) {
        this.pzero = pzero;
    }

    public Object getDpcut() {
        return dpcut;
    }

    public void setDpcut(Object dpcut) {
        this.dpcut = dpcut;
    }

    public Object getFlowmax() {
        return flowmax;
    }

    public void setFlowmax(Object flowmax) {
        this.flowmax = flowmax;
    }

    public Object getFlowmin() {
        return flowmin;
    }

    public void setFlowmin(Object flowmin) {
        this.flowmin = flowmin;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Integer getChargeDay() {
        return chargeDay;
    }

    public void setChargeDay(Integer chargeDay) {
        this.chargeDay = chargeDay;
    }

}
