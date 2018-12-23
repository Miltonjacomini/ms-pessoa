package br.com.lojaonline.pessoa.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.persistence.*;

@Getter
@AllArgsConstructor
@Entity
public class Telefone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cd_telefone")
    private Long codigo;

    @Column
    private String numero;

    @Enumerated(EnumType.STRING)
    @Column
    private TipoTelefone tipo;

    @Column
    private String complemento;

}
