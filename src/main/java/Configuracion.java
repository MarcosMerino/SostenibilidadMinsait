import java.util.ArrayList;
import java.util.Date;

public abstract class Configuracion {
    public static void inicializarPrograma(ArrayList<Usuario> usuarios, ArrayList<Organizador> organizadores ,ArrayList<Ubicacion> ubicaciones, ArrayList<Categoria> categorias,ArrayList<Evento> eventos) {
        usuarios.add(new Usuario("Ana Lopez","ana1234"));
        usuarios.add(new Usuario("Carlos Perez","carlos1234"));
        usuarios.add(new Usuario("Maria Sanchez","maria1234"));
        usuarios.add(new Usuario("Luis Gomez","luis1234"));
        usuarios.add(new Usuario("Sofia Martinez","sofia1234"));

        organizadores.add(new Organizador("EcoEvent", "eco@event.com", "pass1234"));
        organizadores.add(new Organizador("GreenFuture", "info@greenfuture.org", "green2024"));
        organizadores.add(new Organizador("Sostenibilidad YA", "contact@sostya.com", "sost321"));
        organizadores.add(new Organizador("Planeta Limpio", "admin@planetalim.com", "limpio999"));
        organizadores.add(new Organizador("Vida Verde", "vida@verde.com", "verdevida"));

        ubicaciones.add(new Ubicacion(true, "https://evento1.com"));
        ubicaciones.add(new Ubicacion(false, "Av. Principal 123, Madrid"));
        ubicaciones.add(new Ubicacion(false, "Calle Verde 456, Barcelona"));
        ubicaciones.add(new Ubicacion(true, "https://evento2.org"));
        ubicaciones.add(new Ubicacion(false, "Plaza Eco 789, Valencia"));

        categorias.add(new Categoria("Reciclaje", "Eventos enfocados en técnicas de reciclaje y reutilización."));
        categorias.add(new Categoria("Energía Renovable", "Charlas sobre fuentes de energía limpia."));
        categorias.add(new Categoria("Agricultura Sostenible", "Prácticas agrícolas respetuosas con el medio ambiente."));
        categorias.add(new Categoria("Educación Ambiental", "Programas educativos sobre sostenibilidad."));
        categorias.add(new Categoria("Movilidad Verde", "Soluciones de transporte sostenibles."));

        eventos.add(new Evento("Taller de Reciclaje Creativo", new Date("2024-06-01"), 2.5f, ubicaciones.get(2), organizadores.get(1), categorias.get(1)));
        eventos.add(new Evento("Congreso Energía Solar", new Date("2024-07-15"), 4.0f, ubicaciones.get(1), organizadores.get(2), categorias.get(2)));
        eventos.add(new Evento("Feria Agroecológica", new Date("2024-08-20"), 3.0f, ubicaciones.get(3), organizadores.get(3), categorias.get(3)));
        eventos.add(new Evento("Webinar Educación Verde", new Date("2024-06-10"), 1.5f, ubicaciones.get(4), organizadores.get(4), categorias.get(4)));
        eventos.add(new Evento("Ciclismo Urbano Sostenible", new Date("2024-09-05"), 2.0f, ubicaciones.get(5), organizadores.get(5), categorias.get(5)));
    }
}
