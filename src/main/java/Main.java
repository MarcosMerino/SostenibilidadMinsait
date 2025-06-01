import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner teclado = new Scanner(System.in).useDelimiter("\n");
    public static void main(String[] args) {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        ArrayList<Organizador> organizadores = new ArrayList<>();
        ArrayList<Evento> eventos = new ArrayList<>();
        ArrayList<Ubicacion> ubicaciones = new ArrayList<>();
        ArrayList<Categoria> categorias = new ArrayList<>();
        Configuracion.inicializarPrograma(usuarios,organizadores,ubicaciones,categorias,eventos);
    }
    private static int menu() {
        System.out.println("""
                1) Crear usuario
                2) Crear organizador
                3) Generar evento
                4) Cancelar evento
                5) Inscribirse a un evento
                6) Cancelar asistencia
                7) Renovar asistencia""");
        return teclado.nextInt();
    }
}
