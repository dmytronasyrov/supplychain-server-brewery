package supplychain.brewery.services.v1;

import supplychain.brewery.web.model.v1.Customer;

import java.util.UUID;

public interface CustomerService {
  Customer getById(UUID id);
  Customer create(Customer customer);
  Customer update(UUID id, Customer customer);
  Customer delete(UUID id);
}
