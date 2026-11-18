package ec.edu.udla.biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas unitarias básicas para verificar la configuración de Maven y JUnit.
 */
class AppTest {

    private App app;

    @BeforeEach
    void setUp() {
        app = new App();
    }

    @Test
    @DisplayName("Debe retornar el nombre del sistema correctamente")
    void testNombreSistema() {
        assertEquals("Sistema de Biblioteca Universitaria", app.getNombreSistema(),
                "El nombre del sistema debe coincidir con el esperado");
    }

    @Test
    @DisplayName("Debe confirmar que el sistema base está operativo")
    void testSistemaOperativo() {
        assertTrue(app.estaOperativo(), "El sistema base debe estar operativo");
    }
}
