package com.cfs.Weather_App.Dto.Datatransferpackage;

import java.util.ArrayList;

public class Forecast {
    public ArrayList<ForecastDay> forecastday;

    public Forecast() {
    }

    public Forecast(ArrayList<ForecastDay> forecastday) {
        this.forecastday = forecastday;
    }

    public ArrayList<ForecastDay> getForecastday() {
        return forecastday;
    }

    public void setForecastday(ArrayList<ForecastDay> forecastday) {
        this.forecastday = forecastday;
    }
}
