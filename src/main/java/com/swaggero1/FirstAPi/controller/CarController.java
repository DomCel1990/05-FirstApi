package com.swaggero1.FirstAPi.controller;

import com.swaggero1.FirstAPi.CarDTO;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.http.HttpResponse;

@RestController
@RequestMapping("/cars")
public class CarController {

    @GetMapping
    public CarDTO getCarDTO() {
        return new CarDTO("123-564-234", "Jeep Compass", 35.000);
    }

    @PostMapping
    public String printCarDTO(@Valid @RequestBody(required = false) CarDTO car) {
        System.out.println(car);
        return HttpStatus.CREATED.getReasonPhrase() + " The HTTP protocol code is:" + HttpStatus.CREATED.value();
    }
}
