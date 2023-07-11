/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.prueba3.evaluacion3M5B.repository;

import com.prueba3.evaluacion3M5B.model.Depto;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author tefip
 */
public interface DeptoRepository extends MongoRepository<Depto, Long>{
    
}
