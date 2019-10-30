package com.algaworks.cadastroprojetos.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Alocacao {

    @EqualsAndHashCode.Include
    @EmbeddedId
    private AlocacaoId id;

    @MapsId("projeto")
    @ManyToOne
    @JoinColumn(name = "projeto_id", insertable = false, updatable = false)
    private Projeto projeto;

    @MapsId("funcionario")
    @ManyToOne
    @JoinColumn(name = "funcionario_id", insertable = false, updatable = false)
    private Funcionario funcionario;

    private LocalDateTime inicio;

    private LocalDateTime fim;
}
