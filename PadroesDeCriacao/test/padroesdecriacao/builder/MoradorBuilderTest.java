package padroesdecriacao.builder;

import org.junit.Test;
import static org.junit.Assert.*;

class MoradorBuilderTest {

    @Test
    void deveRetornarExcecaoParaMoradorSemNumApartamento() {
        try {
            MoradorBuilder moradorBuilder = new MoradorBuilder();
            Morador morador = moradorBuilder
                    .setNome("Morador 1")
                    .setCelular("999991234")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Apartamento inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaMoradorSemNome() {
        try {
            MoradorBuilder moradorBuilder = new MoradorBuilder();
            Morador morador = moradorBuilder
                    .setNumApartamento(101)
                    .setEmail("morador1@email.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarMoradorValido() {
        MoradorBuilder moradorBuilder = new MoradorBuilder();
        Morador morador = moradorBuilder
                .setNumApartamento(101)
                .setNome("Morador 1")
                .setEmail("morador1@email.com")
                .build();

        assertNotNull(morador);
    }
}