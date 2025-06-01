import java.util.ArrayList;
import java.util.Date;

public class Usuario {
    private int id;
    private String nombre;
    private Date fecha;
    private String password;

    public Usuario(String nombre, String password) {
        this.id++;
        this.nombre = nombre;
        this.fecha = new Date();
        this.password = password;
    }

    public void generarInscripcion(Evento evento) {
        if (!evento.isCancelado()) {
            if (evento.getFecha().after(new Date())) {
                boolean encontrado = false;
                for (int i = 0; i < evento.getInscripciones().size() && !encontrado; i++) {
                    if (evento.getInscripciones().get(i).getUsuario().equals(this)) {
                        encontrado = true;
                    }
                }
                if (encontrado) {
                    System.out.println("Ya estabas inscrito en este evento");
                } else {
                    evento.getInscripciones().add(new Inscripcion(this, false));
                    System.out.println("Te has inscrito de manera exitosa en el evento");
                }
            }
            else System.out.println("El evento ya ha tenido lugar");
        }
        else System.out.println("El evento está cancelado, no puedes unirte");
    }

    public void cancelarAsistencia(Evento evento) {
        boolean encontrado = false;
        if (evento.getFecha().after(new Date())) {
            for (int i = 0; i < evento.getInscripciones().size() && !encontrado; i++) {
                if(evento.getInscripciones().get(i).getUsuario().equals(this))  {
                    if (!evento.getInscripciones().get(i).isCancelado()) {
                        evento.getInscripciones().get(i).setCancelado(true);
                        System.out.println("Inscripción cancelada");
                        encontrado = true;
                    }
                    else System.out.println("Esa inscripción ya estaba cancelada");
                }
            }
            if (!encontrado) {
                System.out.println("No estás inscrito en este evento");
            }
        }
        else System.out.println("El evento ya ha tenido lugar");
    }
    public void renovarAsistencia(Evento evento) {
        if (!evento.isCancelado()) {
            if (evento.getFecha().after(new Date())) {
                boolean encontrado = false;
                for (int i = 0; i < evento.getInscripciones().size() && !encontrado; i++) {
                    if (evento.getInscripciones().get(i).getUsuario().equals(this)) {
                        if (evento.getInscripciones().get(i).isCancelado()) {
                            evento.getInscripciones().get(i).setCancelado(false);
                            System.out.println("Inscripción renovada");
                            encontrado = true;
                        } else System.out.println("Esa inscripción ya estaba activa");
                    }
                }
                if (!encontrado) {
                    System.out.println("No estás inscrito en este evento");
                }
            }
            else System.out.println("El evento ya ha tenido lugar");
        }
        else System.out.println("El evento está cancelado, no puedes renovar tu asistencia");
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
