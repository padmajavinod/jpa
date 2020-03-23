package com.nisum.pocwithjpa.services;

import com.nisum.pocwithjpa.model.CustomerDetails;

import java.util.List;
import java.util.Optional;



public interface CustomService {

    public CustomerDetails addData(CustomerDetails customerDetails);
    public Optional<CustomerDetails> getCustDetailsById(String id);
    public Iterable<CustomerDetails> getAllCustDetails();
    public CustomerDetails updateDetails(CustomerDetails customerDetails);
    public void deleteCustom(String id);
    public  List<CustomerDetails> getCustDetailsByItemId(String cid);

}
