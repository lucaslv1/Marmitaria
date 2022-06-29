package utfpr.edu.br.Marmitaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import utfpr.edu.br.Marmitaria.model.Item;
import utfpr.edu.br.Marmitaria.model.Order;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
