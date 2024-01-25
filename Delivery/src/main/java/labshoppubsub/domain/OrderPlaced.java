package labshoppubsub.domain;

import java.util.*;
import labshoppubsub.domain.*;
import labshoppubsub.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private Long productId;
    private Integer qty;
    private Integer amount;
    private String customerId;
}
