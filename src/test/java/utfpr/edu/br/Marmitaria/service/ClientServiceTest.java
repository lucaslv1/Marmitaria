package utfpr.edu.br.Marmitaria.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import utfpr.edu.br.Marmitaria.model.Client;
import utfpr.edu.br.Marmitaria.repository.ClientRepository;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class ClientServiceTest {

    private ClientService underTest;

    @Mock
    private ClientRepository clientRepository;

    @BeforeEach
    void setUp() {
        underTest = new ClientService(clientRepository);
    }

    @Test
    void saveClient() {
        Client client = Client.builder().name("Lucas").build();
        ArgumentCaptor<Client> clientArgumentCaptor =
                ArgumentCaptor.forClass(Client.class);

        underTest.save(client);

        verify(clientRepository).save(clientArgumentCaptor.capture());

        Client captured = clientArgumentCaptor.getValue();

        assertThat(captured).isEqualTo(client);
    }

    @Test
    void saveClientThatAlreadyExists() {
        Client client = Client.builder().name("Lucas").build();
        given(clientRepository.existsByName("Lucas"))
                .willReturn(true);

        assertThatThrownBy(() -> underTest.save(client))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Client already exists");
    }
}
