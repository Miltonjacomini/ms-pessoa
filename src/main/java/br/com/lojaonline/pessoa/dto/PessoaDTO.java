package br.com.lojaonline.pessoa.dto;

import br.com.lojaonline.pessoa.model.Pessoa;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PessoaDTO {

    private Long codigo;

    private String nome;

    private String cpfCnpj;

    private String email;

    public PessoaDTO(Pessoa pessoa) {
        this.codigo = pessoa.getCodigo();
        this.email = pessoa.getEmail();
    }

}
