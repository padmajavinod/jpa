package com.nisum.pocwithjpa.controller;

import com.nisum.pocwithjpa.model.CustomerDetails;
import com.nisum.pocwithjpa.model.ItemList;
import com.nisum.pocwithjpa.services.CustomService;
import com.nisum.pocwithjpa.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(value = "/Item",produces = MediaType.APPLICATION_JSON_VALUE)
public class ItemControler {

    @Autowired
    private ItemService itemService;

    @ResponseStatus(value = HttpStatus.OK)
    @PostMapping(value = "/addDetails", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ItemList addData(@RequestBody ItemList itemList)
    {
        return itemService.addData(itemList);
    }

    @GetMapping("/getItemListById/{id}")
    public Optional<ItemList> getItemListById(@PathVariable("id") String id)
    {
        return itemService.getItemListById(id);
    }

    @GetMapping(value="/getAllItemList",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Iterable<ItemList> getAllItemList()
    {

        return itemService.getAllItemList();
    }

    @PutMapping(value = "/updateItemList",consumes=MediaType.APPLICATION_JSON_VALUE)
    public ItemList updateItemList(ItemList itemList)
    {
        return itemService.updateItemList(itemList);
    }
    @ResponseStatus(value = HttpStatus.OK)
    @DeleteMapping(value="/deleteItemList/{id}")
    public void deleteItemList(String id)
    {
        itemService.deleteItemList(id);
    }


}
