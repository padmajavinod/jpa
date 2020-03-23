package com.nisum.pocwithjpa.repositories;

import com.nisum.pocwithjpa.model.CustomerDetails;
import lombok.Builder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CustomRepository extends JpaRepository<CustomerDetails,String> {

   @Query("SELECT * FROM CustomerDetails a JOIN itemList b on a.id=b.cusid ")
     List<CustomerDetails> getCustDetailsByItemId(String cid);

}
