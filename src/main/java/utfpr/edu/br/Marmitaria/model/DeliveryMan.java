package utfpr.edu.br.Marmitaria.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
public class DeliveryMan {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private List<Delivery> delivery;

    private Integer entregasRealizadas;
}
