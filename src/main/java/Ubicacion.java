/**
 * @author MarcosMerino
 *
 * @date 04-06-2025
 *
 * Clase Ubicacion
 * Clase que guarda la dirección donde dará lugar el evento, ya sea online o presencial
 */

public class Ubicacion {
    private int id;
    private boolean online;
    private String direccion;

    public Ubicacion(boolean online, String direccion) {
        this.id++;
        this.online = online;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
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
