package utfpr.edu.br.Marmitaria.model;

import lombok.Data;
import lombok.Getter;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Order {

    @Id
    @GeneratedValue
    private Long id;

    private Integer tempoEstimado;

    @ManyToOne
    private Client client;

    @OneToMany
    private List<OrderItem> itens;

    private Enum Situation;

}
