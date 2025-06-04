import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * @author MarcosMerino
 *
 * @date 04-06-2025
 *
 * Clase Organizador
 * Almacena la información sobre los organizadores registrados que son aquellos que hayan o van a crear un evento
 */

public class Organizador {
    private int id;
    private String nombre;
    private String email;
    private String password;

    public Organizador(String nombre, String email, String password) {
        this.id++;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
    }

    /**
     * Metodo para que un organizador pueda cancelar su evento, controla también si el evento es de este organizador
     * @param evento evento a cancelar
     */
    public void cancelarEvento(Evento evento){
        if (evento.getOrganizador().equals(this)){
            evento.cancelarEvento();
        }
        else {
            System.out.println("No eres el organizador de este evento");
        }
    }

    /**
     * Metodo que permite al organizador crear su propio evento
     * @param eventos Lista de eventos a la que se va a añadir el nuevo evento
     * @param categorias Lista de categorías para encontrar la que le corresponda al evento
     * @param ubicaciones Lista de ubicaciones para añadir el lugar del evento
     */
    public void generarEvento(ArrayList<Evento> eventos, ArrayList<Categoria> categorias, ArrayList<Ubicacion> ubicaciones) {
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        String nombreEvento;
        Date fechaEvento;
        float duracionEvento;
        Ubicacion ubicacionEvento;
        Categoria categoriaEvento = null;
        int id;
        boolean encontrado;


        System.out.println("Vamos a crear un evento");
        System.out.print("Nombre del evento: ");
        nombreEvento = teclado.next();
        System.out.print("Categoría del evento: ");
        System.out.println("Dime la id de la categoría\n" +
                           "0 para Reciclaje\n" +
                           "1 para Energía Renovable\n" +
                           "2 para Agricultura Sostenible\n" +
                           "3 para Educación Ambiental\n" +
                           "4 para Movilidad Verde\n");
        id = teclado.nextInt();
        encontrado = false;
        for (Categoria i : categorias) {
            if (i.getId() == id) {
                categoriaEvento = i;
                encontrado = true;
            }
        }
        if (encontrado) {
            System.out.print("Fecha del evento (dd/MM/yyyy): ");
            fechaEvento = new Date(teclado.next());
            System.out.print("Duración del evento (en horas): ");
            duracionEvento = teclado.nextFloat();
            System.out.print("Ubicación del evento: ");
            System.out.println("Es online? (s/n)");
            if (teclado.next().equalsIgnoreCase("s")) {
                System.out.print("Introduce la URL del evento: ");
                ubicacionEvento = new Ubicacion(true, teclado.next());
                ubicaciones.add(ubicacionEvento);
            }
            else {
                System.out.print("Introduce la dirección del evento: ");
                ubicacionEvento = new Ubicacion(false, teclado.next());
                ubicaciones.add(ubicacionEvento);

            }
                Evento nuevoEvento = new Evento(nombreEvento, fechaEvento, duracionEvento, ubicacionEvento, this, categoriaEvento);
                eventos.add(nuevoEvento);
                System.out.println("Evento creado exitosamente.");
        }
        else {
            System.out.println("Categoría no encontrada, por favor, inténtalo de nuevo.");
        }
    }

    public String getNombre() {
        return nombre;
    }

}
