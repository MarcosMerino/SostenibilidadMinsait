import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.List;

public class UsuarioTest {
    private Usuario usuario;
    private Evento evento;
    private Organizador organizador;
    private Categoria categoria;
    private Ubicacion ubicacion;

    @Before
    public void setUp() {
        usuario = new Usuario("Carlos", "12345");
        organizador = new Organizador("Org", "org@mail.com", "pass");
        categoria = new Categoria("Música", "Conciertos");
        ubicacion = new Ubicacion(false, "Av. Siempre Viva");
        evento = new Evento("Concierto", new java.util.Date(System.currentTimeMillis() + 1000000), 1.5f, ubicacion, organizador, categoria);
    }

    @Test
    public void testGenerarInscripcion() {
        usuario.generarInscripcion(evento);
        List<Inscripcion> inscripciones = evento.getInscripciones();
        assertEquals(1, inscripciones.size());
        assertEquals(usuario, inscripciones.get(0).getUsuario());
    }
}