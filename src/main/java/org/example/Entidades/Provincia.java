package org.example.Entidades;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
public class Provincia {
    private Long id;
    private String nombre;

    @Builder.Default
    private Set<Localidad> localidades = new HashSet<>();
    private Pais pais;

    @Override
    public String toString() {
        return "Provincia{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", pais=" + (pais != null ? pais.getNombre() : null) + // Evitar recursión infinita
                '}';
    }
}
