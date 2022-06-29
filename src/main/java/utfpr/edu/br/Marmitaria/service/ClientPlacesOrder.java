package utfpr.edu.br.Marmitaria.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import utfpr.edu.br.Marmitaria.enums.Situation;
import utfpr.edu.br.Marmitaria.model.*;
import utfpr.edu.br.Marmitaria.repository.OrderRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientPlacesOrder {

    private final OrderService ordersService;

    private final OrderRepository orderRepository;

    private final ItemService itemService;

    private final ClientService clientService;

    public List<Item> listItems() {
        return itemService.findAllActive();
    }

    public Order chooseItem(Item item, Order order) {
        order.getItens().add(OrderItem.builder()
                .order(order)
                .item(item)
                .build());
        return order;
    }

    public void createRegister(String name, String address, String phone) {
        Client client = new Client();
        client.setName(name);
        client.setAddress(address);
        client.setPhone(phone);
        clientService.save(client);
    }

    public void generateDelivery(Delivery delivery, Client client, Order order){
        delivery.setAddress(client.getAddress());
        delivery.setOrders(order);
        calculatedTime();
    }

    public Integer calculatedTime(){
        return orderRepository.findAll().stream()
                .filter(o -> (o.getSituation() == Situation.PEND && o.getSituation() == Situation.PREP))
                .mapToInt(t -> t.getTempoEstimado())
                .sum() + 12 ;
    }

    public void saveOrder(Order order, Long id) {
        ordersService.salvar(order);
    }
}
