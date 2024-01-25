package labshoppubsub.domain;

import java.time.LocalDate;
import java.util.*;
import labshoppubsub.domain.*;
import labshoppubsub.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private Long productId;
    private Integer qty;
    private Integer amount;
    private String customerId;

    public OrderPlaced(Order aggregate) {
        super(aggregate);
    }

    public OrderPlaced() {
        super();
    }
}
//>>> DDD / Domain Event
