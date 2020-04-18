package supplychain.brewery.services;

import org.springframework.stereotype.Service;
import supplychain.brewery.web.model.BeerDto;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {

  @Override
  public BeerDto getBeerById(UUID beerId) {
    return BeerDto
      .builder()
      .id(UUID.randomUUID())
      .name("Old Monk")
      .style("Pale Ale")
      .build();
  }
}
