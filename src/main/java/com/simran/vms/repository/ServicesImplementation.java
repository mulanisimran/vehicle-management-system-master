package com.simran.vms.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simran.vms.entity.Services;
import com.simran.vms.service.ServicesService;

@Service
public class ServicesImplementation implements ServicesService{

	@Autowired
	ServicesRepository servicesRepository;
	
	@Override
	public List<Services> getAllServices() {
		
		return servicesRepository.findAll();
	}

	@Override
	public void saveServices(Services services) {
			servicesRepository.save(services);
	}

	@Override
	public Services getServicesById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteServicesById(Long id) {
		// TODO Auto-generated method stub
		
	}

}
