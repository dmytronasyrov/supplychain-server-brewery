package supplychain.brewery.services;

import org.springframework.stereotype.Service;
import supplychain.brewery.web.model.Beer;

import java.util.UUID;

@Service
public final class BeerServiceImpl implements BeerService {

  // Implementation

  @Override
  public Beer getById(UUID beerId) {
    return Beer
      .builder()
      .id(UUID.randomUUID())
      .name("Old Monk")
      .style("Pale Ale")
      .build();
  }

  @Override
  public Beer create(Beer beer) {
    return Beer
      .builder()
      .id(UUID.randomUUID())
      .name(beer.getName())
      .style(beer.getStyle())
      .build();
  }
}
