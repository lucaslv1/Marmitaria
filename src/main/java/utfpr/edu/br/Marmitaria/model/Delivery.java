package utfpr.edu.br.Marmitaria.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Delivery {

    @Id
    @GeneratedValue
    private Long id;

    private String address;

    private Integer tempoEstimado;

    private Orders orders;
}
