package com.nisum.pocwithjpa.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="ItemList")
public class ItemList implements Serializable {


     private List<CustomerDetails> customerDetails;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String itemName;
    private String quantity;

}
