package com.cfs.Weather_App.service;

import com.cfs.Weather_App.Dto.Datatransferpackage.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class weatherservice {

    @Value("${weather.api.key}") //@value-used to read values from properties
    private  String apikey;
    @Value("${weather.api.url}")
    private String apiurl;
    @Value("${weather.api.forecast.url}")
    private String apiForecasturl;

    private RestTemplate template=new RestTemplate(); //Help to consume other APIs

    public WeatherResponse getdata(String city)
    {
        String url=apiurl+"?key="+apikey+"&q="+city;
        Root response=template.getForObject(url, Root.class);
        WeatherResponse weatherResponse=new WeatherResponse();
        weatherResponse.setCity(response.getLocation().name);
        weatherResponse.setCondition(response.getCurrent().getCondition().getText());
        weatherResponse.setTemperature(response.getCurrent().temp_c);
        weatherResponse.setCountry(response.getLocation().country);
        weatherResponse.setRegion(response.getLocation().region);
        weatherResponse.setHumidity(response.getCurrent().getHumidity());
        weatherResponse.setLatitude(response.getLocation().lat);
        weatherResponse.setLongitude(response.getLocation().lon);
        weatherResponse.setWindspeed(response.getCurrent().gust_kph);
        return weatherResponse;
    }
    public WeatherForecast getForecast(String city, int days)
    {
        WeatherResponse weatherResponse=getdata(city);
        WeatherForecast weatherForecast=new WeatherForecast();
        List<DayTemp> temp=new ArrayList<>();
        WeatherForecast response=new WeatherForecast();
        response.setWeatherResponse(weatherResponse);
        String url=apiForecasturl+"?key="+apikey+"&q="+city+"&days="+days;
        Root apiresponse=template.getForObject(url, Root.class);
        Forecast forecast=apiresponse.getForecast();
        ArrayList<ForecastDay> forecastDay=forecast.getForecastday();
        for(ForecastDay day: forecastDay)
        {
            DayTemp d=new DayTemp();
            d.setDate(day.getDate());
            d.setMinTemp(day.getDay().getMintemp_c());
            d.setMaxTemp(day.getDay().getMaxtemp_c());
            d.setAvgtemp(day.getDay().getAvgtemp_c());
            temp.add(d);
        }
        response.setDayTemp(temp);
        return  response;
    }

}
