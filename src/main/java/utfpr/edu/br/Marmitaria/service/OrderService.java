package utfpr.edu.br.Marmitaria.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import utfpr.edu.br.Marmitaria.model.Order;
import utfpr.edu.br.Marmitaria.repository.OrderRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {

    private OrderRepository ordersRepository;

    public void salvar(Order orders) { ordersRepository.save(orders); }
}
