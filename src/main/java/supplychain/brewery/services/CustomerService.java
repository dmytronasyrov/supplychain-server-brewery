package supplychain.brewery.services;

import supplychain.brewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
  CustomerDto getCustomerById(UUID customerId);
}
