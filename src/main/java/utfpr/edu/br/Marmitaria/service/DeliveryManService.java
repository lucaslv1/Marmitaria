package utfpr.edu.br.Marmitaria.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import utfpr.edu.br.Marmitaria.model.DeliveryMan;
import utfpr.edu.br.Marmitaria.repository.DeliveryManRepository;

@Service
@RequiredArgsConstructor
public class DeliveryManService {

    private final DeliveryManRepository deliveryManRepository;

    public void salvar(DeliveryMan deliveryMan) { deliveryManRepository.save(deliveryMan); }
}
