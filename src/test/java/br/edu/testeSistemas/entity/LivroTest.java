package br.edu.testeSistemas.entity;

import br.edu.testeSistemas.Livro;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LivroTest {

    private Livro livro;

    @BeforeEach
    void configurarTeste(){
        livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
    }

    @Test
    void livroDeveEstarDisponivel(){
        assertFalse(livro.isEmprestado());
    }

    @Test
    void emprestarDeveMarcarLivroComoEmprestado(){
        livro.emprestar();
        assertTrue(livro.isEmprestado());
    }

}
