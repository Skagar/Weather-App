package com.cfs.Weather_App.Dto.Datatransferpackage;

import java.time.LocalDate;

public class DayTemp {
    private String date;
    private Double minTemp;
    private Double maxTemp;
    private Double avgtemp;

    public DayTemp(String date, Double minTemp, Double maxTemp, Double avgtemp) {
        this.date = date;
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
        this.avgtemp = avgtemp;
    }

    public DayTemp() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(Double minTemp) {
        this.minTemp = minTemp;
    }

    public Double getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(Double maxTemp) {
        this.maxTemp = maxTemp;
    }

    public Double getAvgtemp() {
        return avgtemp;
    }

    public void setAvgtemp(Double avgtemp) {
        this.avgtemp = avgtemp;
    }
}
