package org.example.Entidades;

import lombok.*;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString(exclude = "localidad")
@SuperBuilder

public class Domicilio {
    private Long id;
    private String calle;
    private Integer numero;
    private Integer cp;
    private Integer piso;
    private Integer nroDpto;

    private Localidad localidad;
}
