package br.com.lojaonline.pessoa.controllers;

import br.com.lojaonline.pessoa.dto.PessoaDTO;
import br.com.lojaonline.pessoa.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.stream.Collectors.toList;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @GetMapping
    public List<PessoaDTO> getAllPessoas() {
        return pessoaService.findAllPessoas()
                            .stream()
                            .map(PessoaDTO::new)
                            .collect(toList());
    }

}
