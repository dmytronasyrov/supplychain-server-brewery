package supplychain.brewery.services;

import supplychain.brewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
  BeerDto getBeerById(UUID beerId);
}
