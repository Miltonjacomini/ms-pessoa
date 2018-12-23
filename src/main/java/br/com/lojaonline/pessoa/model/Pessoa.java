package br.com.lojaonline.pessoa.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Pessoa")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="tipoPessoa", discriminatorType = DiscriminatorType.STRING)
public abstract class Pessoa extends Usuario {

    @OneToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "pessoa_endereco",
               joinColumns = { @JoinColumn(name= "cd_pessoa") },
               inverseJoinColumns = { @JoinColumn(name="cd_endereco")
    })
    private List<Endereco> enderecos;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinTable(name="pessoa_contato",
               joinColumns = { @JoinColumn(name="cd_pessoa") },
               inverseJoinColumns = { @JoinColumn(name="cd_contato") })
    private List<Telefone> telefones;

    @OneToOne(fetch = FetchType.EAGER, optional = false, mappedBy = "pessoa")
    private Usuario usuario;

}
