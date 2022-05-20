package utfpr.edu.br.Marmitaria.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Orders {

    @Id
    @GeneratedValue
    private Long id;

    private Integer tempoEstimado;

    private Client client;

    private Item item;

}
