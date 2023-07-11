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
@Document(collection = "Profesor")
@Data
public class Profesor {
    
     @Id
    private Long prof_id;
    private String nombre;
    private String telefono;
    private String direccion;    
  
    
    //RELACION DE UNO A MUCHOS
    private List<Curso> listCurso;

}
