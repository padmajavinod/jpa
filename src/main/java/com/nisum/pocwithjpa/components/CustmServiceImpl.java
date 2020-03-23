package com.nisum.pocwithjpa.components;

import com.nisum.pocwithjpa.model.CustomerDetails;
import com.nisum.pocwithjpa.repositories.CustomRepository;
import com.nisum.pocwithjpa.services.CustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class CustmServiceImpl implements CustomService {

    @Autowired
    private CustomRepository customRepository;


    @Override
    public CustomerDetails addData(CustomerDetails CustomerDetails) {
        return customRepository.save(CustomerDetails);

    }


    @Override
    public Optional<CustomerDetails> getCustDetailsById(String id) {
        return customRepository.findById(id);
    }

    @Override
    public Iterable<CustomerDetails> getAllCustDetails() {
        return  customRepository.findAll();
    }

    @Override
    public CustomerDetails updateDetails(CustomerDetails customerDetails) {
        return customRepository.save(customerDetails);
    }

    @Override
    public void deleteCustom(String id) {
        customRepository.deleteById(id);
    }

    @Override
    public List<CustomerDetails> getCustDetailsByItemId(String cid) {
       // customRepository.getCustDetailsByItemId(cid).forEach(CustomerDetails::new);
        return null;
    }


}
