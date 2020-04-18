package supplychain.brewery.services;

import org.springframework.stereotype.Service;
import supplychain.brewery.web.model.CustomerDto;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {

  // Implementation

  @Override
  public CustomerDto getCustomerById(UUID customerId) {
    return CustomerDto
      .builder()
      .id(UUID.randomUUID())
      .name("John Doe")
      .build();
  }
}
