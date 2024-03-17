package com.yash.priceservicetotal.dto;

import com.yash.priceservicetotal.domain.ProductCartItem;
import lombok.Data;

import java.util.List;

@Data
public class TotalPriceServiceRequest {
    private long cartId;
    private long paymentId;
    private String cartCategory;
    private List<ProductCartItem> productCartItems;
}
