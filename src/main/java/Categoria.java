public class Categoria {
    private int id;
    private String nombre;
    private String descripcion;

    public Categoria(String nombre, String descripcion) {
        this.id++;
        this.nombre = nombre;
        this.descripcion = descripcion;
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
