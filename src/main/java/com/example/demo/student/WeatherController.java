package com.example.demo.student;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class WeatherController {

    @PostMapping
    public Weather getWeather(@RequestBody Weather todayWeather) {
        return null;
    }

}
