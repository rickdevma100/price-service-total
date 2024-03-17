package com.yash.priceservicetotal.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
@Entity
@Data
public class PriceDetails {
    @Id
    private long id;
    private long paymentId;
    private long cartId;
    private String cartCategory;
    private double totalPrice;
}
