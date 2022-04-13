package com.evandro.exercicios;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.system.CapturedOutput;
import org.springframework.boot.test.system.OutputCaptureExtension;

@ExtendWith(OutputCaptureExtension.class)
public class BaseTest {
    Logger logger = LoggerFactory.getLogger(BaseTest.class);

    protected void validarExercicio01(CapturedOutput output) {
        String expectedOutput = output.getOut().trim();
        logger.info("Validando a mensagem");
        MatcherAssertPt.assertThat(expectedOutput, Matchers.is("Hello World!"));
        logger.info("Parabéns! Voce conseguiu!");
    }

    protected void validarExercicio02(CapturedOutput output) {
        String expectedOutput = output.getOut().trim();
        logger.info("Validando a mensagem");
        MatcherAssertPt.assertThat(expectedOutput, Matchers.is("Olá Professor Evandro!"));
        logger.info("Parabéns! Voce conseguiu!");
    }

    protected void validarExercicio03(CapturedOutput output) {
        String expectedOutput = output.getOut().trim();
        logger.info("Validando a mensagem");
        MatcherAssertPt.assertThat(expectedOutput, Matchers.is("Olá João!"));
        logger.info("Parabéns! Voce conseguiu!");
    }

    protected void validarExercicio04(CapturedOutput output) {
        String expectedOutput = output.getOut().trim();
        logger.info("Validando a mensagem");
        MatcherAssertPt.assertThat(expectedOutput, Matchers.is("Olá Maria!"));
        logger.info("Parabéns! Voce conseguiu!");
    }

    protected void validarExercicio05(CapturedOutput output, String nomePessoa) {
        String expectedOutput = output.getOut().trim();
        logger.info("Validando o conteudo da variavel nomePessoa");
        MatcherAssertPt.assertThat(nomePessoa, Matchers.is("Fulano"));
        logger.info("Validação passou!");
        logger.info("Validando a mensagem");
        MatcherAssertPt.assertThat(expectedOutput, Matchers.is("Olá Fulano!"));
        logger.info("Validação passou!");
        logger.info("Parabéns! Voce conseguiu!");
    }
}
