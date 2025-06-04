
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class ConfiguracionTest {


    /**
     * Comprueba que la clase configuración realmente inicializa las listas
     */
    @Test
    public void testInicializarPrograma() {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        ArrayList<Organizador> organizadores = new ArrayList<>();
        ArrayList<Ubicacion> ubicaciones = new ArrayList<>();
        ArrayList<Categoria> categorias = new ArrayList<>();
        ArrayList<Evento> eventos = new ArrayList<>();

        Configuracion.inicializarPrograma(usuarios, organizadores, ubicaciones, categorias, eventos);

        assertFalse(usuarios.isEmpty());
        assertFalse(organizadores.isEmpty());
        assertFalse(ubicaciones.isEmpty());
        assertFalse(categorias.isEmpty());
        assertFalse(eventos.isEmpty());
    }
}