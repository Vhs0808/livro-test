package br.edu.testeSistemas;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Livro {

    private final String titulo;
    private final String autor;
    private boolean emprestado;

    public void emprestar(){
        if (emprestado){
            throw new IllegalArgumentException("O livro já está emprestado.");
        }
        emprestado = true;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

}
