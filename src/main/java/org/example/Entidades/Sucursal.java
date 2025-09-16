package org.example.Entidades;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalTime;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString(exclude  ="empresa")
@SuperBuilder
public class Sucursal {
    private Long id;
    private String nombre;
    private LocalTime horarioApertura;
    private LocalTime horarioCierre;
    private boolean esCasaMatriz;
    private Empresa empresa;
    private Domicilio domicilio;

}