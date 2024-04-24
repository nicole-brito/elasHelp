package com.soulcode.elas_help.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.UUID;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class TecnicoDTO {

    private UUID id;

    @NotNull
    @Size(max = 255)
    private String nome;

    @NotNull
    @Size(max = 255)
    @TecnicoUsuarioUnique
    private String usuario;

    @NotNull
    @Size(max = 255)
    private String senha;

}
