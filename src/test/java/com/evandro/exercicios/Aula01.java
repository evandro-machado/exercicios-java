package com.evandro.exercicios;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.system.CapturedOutput;


public class Aula01 extends BaseTest {
    @Test
    public void exercicio01(CapturedOutput output) {
        //Enunciado:
        //Escreva um código que imprima na tela a frase: "Hello World!" (sem as aspas)
        //Comece o código a partir da próxima linha

        //Final do seu código
        validarExercicio01(output);
    }



    @Test
    public void exercicio02(CapturedOutput output) {
        //Enunciado:
        //Escreva um código que imprima na tela a frase: "Olá Professor Evandro!" (sem as aspas)
        //Comece o código a partir da próxima linha


        //Final do seu código
        validarExercicio02(output);
    }

    @Test
    public void exercicio03(CapturedOutput output) {
        //Enunciado:
        //Escreva um código que imprima na tela a frase: "Olá João!" (sem as aspas)
        //Comece o código a partir da próxima linha


        //Final do seu código
        validarExercicio03(output);
    }

    @Test
    public void exercicio04(CapturedOutput output) {
        //Enunciado:
        //Escreva um código que imprima na tela a frase: "Olá Maria!" (sem as aspas)
        //Comece o código a partir da próxima linha


        //Final do seu código
        validarExercicio04(output);
    }

    @Test
    public void exercicio05(CapturedOutput output) {
        //Enunciado:
        //Escreva um código que altere  valor da variável nomePessoa para "Fulano" e em seguida imprima na tela
        //"Olá Fulano!" (utilize concatenação de Strings "+")
        //Comece o código a partir da próxima linha
        String nomePessoa = "";

        //Final do seu código
        validarExercicio05(output, nomePessoa);
    }
}
