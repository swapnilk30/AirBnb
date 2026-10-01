package com.example.airbnb.Service.Interfaces;


import com.example.airbnb.Entities.BookingEntity;

public interface CheckoutService {

    String getCheckoutSession(BookingEntity booking, String successUrl, String failureUrl);

}
