package org.example.Entidades;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.example.Entidades.Empresa;


import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@ToString(exclude = "sucursales")
@SuperBuilder


@Builder
public class Empresa {
    private Long id;
    private String nombre;
    private String razonSocial;
    private Long cuil;

    @Builder.Default
    private Set<Sucursal> sucursales = new HashSet<>();

    {

    }
}
