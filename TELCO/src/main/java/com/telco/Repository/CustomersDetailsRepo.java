package com.telco.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.telco.model.CustomersDetails;

public interface CustomersDetailsRepo extends CrudRepository<CustomersDetails, Long> {



	CustomersDetails getCustomersDetailsById(long id);

	void saveOrUpdate(CustomersDetails CustomersDetails);



	
	

}
