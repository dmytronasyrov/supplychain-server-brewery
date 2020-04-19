package supplychain.brewery.services.v1;

import supplychain.brewery.web.model.v1.Beer;

import java.util.UUID;

public interface BeerService {
  Beer getById(UUID id);
  Beer create(Beer beer);
  Beer update(UUID id, Beer beer);
  Beer delete(UUID id);
}
