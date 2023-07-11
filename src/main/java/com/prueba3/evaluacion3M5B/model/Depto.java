/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba3.evaluacion3M5B.model;

import java.util.List;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author tefip
 */
@Document(collection = "Depto")
@Data
public class Depto {
    
    @Id
    private Long depto_id;
    private String nombre;
    private String director;
    private String descripcion;  
    
    //RELACION DE UNO A MUCHOS
    private List<Profesor> listProfesor;
}
