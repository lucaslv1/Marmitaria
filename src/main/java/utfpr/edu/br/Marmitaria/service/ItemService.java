package utfpr.edu.br.Marmitaria.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import utfpr.edu.br.Marmitaria.model.Item;
import utfpr.edu.br.Marmitaria.repository.ItemRepository;

@Service
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;

    public void salvar(Item item) { itemRepository.save(item); }
}
