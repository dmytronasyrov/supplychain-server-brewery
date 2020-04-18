package supplychain.brewery.services;

import supplychain.brewery.web.model.Customer;

import java.util.UUID;

public interface CustomerService {
  Customer getById(UUID customerId);
}
