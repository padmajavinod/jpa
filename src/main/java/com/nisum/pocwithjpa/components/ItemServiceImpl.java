package com.nisum.pocwithjpa.components;

import com.nisum.pocwithjpa.model.ItemList;
import com.nisum.pocwithjpa.repositories.ItemRepository;
import com.nisum.pocwithjpa.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public ItemList addData(ItemList itemList) {
        return itemRepository.save(itemList);

    }


    @Override
    public Optional<ItemList> getItemListById(String id) {
        return itemRepository.findById(id);
    }

    @Override
    public Iterable<ItemList> getAllItemList() {

        return itemRepository.findAll();
    }

    @Override
    public ItemList updateItemList(ItemList itemList) {
        return itemRepository.save(itemList);
    }

    @Override
    public void deleteItemList(String id) {
        itemRepository.deleteById(id);
    }


}
