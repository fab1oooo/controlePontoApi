package com.DESAFIO.live.Model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class Localidade {
    @Id
    private long id;
    @ManyToOne
    private NivelAcesso nivelAcesso;
    private String descricao;
}
