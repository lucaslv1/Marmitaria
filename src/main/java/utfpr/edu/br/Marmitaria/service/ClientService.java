package utfpr.edu.br.Marmitaria.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import utfpr.edu.br.Marmitaria.model.Client;
import utfpr.edu.br.Marmitaria.repository.ClientRepository;

@Service
@RequiredArgsConstructor
public class ClientService {

    private final ClientRepository clientRepository;

    public void salvar(Client client) { clientRepository.save(client); }
}
