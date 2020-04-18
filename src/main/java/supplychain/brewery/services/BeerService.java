package supplychain.brewery.services;

import supplychain.brewery.web.model.Beer;

import java.util.UUID;

public interface BeerService {
  Beer getById(UUID beerId);
  Beer create(Beer beer);
}
