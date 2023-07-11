/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba3.evaluacion3M5B.service;

import com.prueba3.evaluacion3M5B.model.Depto;
import com.prueba3.evaluacion3M5B.repository.DeptoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author tefip
 */
@Service
public class DeptoServiceImpl extends GenericServiceImpl<Depto, Long> implements GenericService<Depto, Long> {

    @Autowired
    DeptoRepository deptoRepository;

    @Override
    public CrudRepository<Depto, Long> getDao() {
        return deptoRepository;
    }
}
