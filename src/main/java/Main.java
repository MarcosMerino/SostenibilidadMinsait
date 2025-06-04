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
    
        int opcion;
        String nombreUsuario, passwordUsuario, nombreOrganizador, passwordOrganizador, emailOrganizador, nombreEvento;
        boolean encontrado;
        do {
            opcion = menu();
            switch (opcion) {
                case 1:
                    System.out.println("Vamos a crear un usuario");
                    System.out.println("Por favor, ingrese los datos del usuario:");
                    System.out.print("Nombre: ");
                    nombreUsuario = teclado.next();
                    encontrado = false; 
                    for (int i = 0; i < usuarios.size(); i++) {
                        if (usuarios.get(i).getNombre().equalsIgnoreCase(nombreUsuario)) {
                            System.out.println("El nombre de usuario ya existe. Por favor, elija otro.");
                            encontrado = true; 
                        }
                    }
                    if (!encontrado) {
                        System.out.print("Contraseña: ");
                        passwordUsuario = teclado.next();
                        usuarios.add(new Usuario(nombreUsuario, passwordUsuario));
                        System.out.println("Usuario creado exitosamente.");
                    };
                    break;
                case 2:
                    System.out.println("Crear organizador");
                    System.out.print("Nombre: ");
                    nombreOrganizador = teclado.next();
                    encontrado = false; 
                    for (int i = 0; i < organizadores.size(); i++) {
                        if (organizadores.get(i).getNombre().equalsIgnoreCase(nombreOrganizador)) {
                            System.out.println("El nombre de organizador ya existe. Por favor, elija otro.");
                            encontrado = true; 
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Email: ");
                        emailOrganizador = teclado.next();
                        System.out.print("Contraseña: ");
                        passwordOrganizador = teclado.next();
                        organizadores.add(new Organizador(nombreOrganizador, emailOrganizador, passwordOrganizador));
                        System.out.println("Usuario creado exitosamente.");
                    };
                    break;
                case 3:
                    System.out.println("Vamos a generar un evento");
                    System.out.println("Dime quién lo va a crear (nombre de organizador): ");
                    nombreOrganizador = teclado.next();
                    encontrado = false;
                    for (int i = 0; i < organizadores.size(); i++) {
                        if (organizadores.get(i).getNombre().equalsIgnoreCase(nombreOrganizador)) {
                            organizadores.get(i).generarEvento(eventos, categorias, ubicaciones);;
                            encontrado = true; 
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Organizador no encontrado. Por favor, inténtelo de nuevo.");
                    }
                    break;
                case 4:
                    System.out.println("Vamos a cancelar un evento");
                    System.out.println("Dime quién lo va a cancelar (nombre de organizador): ");
                    nombreOrganizador = teclado.next();
                    encontrado = false;
                    for (int i = 0; i < organizadores.size(); i++) {
                        if (organizadores.get(i).getNombre().equalsIgnoreCase(nombreOrganizador)) {
                            System.out.println("Dime el nombre del evento a cancelar: ");
                            nombreEvento = teclado.next();
                            for (int j = 0; j < eventos.size(); j++) {
                                if (eventos.get(j).getNombre().equalsIgnoreCase(nombreEvento)) {
                                    organizadores.get(i).cancelarEvento(eventos.get(j));
                                    encontrado = true; 
                                }
                            }
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Evento no encontrado");
                    }
                    
                    break;
                case 5:
                    System.out.println("Vamos a inscribirnos a un evento");
                    System.out.println("Dime quién se va a inscribir (nombre de usuario): ");  
                    nombreUsuario = teclado.next();
                    for (int i = 0; i < usuarios.size(); i++) {
                        if (usuarios.get(i).getNombre().equalsIgnoreCase(nombreUsuario)) {
                            System.out.println("Dime el nombre del evento al que te quieres inscribir: ");
                            nombreEvento = teclado.next();
                            for (int j = 0; j < eventos.size(); j++) {
                                if (eventos.get(j).getNombre().equalsIgnoreCase(nombreEvento)) {
                                    usuarios.get(i).generarInscripcion(eventos.get(j));
                                }
                            }
                        }
                    }
                    break;
                case 6:
                    System.out.println("Vamos a cancelar una asistencia");
                    System.out.println("Dime quién va a cancelar la asistencia (nombre de usuario): ");
                    nombreUsuario = teclado.next();
                    for (int i = 0; i < usuarios.size(); i++) {
                        if (usuarios.get(i).getNombre().equalsIgnoreCase(nombreUsuario)) {
                            System.out.println("Dime el nombre del evento al que quieres cancelar la asistencia: ");
                            nombreEvento = teclado.next();
                            for (int j = 0; j < eventos.size(); j++) {
                                if (eventos.get(j).getNombre().equalsIgnoreCase(nombreEvento)) {
                                    usuarios.get(i).cancelarAsistencia(eventos.get(j));
                                }
                            }
                        }
                    }
                    break;
                case 7:
                    System.out.println("Vamos a renovar una asistencia");
                    System.out.println("Dime quién va a renovar la asistencia (nombre de usuario): ");
                    nombreUsuario = teclado.next();
                    for (int i = 0; i < usuarios.size(); i++) {
                        if (usuarios.get(i).getNombre().equalsIgnoreCase(nombreUsuario)) {
                            System.out.println("Dime el nombre del evento al que quieres renovar la asistencia: ");
                            nombreEvento = teclado.next();
                            for (int j = 0; j < eventos.size(); j++) {
                                if (eventos.get(j).getNombre().equalsIgnoreCase(nombreEvento)) {
                                    usuarios.get(i).renovarAsistencia(eventos.get(j));
                                }
                            }
                        }
                    }
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción del menú.");
            }
        } while (opcion != 0);
    }
    private static int menu() {
        System.out.println(
                "1) Crear usuario\n" +
                "2) Crear organizador\n" +
                "3) Generar evento\n" +
                "4) Cancelar evento\n" +
                "5) Inscribirse a un evento\n" +
                "6) Cancelar asistencia\n" +
                "7) Renovar asistencia\n" +
                "0) Salir\n" );
        return teclado.nextInt();
    }
}
