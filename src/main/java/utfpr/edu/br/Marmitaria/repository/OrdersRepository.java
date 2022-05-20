package utfpr.edu.br.Marmitaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import utfpr.edu.br.Marmitaria.model.Orders;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Long> {

}
