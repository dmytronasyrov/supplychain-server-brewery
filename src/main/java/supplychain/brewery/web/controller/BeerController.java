package supplychain.brewery.web.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import supplychain.brewery.services.BeerService;
import supplychain.brewery.web.model.Beer;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
public final class BeerController {

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

  @PostMapping
  public ResponseEntity<Beer> create(Beer beer) {
    final Beer createdBeer = beerService.create(beer);

    final HttpHeaders headers = new HttpHeaders();
    headers.add("Location", "/api/v1/beer" + createdBeer.getId().toString());

    return new ResponseEntity<>(headers, HttpStatus.CREATED);
  }
}
