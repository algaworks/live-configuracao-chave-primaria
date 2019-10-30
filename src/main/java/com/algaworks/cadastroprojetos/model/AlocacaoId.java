package com.algaworks.cadastroprojetos.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class AlocacaoId implements Serializable {

    @Column(name = "projeto_id")
    private Integer projeto;

    @Column(name = "funcionario_id")
    private Integer funcionario;


}
