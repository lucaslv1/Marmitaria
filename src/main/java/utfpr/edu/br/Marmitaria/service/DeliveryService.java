package utfpr.edu.br.Marmitaria.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import utfpr.edu.br.Marmitaria.model.Delivery;
import utfpr.edu.br.Marmitaria.repository.DeliveryRepository;

@Service
@RequiredArgsConstructor
public class DeliveryService {

    private final DeliveryRepository deliveryRepository;

    public void salvar(Delivery delivery) { deliveryRepository.save(delivery); }
}
