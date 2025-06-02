import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Evento {
    private int id;
    private String nombre;
    private Date fecha;
    private float duracion;
    private Ubicacion ubicacion;
    private Organizador organizador;
    private Categoria categoria;
    private List<Inscripcion> inscripciones;
    private boolean cancelado;

    public Evento(String nombre, Date fecha, float duracion, Ubicacion ubicacion, Organizador organizador, Categoria categoria) {
        this.id++;
        this.nombre = nombre;
        this.fecha = fecha;
        this.duracion = duracion;
        this.ubicacion = ubicacion;
        this.organizador = organizador;
        this.categoria = categoria;
        this.inscripciones = new ArrayList<>();
        this.cancelado = false;
    }
    public void cancelarEvento() {
        for (int i = 0; i < inscripciones.size(); i++) {
            inscripciones.get(i).setCancelado(true);
        }
        this.cancelado = true;
        System.out.println("Se ha cancelado el evento entero");
    }

    public List<Inscripcion> getInscripciones() {
        return inscripciones;
    }

    public boolean isCancelado() {
        return cancelado;
    }

    public Date getFecha() {
        return fecha;
    }

    public Organizador getOrganizador() {
        return organizador;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fecha=" + fecha +
                ", duracion=" + duracion +
                ", ubicacion=" + ubicacion +
                ", organizador=" + organizador +
                ", categoria=" + categoria +
                ", inscripciones=" + inscripciones +
                ", cancelado=" + cancelado +
                '}';
    }
}
