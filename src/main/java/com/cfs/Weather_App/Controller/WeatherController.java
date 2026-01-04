package com.cfs.Weather_App.Controller;

import com.cfs.Weather_App.Dto.Datatransferpackage.WeatherForecast;
import com.cfs.Weather_App.Dto.Datatransferpackage.WeatherResponse;
import com.cfs.Weather_App.service.weatherservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weather")
@CrossOrigin
public class WeatherController {
    @Autowired
    private weatherservice weatherservice;

    @GetMapping("/my/{city}")
    public WeatherResponse getWeather(@PathVariable String city)
    {
        return weatherservice.getdata(city);
    }
    @GetMapping("/forecast")
    public WeatherForecast getForecast(@RequestParam String city, @RequestParam int days)
    {
        return weatherservice.getForecast(city,days);
    }
}
