package supplychain.brewery.services;

import supplychain.brewery.web.model.Beer;

import java.util.UUID;

public interface BeerService {
  Beer getById(UUID id);
  Beer create(Beer beer);
  Beer update(UUID id, Beer beer);
  Beer delete(UUID id);
}
