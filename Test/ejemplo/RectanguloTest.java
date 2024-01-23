package ejemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RectanguloTest {

    @Test
    public void testRectangulo() {
        // Arrange
        rectangulo r = new rectangulo(3, 4);

        // Act & Assert
        assertAll(
                () -> assertEquals(12, r.area(), "El área debe ser 12"),
                () -> assertEquals(14, r.perimetro(), "El perímetro debe ser 14")
        );
    }
}
