import org.junit.Before;
import org.junit.Test;



import static org.junit.Assert.*;

public class OrganizadorTest {
    private Organizador organizador;
    private Evento evento;
    private Categoria categoria;
    private Ubicacion ubicacion;

    @Before
    public void setUp() {
        organizador = new Organizador("Juan", "juan@email.com", "1234");
        categoria = new Categoria("Deporte", "Eventos deportivos");
        ubicacion = new Ubicacion(false, "Calle Falsa 123");
        evento = new Evento("Maratón", new java.util.Date(System.currentTimeMillis() + 1000000), 2.5f, ubicacion, organizador, categoria);
    }

    @Test
    public void testCancelarEvento() {
        organizador.cancelarEvento(evento);
        assertTrue(evento.isCancelado());
    }
}