package supplychain.brewery.services;

import org.springframework.stereotype.Service;
import supplychain.brewery.web.model.Customer;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {

  // Implementation

  @Override
  public Customer getById(UUID customerId) {
    return Customer
      .builder()
      .id(UUID.randomUUID())
      .name("John Doe")
      .build();
  }
}
