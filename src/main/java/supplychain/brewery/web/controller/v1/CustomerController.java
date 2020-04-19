package supplychain.brewery.web.controller.v1;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import supplychain.brewery.services.v1.CustomerService;
import supplychain.brewery.web.model.v1.Customer;

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
  public ResponseEntity<Customer> get(@PathVariable("id") UUID id) {
    return new ResponseEntity<>(customerService.getById(id), HttpStatus.OK);
  }

  @PostMapping
  public ResponseEntity<Customer> create(@RequestBody Customer customer) {
    final Customer createdCustomer = customerService.create(customer);

    final HttpHeaders headers = new HttpHeaders();
    headers.add(HttpHeaders.LOCATION, "/api/v1/customer/" + createdCustomer.getId());

    return new ResponseEntity<>(headers, HttpStatus.CREATED);
  }

  @PutMapping({"/{id}"})
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void update(@PathVariable("id") UUID id, @RequestBody Customer customer) {
    customerService.update(id, customer);
  }

  @DeleteMapping({"/{id}"})
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void delete(@PathVariable("id") UUID id) {
    customerService.delete(id);
  }
}
