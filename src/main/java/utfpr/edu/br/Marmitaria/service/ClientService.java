package utfpr.edu.br.Marmitaria.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import utfpr.edu.br.Marmitaria.model.Client;
import utfpr.edu.br.Marmitaria.repository.ClientRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClientService {

    private final ClientRepository clientRepository;

    public Client save(Client object) {
        Boolean exists = clientRepository.existsByName(object.getName());
        if (exists)
            throw new IllegalArgumentException("Client already exists");
        return clientRepository.save(object);
    }

    public Optional<Client> findById(long id) { return clientRepository.findById(id); }
}
