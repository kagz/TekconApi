package com.telco.Services;

import java.util.List;

import com.telco.model.CustomersDetails;

public interface CustomerDetailsService {

	public List<CustomersDetails> getAllCustomersDetails();

	public CustomersDetails getCustomersDetailsById(long id);

	public void saveOrUpdate(CustomersDetails CustomersDetails);

	public void deleteCustomersDetails(long id);

}
