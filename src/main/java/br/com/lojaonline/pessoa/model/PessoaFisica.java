package br.com.lojaonline.pessoa.model;

import lombok.Data;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.time.LocalDate;

@Data
@Getter
@Entity
@DiscriminatorValue(value = "F")
public class PessoaFisica extends Pessoa {

    @Column
    private String nome;

    @Column
    private String cpf;

    @Column(name="dt_nascimento")
    private LocalDate dataNascimento;

    public PessoaFisica(String nome, String email, String password, String cpf, LocalDate dataNascimento) {
        this.email = email;
        this.password = password;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

}
