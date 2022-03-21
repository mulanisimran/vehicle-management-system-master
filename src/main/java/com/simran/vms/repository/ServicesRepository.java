package com.simran.vms.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simran.vms.entity.Services;

@Repository
public interface ServicesRepository extends JpaRepository<Services, Long>{

}
