package utfpr.edu.br.Marmitaria.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Item {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(unique = true)
    private String description;

    @Column(precision = 2)
    private Double value;

}
