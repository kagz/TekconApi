package com.telco.Services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telco.Repository.CustomersDetailsRepo;
import com.telco.model.CustomersDetails;


@Service
@Transactional
public abstract class CustomersDetailsServiceImpl implements CustomersDetailsRepo {
 /*
 @Autowired
 CustomersDetailsRepo mtejaRepository;

 public List<CustomersDetails> getAllCustomersDetails() {
  return (List<CustomersDetails>) mtejaRepository.findAll();
 }
*/
 
}
