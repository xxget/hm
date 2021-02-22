package com.zdh.hm.historydata.domain;

import java.math.BigDecimal;
import java.util.Date;

public class HistoryData {
    private String standardid;

    private BigDecimal sumflow;

    private BigDecimal flow;

    private BigDecimal pressure;

    private BigDecimal temperature;

    private BigDecimal firstpressure;

    private BigDecimal voltage;

    private Date datatime;

    private Integer bj;

    public String getStandardid() {
        return standardid;
    }

    public void setStandardid(String standardid) {
        this.standardid = standardid;
    }

    public BigDecimal getSumflow() {
        return sumflow;
    }

    public void setSumflow(BigDecimal sumflow) {
        this.sumflow = sumflow;
    }

    public BigDecimal getFlow() {
        return flow;
    }

    public void setFlow(BigDecimal flow) {
        this.flow = flow;
    }

    public BigDecimal getPressure() {
        return pressure;
    }

    public void setPressure(BigDecimal pressure) {
        this.pressure = pressure;
    }

    public BigDecimal getTemperature() {
        return temperature;
    }

    public void setTemperature(BigDecimal temperature) {
        this.temperature = temperature;
    }

    public BigDecimal getFirstpressure() {
        return firstpressure;
    }

    public void setFirstpressure(BigDecimal firstpressure) {
        this.firstpressure = firstpressure;
    }

    public BigDecimal getVoltage() {
        return voltage;
    }

    public void setVoltage(BigDecimal voltage) {
        this.voltage = voltage;
    }

    public Date getDatatime() {
        return datatime;
    }

    public void setDatatime(Date datatime) {
        this.datatime = datatime;
    }

    public Integer getBj() {
        return bj;
    }

    public void setBj(Integer bj) {
        this.bj = bj;
    }
}