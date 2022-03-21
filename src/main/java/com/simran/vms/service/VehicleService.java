package com.simran.vms.service;

import java.util.List;

import com.simran.vms.entity.Vehicle;

public interface VehicleService {
	List<Vehicle> getAllVehicles();
	void saveVehicle(Vehicle vehicle);
	Vehicle getVehicleById(Long id);
	void deleteVehicleById(Long id);
}
