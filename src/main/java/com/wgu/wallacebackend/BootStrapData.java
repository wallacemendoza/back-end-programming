package com.wgu.wallacebackend;

import com.wgu.wallacebackend.dao.CustomerRepository;
import com.wgu.wallacebackend.dao.DivisionRepository;
import com.wgu.wallacebackend.entities.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;
    private final DivisionRepository divisionRepository;

    public BootStrapData(CustomerRepository customerRepository, DivisionRepository divisionRepository) {
        this.customerRepository = customerRepository;
        this.divisionRepository = divisionRepository;
    }

    @Override
    public void run(String... args) {

        if (customerRepository.count() <5 ) {

            Customer greg = new Customer();
            greg.setFirstName("Greg");
            greg.setLastName("Watchman");
            greg.setAddress("321 Hard Street");
            greg.setPhone("8888888");
            greg.setPostalCode("77777");
            greg.setDivision(divisionRepository.getReferenceById(2L));
            customerRepository.save(greg);

            Customer lumber = new Customer();
            lumber.setFirstName("Lumber");
            lumber.setLastName("Jack");
            lumber.setAddress("999 Maple Street");
            lumber.setPhone("4444444");
            lumber.setPostalCode("44444");
            lumber.setDivision(divisionRepository.getReferenceById(67L));
            customerRepository.save(lumber);

            Customer georgina = new Customer();
            georgina.setFirstName("Georgina");
            georgina.setLastName("Jeffreys");
            georgina.setAddress("927 Shirley Temple Road");
            georgina.setPhone("9999999");
            georgina.setPostalCode("98765");
            georgina.setDivision(divisionRepository.getReferenceById(3L));
            customerRepository.save(georgina);

            Customer bart = new Customer();
            bart.setFirstName("Bart");
            bart.setLastName("Simpson");
            bart.setAddress("742 Evergreen Terrace");
            bart.setPhone("5546987");
            bart.setPostalCode("11111");
            bart.setDivision(divisionRepository.getReferenceById(12L));
            customerRepository.save(bart);

            Customer sherlock = new Customer();
            sherlock.setFirstName("Sherlock");
            sherlock.setLastName("Holmes");
            sherlock.setAddress("221B Baker Street");
            sherlock.setPhone("1234567");
            sherlock.setPostalCode("12345");
            sherlock.setDivision(divisionRepository.getReferenceById(101L));
            customerRepository.save(sherlock);
        }
    }
}
