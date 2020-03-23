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
@Table(name="CustomerDetails")
public class CustomerDetails implements Serializable {

 @ManyToMany(mappedBy="courses")
    private List<ItemList> itemList= new ArrayList<>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public String id;
    public String name;
    public String Address;
    public String pincode;
    public String phoneNum;



}
