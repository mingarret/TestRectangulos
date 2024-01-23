package ejemplo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class RectangulodosTest {

    @BeforeAll
    static void setUpBeforeAll() {
        // Código de inicialización que se
        // ejecutará una vez antes de todas las pruebas
        System.out.println("Inicialización antes de todas las pruebas");
    }

    @Test
    void testEjemplo() {
        // Ejemplo de un método de prueba
        assertTrue(true, "Esta afirmación siempre debería ser verdadera");
    }
}
