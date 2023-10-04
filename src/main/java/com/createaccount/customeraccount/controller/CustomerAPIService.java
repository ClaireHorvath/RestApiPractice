package com.createaccount.customeraccount.controller;

import com.createaccount.customeraccount.model.CustomerAccountInformation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customeraccountinformation")
public class CustomerAPIService {
    CustomerAccountInformation customerAccountInformation;
    @GetMapping("{customerId}")
    public CustomerAccountInformation getCustomerAccountInformationDetails(String customerId) {
        return customerAccountInformation;
    }

    @PostMapping
    public String createCustomerAccountInformation(@RequestBody CustomerAccountInformation customerAccountInformation) {
        this.customerAccountInformation = customerAccountInformation;
        return "Account successfully created!";
    }

    @PutMapping
    public String updateCustomerAccountInformation(@RequestBody CustomerAccountInformation customerAccountInformation) {
        this.customerAccountInformation = customerAccountInformation;
        return "Account successfully updated!";
    }

    @DeleteMapping("{customerId}")
    public String deleteCustomerAccountInformation(String customerId) {
        this.customerAccountInformation = null;
        return "Account successfully deleted!";
    }
}
