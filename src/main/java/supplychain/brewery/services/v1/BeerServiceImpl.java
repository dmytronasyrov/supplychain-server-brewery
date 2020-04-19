package supplychain.brewery.services.v1;

import org.springframework.stereotype.Service;
import supplychain.brewery.web.model.v1.Beer;
import supplychain.brewery.web.model.v1.BeerStyle;

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
      .style(BeerStyle.ALE)
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
    return Beer
      .builder()
      .id(UUID.randomUUID())
      .name(beer.getName())
      .style(beer.getStyle())
      .build();
  }

  @Override
  public Beer delete(UUID id) {
    return Beer
      .builder()
      .id(UUID.randomUUID())
      .name("Old Monk")
      .style(BeerStyle.STOUT)
      .build();
  }
}
