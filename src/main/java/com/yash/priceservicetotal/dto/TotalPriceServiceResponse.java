package com.yash.priceservicetotal.dto;

import lombok.Data;

@Data
public class TotalPriceServiceResponse {
    private long paymentId;
    private long cartId;
    private double totalPrice;
}
