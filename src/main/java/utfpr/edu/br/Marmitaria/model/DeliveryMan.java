package utfpr.edu.br.Marmitaria.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class DeliveryMan {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private Delivery delivery;

    private Integer entregasRealizadas;
}
