package supplychain.brewery.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import supplychain.brewery.services.BeerService;
import supplychain.brewery.web.model.Beer;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

  // Services

  private final BeerService beerService;

  // Constructors

  public BeerController(BeerService beerService) {
    this.beerService = beerService;
  }

  // CRUD

  @GetMapping({"/{id}"})
  public ResponseEntity<Beer> get(@PathVariable("id") UUID id) {
    return new ResponseEntity<>(beerService.getById(id), HttpStatus.OK);
  }
}
