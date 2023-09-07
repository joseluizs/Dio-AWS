package org.example;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaTest {

    @Test
    void deveCalcularIdadeCorretamente(){

        Pessoa Luiz = new Pessoa("Luiz" , LocalDateTime.of(2000, 1,1, 15,0,0));
        Assertions.assertEquals(23, Luiz.getIDade());
    }
    @Test
    void deveRetornaSeEhMaiorDeIdade(){
        Pessoa Luiz = new Pessoa("Luiz" , LocalDateTime.of(2000, 1,1, 15,0,0));
        Assertions.assertTrue(Luiz.ehMaiorDeIdade());
        
        Pessoa joao = new Pessoa("João", LocalDateTime.now());
        Assertions.assertFalse(joao.ehMaiorDeIdade());
    }

}
