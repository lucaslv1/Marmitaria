package utfpr.edu.br.Marmitaria.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import utfpr.edu.br.Marmitaria.model.Client;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
public class ClientRepositoryTest {

    private final ClientRepository underTest;

    public ClientRepositoryTest(@Autowired ClientRepository underTest) {
        this.underTest = underTest;
    }

    @Test
    void checkIfExistsByName() {
        Client client = Client.builder()
                .name("Lucas")
                .build();
        underTest.save(client);
    }

    @Test
    void checkIfNotExistsByName() {
        Client client = Client.builder()
                .name("Lucas")
                .build();
        underTest.save(client);

        Boolean result = underTest.existsByName("Matheus");

        assertThat(result).isFalse();
    }
}
