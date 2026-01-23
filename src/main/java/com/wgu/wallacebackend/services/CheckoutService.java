package com.wgu.wallacebackend.services;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
