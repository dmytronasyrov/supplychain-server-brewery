package supplychain.brewery.web.model.v1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public final class Beer {

  // Fields

  private UUID id;
  private String name;
  private BeerStyle style;
  private Long upc;
}
