package utfpr.edu.br.Marmitaria.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import utfpr.edu.br.Marmitaria.model.Orders;
import utfpr.edu.br.Marmitaria.repository.OrdersRepository;

@Service
@RequiredArgsConstructor
public class OrdersService {

    private OrdersRepository ordersRepository;

    public void salvar(Orders orders) { ordersRepository.save(orders); }
}
