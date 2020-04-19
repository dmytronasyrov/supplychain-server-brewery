package supplychain.brewery.services.v1;

import org.springframework.stereotype.Service;
import supplychain.brewery.web.model.v1.Customer;

import java.util.UUID;

@Service
public final class CustomerServiceImpl implements CustomerService {

  // Implementation

  @Override
  public Customer getById(UUID id) {
    return Customer
      .builder()
      .id(UUID.randomUUID())
      .name("John Doe")
      .build();
  }

  @Override
  public Customer create(Customer customer) {
    return Customer
      .builder()
      .id(UUID.randomUUID())
      .name(customer.getName())
      .build();
  }

  @Override
  public Customer update(UUID id, Customer customer) {
    return Customer
      .builder()
      .id(UUID.randomUUID())
      .name(customer.getName())
      .build();
  }

  @Override
  public Customer delete(UUID id) {
    return Customer
      .builder()
      .id(UUID.randomUUID())
      .name("John Doe")
      .build();
  }
}
