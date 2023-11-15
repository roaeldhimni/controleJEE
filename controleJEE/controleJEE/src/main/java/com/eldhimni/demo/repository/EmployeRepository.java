package com.eldhimni.demo.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eldhimni.demo.entities.Employe;
import com.eldhimni.demo.entities.Service1;




@Repository
public interface EmployeRepository extends JpaRepository<Employe, Long> {
	public List<Employe> findByService(Service1 service);
}

