package com.simran.vms.service;

import java.util.List;

import com.simran.vms.entity.Customer;
import com.simran.vms.entity.Services;

public interface ServicesService {
	List<Services> getAllServices();
	void saveServices(Services services);
	Services getServicesById(Long id);
	void deleteServicesById(Long id);
}
