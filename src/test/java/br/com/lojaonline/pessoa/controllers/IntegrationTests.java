package br.com.lojaonline.pessoa.controllers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestPropertySource("/test.properties")
public class IntegrationTests {

    @LocalServerPort
    protected int port;

    protected final String LOCALHOST_URL = "http://localhost:"+port;

    @Autowired
    private TestRestTemplate restTemplate;

    protected MockMvc mockMvc;

    @Test
    public void empty() {
    }
}
