package padroesdecriacao.singleton;

import static junit.framework.TestCase.assertEquals;
import org.junit.jupiter.api.Test;


class ParametroSingletonTest {

    @Test
    public void deveRetornarModelo() {
        ParametroSingleton.getInstance().setModelo("Carro 1");
        assertEquals("Carro 1", ParametroSingleton.getInstance().getModelo());
    }

    @Test
    public void deveRetornarPlaca() {
        ParametroSingleton.getInstance().setPlaca("ABC1A11");
        assertEquals("ABC1A11", ParametroSingleton.getInstance().getPlaca());
    }

}