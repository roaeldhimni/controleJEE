package com.eldhimni.demo.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.eldhimni.demo.dao.IDao;
import com.eldhimni.demo.entities.Service1;
import com.eldhimni.demo.repository.ServiceRepository;




@Service
public class ServiceService implements IDao<Service1>{
	@Autowired
	private ServiceRepository serviceRepository;

	

	@Override
	public Service1 create(Service1 o) {
		return serviceRepository.save(o);
	}

	@Override
	public boolean delete(Service1 o) {
		try {
			serviceRepository.delete(o);
			return true;
		}
		catch(Exception ex) {
			return false;
		}
	}

	@Override
    public Service1 update(Service1 o) {
       
        return serviceRepository.save(o);
    }

	@Override
	public List<Service1> findAll() {
		
		return serviceRepository.findAll();
	}

	@Override
	public Service1 findById(Long id) {
		return serviceRepository.findById(id).orElse(null);
	}	
}
