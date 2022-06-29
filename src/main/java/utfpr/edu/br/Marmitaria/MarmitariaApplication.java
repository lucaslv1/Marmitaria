package utfpr.edu.br.Marmitaria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Controller;
import utfpr.edu.br.Marmitaria.model.Client;
import utfpr.edu.br.Marmitaria.model.Item;
import utfpr.edu.br.Marmitaria.service.ClientService;
import utfpr.edu.br.Marmitaria.service.ItemService;

@Controller
@SpringBootApplication
public class MarmitariaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarmitariaApplication.class, args);
		//private final ItemService itemService;
	}

	@EventListener(ApplicationReadyEvent.class)
	public void doSomethingAfterStartup() {
		//private ItemService itemService;
		Item item = new Item();
		item.setDescription("Feijao, Arroz e Frango");
		//itemService.salvar(item);
	}

}
