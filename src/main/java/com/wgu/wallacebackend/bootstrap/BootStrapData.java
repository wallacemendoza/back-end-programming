package com.wgu.wallacebackend.bootstrap;

import com.wgu.wallacebackend.dao.DivisionRepository;
import com.wgu.wallacebackend.entities.Customer;
import com.wgu.wallacebackend.dao.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;
    private final DivisionRepository divisionRepository;

    public BootStrapData(CustomerRepository customerRepository, DivisionRepository divisionRepository){
        this.customerRepository = customerRepository;
        this.divisionRepository = divisionRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        Customer christina = new Customer();
        christina.setFirstName("Christina");
        christina.setLastName("Pratt");
        christina.setAddress("156 palm beach st");
        christina.setPostal_code("12345");
        christina.setPhone("7865436782");

        Customer carlos = new Customer();
        carlos.setFirstName("Carlos");
        carlos.setLastName("Michael");
        carlos.setAddress("333 morning star ct");
        carlos.setPostal_code("43567");
        carlos.setPhone("3456789763");

        Customer steven = new Customer();
        steven.setFirstName("Steven");
        steven.setLastName("Goley");
        steven.setAddress("456 Gordon lane");
        steven.setPostal_code("55678");
        steven.setPhone("5678975343");

        Customer joe = new Customer();
        joe.setFirstName("Joe");
        joe.setLastName("Rodriguez");
        joe.setAddress("968 Star ave");
        joe.setPostal_code("26789");
        joe.setPhone("5678965678");

        Customer nick = new Customer();
        nick.setFirstName("Nick");
        nick.setLastName("Frederick");
        nick.setAddress("35 Indigo blvd");
        nick.setPostal_code("23853");
        nick.setPhone("5678603028");

        customerRepository.save(christina);
        customerRepository.save(carlos);
        customerRepository.save(steven);
        customerRepository.save(joe);
        customerRepository.save(nick);
    }

}