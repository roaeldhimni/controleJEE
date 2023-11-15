package com.eldhimni.demo.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eldhimni.demo.dao.IDao;
import com.eldhimni.demo.entities.Employe;
import com.eldhimni.demo.repository.EmployeRepository;


@Service
public class EmployeService implements IDao<Employe> {
    @Autowired
    EmployeRepository employeRepository;

    @Override
    public Employe create(Employe o) {
        return employeRepository.save(o);
    }

    @Override
    public List<Employe> findAll() {
        return employeRepository.findAll();
    }

    @Override
    public Employe update(Employe o) {
        return employeRepository.save(o);
    }

    @Override
    public boolean delete(Employe o) {
        try {
            employeRepository.delete(o);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Employe findById(Long id) {
        return employeRepository.findById(id).orElse(null);
    }
}
