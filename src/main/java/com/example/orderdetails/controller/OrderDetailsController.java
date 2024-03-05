package com.example.orderdetails.controller;

import com.example.orderdetails.model.Order;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderDetailsController {

    @PostMapping("/order-details")
    public void validate(@RequestBody Order order) {
        //TODO validate order
    }
}
