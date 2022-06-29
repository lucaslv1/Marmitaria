package utfpr.edu.br.Marmitaria.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Delivery {

    @Id
    @GeneratedValue
    private Long id;

    private String address;

    private Integer tempoEstimado;

    @ManyToOne
    private Order orders;
}
