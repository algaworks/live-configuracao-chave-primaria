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
public class Projeto {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequencia")
//    @SequenceGenerator(name = "sequencia", sequenceName = "seq_projeto")
//    @GeneratedValue(strategy = GenerationType.TABLE, generator = "tabela")
//    @TableGenerator(name = "tabela", table = "identificador",
//            pkColumnName = "nome_chave", pkColumnValue = "projeto",
//            valueColumnName = "proximo_valor")
    private Integer id;

    private String nome;

    private LocalDateTime inicio;

    private LocalDateTime fim;
}
