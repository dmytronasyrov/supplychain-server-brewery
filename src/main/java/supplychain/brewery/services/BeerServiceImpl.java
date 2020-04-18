package supplychain.brewery.services;

import org.springframework.stereotype.Service;
import supplychain.brewery.web.model.Beer;

import java.util.UUID;

@Service
public final class BeerServiceImpl implements BeerService {

  // Implementation

  @Override
  public Beer getById(UUID id) {
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

  @Override
  public Beer update(UUID id, Beer beer) {
    return null;
  }

  @Override
  public Beer delete(UUID id) {
    return null;
  }
}
