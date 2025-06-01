public class Ubicacion {
    private int id;
    private boolean online;
    private String direccion;

    public Ubicacion(boolean online, String direccion) {
        this.id++;
        this.online = online;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Ubicacion{" +
                "id=" + id +
                ", online=" + online +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
