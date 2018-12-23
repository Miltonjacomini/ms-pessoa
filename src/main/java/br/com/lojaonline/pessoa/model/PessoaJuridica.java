package br.com.lojaonline.pessoa.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDate;

@AllArgsConstructor
@Getter
@Entity
@DiscriminatorValue(value = "J")
public class PessoaJuridica extends Pessoa {

    @Column
    private String nomeFantasia;

    @Column
    private String razaoSocial;

    @Column
    private String cnpj;

    @Column(name="dt_fundacao")
    private LocalDate dataFundacao;

    @Column
    @Enumerated(EnumType.STRING)
    private InfoTributaria infoTributaria;

    @Column
    private String inscricaoEstadual;

}
