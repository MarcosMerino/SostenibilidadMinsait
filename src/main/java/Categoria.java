/**
 * @author MarcosMerino
 *
 * @date 04-06-2025
 *
 * Clase Categoría
 * Se encarga de identificar cada evento y organizarlo mediante grupos según su estilo
 */


public class Categoria {
    private int id;
    private String nombre;
    private String descripcion;

    public Categoria(String nombre, String descripcion) {
        this.id++;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
