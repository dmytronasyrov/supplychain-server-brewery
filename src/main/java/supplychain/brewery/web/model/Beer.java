package supplychain.brewery.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Beer {

  // Fields

  private UUID id;
  private String name;
  private String style;
  private Long upc;
}
