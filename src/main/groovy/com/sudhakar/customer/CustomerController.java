package com.sudhakar.customer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
//@BasePath     //Custom Annotation
@RequestMapping("/api")
public class CustomerController {


    @RequestMapping("/")
    public Customer getCustomer()
    {
//        return "Good Day";
        return  new Customer(1,"Swapna","Betha");
    }
}
