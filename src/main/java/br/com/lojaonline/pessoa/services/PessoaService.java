package br.com.lojaonline.pessoa.services;

import br.com.lojaonline.pessoa.model.Pessoa;
import br.com.lojaonline.pessoa.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;

@Component
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Transactional(readOnly = true)
    public List<Pessoa> findAllPessoas() {
        return Collections.unmodifiableList(this.pessoaRepository.findAll());
    }

}
