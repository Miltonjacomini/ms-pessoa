package br.com.lojaonline.pessoa.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.persistence.*;

@Getter
@AllArgsConstructor
@Entity
@Table(name = "Endereco")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cd_endereco")
    private Long codigo;

    @Column
    private String nome;

    @Column
    private String cep;

    @Column
    private String cidade;

    @Column
    private String estado;

    @Column
    private String logradouro;

    @Column
    private String numero;

    @Column
    private String bairro;

    @Column
    private String complemento;

}
