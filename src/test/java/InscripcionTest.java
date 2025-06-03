import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class InscripcionTest {
    private Usuario usuario;
    private Inscripcion inscripcion;

    @Before
    public void setUp() {
        usuario = new Usuario("Ana", "ana123");
        inscripcion = new Inscripcion(usuario, false);
    }

    @Test
    public void testSetCancelado() {
        inscripcion.setCancelado(true);
        assertTrue(inscripcion.isCancelado());
    }
}