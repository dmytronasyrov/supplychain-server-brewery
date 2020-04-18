package supplychain.brewery.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import supplychain.brewery.services.CustomerService;
import supplychain.brewery.web.model.Customer;

import java.util.UUID;

@RestController
@RequestMapping("api/v1/customer")
public final class CustomerController {

  // Services

  private CustomerService customerService;

  // Constructors

  public CustomerController(CustomerService customerService) {
    this.customerService = customerService;
  }

  // CRUD

  @GetMapping({"/{id}"})
  public ResponseEntity<Customer> getCustomer(@PathVariable("id") UUID id) {
    return new ResponseEntity<>(customerService.getById(id), HttpStatus.OK);
  }
}
