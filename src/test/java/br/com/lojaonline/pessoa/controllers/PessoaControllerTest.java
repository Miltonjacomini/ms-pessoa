package br.com.lojaonline.pessoa.controllers;


import br.com.lojaonline.pessoa.model.Pessoa;
import br.com.lojaonline.pessoa.model.PessoaFisica;
import br.com.lojaonline.pessoa.repository.PessoaRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class PessoaControllerTest extends IntegrationTests {

    private final String PESSOA_URL = "/pessoa";

    @Autowired
    private PessoaController pessoaController;

    @Mock
    private PessoaRepository pessoaRepository;

    @Before
    public void setUp() {

        this.mockMvc = MockMvcBuilders.standaloneSetup(pessoaController).build();

        PessoaFisica budha = new PessoaFisica("Buddha", "buddha@gmail.com", "123456", "392.097.430-16", LocalDate.of(480, 11, 4));
        PessoaFisica krishna = new PessoaFisica("Krishna", "krisssh@gmail.com", "456789", "881.939.530-45", LocalDate.of(3228, 05, 18));

        this.pessoaRepository.saveAll(new ArrayList<>(Arrays.asList(budha)));
    }

    @Test
    public void shouldLoadPessoas() throws Exception {

        List<Pessoa> allPessoas = this.pessoaRepository.findAll();

        this.mockMvc.perform(get(PESSOA_URL))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$", hasSize(allPessoas.size())));

    }

}
