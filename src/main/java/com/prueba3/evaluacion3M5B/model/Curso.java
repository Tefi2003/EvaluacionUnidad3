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
@Document(collection = "Curso")
@Data
public class Curso {
    
    @Id
    private Long curso_id;
    private String nombre;
    private String nivel;
    private String descripcion;
}
