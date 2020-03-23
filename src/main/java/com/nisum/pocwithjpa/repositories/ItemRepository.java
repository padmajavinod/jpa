package com.nisum.pocwithjpa.repositories;

import com.nisum.pocwithjpa.model.ItemList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<ItemList,String> {



}
