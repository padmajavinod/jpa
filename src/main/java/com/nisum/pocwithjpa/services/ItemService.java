package com.nisum.pocwithjpa.services;

import com.nisum.pocwithjpa.model.ItemList;
import org.springframework.stereotype.Service;

import java.util.Optional;



public interface ItemService {

    public ItemList addData(ItemList itemList);
    public Optional<ItemList> getItemListById(String id);
    public Iterable<ItemList> getAllItemList();
    public ItemList updateItemList(ItemList itemList);
    public void deleteItemList(String id);

}
