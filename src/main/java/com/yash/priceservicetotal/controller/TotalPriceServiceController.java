package com.yash.priceservicetotal.controller;

import com.yash.priceservicetotal.dto.TotalPriceServiceRequest;
import com.yash.priceservicetotal.dto.TotalPriceServiceResponse;
import com.yash.priceservicetotal.service.TotalPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/total-prices")
public class TotalPriceServiceController {
    @Autowired
    private TotalPriceService totalPriceService;
    @GetMapping("/")
    public ResponseEntity<TotalPriceServiceResponse> getTotalPrice(){

        TotalPriceServiceResponse response =
                totalPriceService.calculateTotalPrice();
        return new ResponseEntity<TotalPriceServiceResponse>(response, HttpStatus.OK);
    }
//    @GetMapping("/")
//    public ResponseEntity<TotalPriceServiceResponse> getAllTotalPrices(){
//
//        TotalPriceServiceResponse response =
//                totalPriceService.getAllTotalPrices();
//        return new ResponseEntity<TotalPriceServiceResponse>(response, HttpStatus.CREATED);
//    }

}
