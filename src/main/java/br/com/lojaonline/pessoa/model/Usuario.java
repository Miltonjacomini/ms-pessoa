package br.com.lojaonline.pessoa.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.time.LocalDateTime;

@Data
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Usuario")
@EqualsAndHashCode
public class Usuario {

    @Id
    @Column(name = "cd_usuario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @NotNull
    @Column
    protected String email;

    @NotNull
    @Column
    protected String password;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cd_pessoa")
    private Pessoa pessoa;

    @NotNull
    @Column(name = "dh_cadastro")
    protected LocalDateTime dataCadastro;

    @Null
    @Column(name = "dh_alteracao")
    protected LocalDateTime dataAlteracao;

    @NotNull
    @Column
    protected boolean ativo;

    public Usuario(String email, String password) {
        this.email = email;
        this.password = password;
        this.dataCadastro = LocalDateTime.now();
        this.ativo = true;
    }

}


