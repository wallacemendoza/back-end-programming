package com.wgu.wallacebackend.services;

import com.wgu.wallacebackend.entities.Cart;
import com.wgu.wallacebackend.entities.CartItem;
import com.wgu.wallacebackend.entities.Customer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Purchase {

    private Customer customer;
    private Cart cart;
    private Set<CartItem> cartItems;
}
