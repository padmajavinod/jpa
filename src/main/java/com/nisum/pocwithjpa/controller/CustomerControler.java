package com.nisum.pocwithjpa.controller;


import com.nisum.pocwithjpa.model.CustomerDetails;
import com.nisum.pocwithjpa.services.CustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(value = "/Rest",produces = MediaType.APPLICATION_JSON_VALUE)
public class CustomerControler {

    @Autowired
    private CustomService customService;

    @ResponseStatus(value = HttpStatus.OK)
    @PostMapping(value = "/addDetails", consumes = MediaType.APPLICATION_JSON_VALUE)
    public CustomerDetails addData(@RequestBody CustomerDetails customerDetails)
    {
       return customService.addData(customerDetails);
    }

    @GetMapping("/getCustom/{id}")
    public Optional<CustomerDetails> getCustDetailsById(@PathVariable("id") String id)
    {
        return customService.getCustDetailsById(id);
    }

    @GetMapping(value="/getAllCustomDetails",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Iterable<CustomerDetails> getAllCustDetails()
    {

        return  customService.getAllCustDetails();
    }

    @PutMapping(value = "/updateDetails",consumes=MediaType.APPLICATION_JSON_VALUE)
    public CustomerDetails updateDetails(CustomerDetails customerDetails)
    {
        return customService.updateDetails(customerDetails);
    }
    @ResponseStatus(value = HttpStatus.OK)
    @DeleteMapping(value="/deleteCustom/{id}")
    public void deleteCustom(String id)
    {
        customService.deleteCustom(id);
    }

//    @GetMapping(value="/getCustDetailsByItemId/{id}")
//    public List<CustomerDetails> getCustDetailsByItemId(@PathVariable("id") String cid)
//    {
//
//        return  customService.getCustDetailsByItemId(cid);
//    }


}
