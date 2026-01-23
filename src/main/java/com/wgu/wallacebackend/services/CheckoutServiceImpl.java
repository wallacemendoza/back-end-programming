package com.wgu.wallacebackend.services;

import com.wgu.wallacebackend.dao.CustomerRepository;
import com.wgu.wallacebackend.entities.Cart;
import com.wgu.wallacebackend.entities.CartItem;
import com.wgu.wallacebackend.entities.Customer;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;
import java.util.UUID;

@Service
public class CheckoutServiceImpl implements CheckoutService {

    private final CustomerRepository customerRepository;

    public CheckoutServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    @Transactional
    public PurchaseResponse placeOrder(Purchase purchase) {

        Cart cart = purchase.getCart();
        Customer customer = purchase.getCustomer();
        Set<CartItem> cartItems = purchase.getCartItems();

        String orderTrackingNumber = UUID.randomUUID().toString();
        cart.setOrderTrackingNumber(orderTrackingNumber);

        cartItems.forEach(item -> {
            item.setCart(cart);
            cart.getCartItems().add(item);
        });

        customer.getCarts().add(cart);
        cart.setCustomer(customer);

        customerRepository.save(customer);

        return new PurchaseResponse(orderTrackingNumber);
    }
}
