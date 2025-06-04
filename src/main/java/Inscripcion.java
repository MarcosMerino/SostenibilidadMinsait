/**
 * @author MarcosMerino
 *
 * @date 04-06-2025
 *
 * Clase Inscripcion
 * Guarda las inscripciones de los usuarios y a que eventos se han registrado
 * También se encarga de ver si la inscripión se ha cancelado
 */

public class Inscripcion {
    private int id;
    private Usuario usuario;
    private boolean cancelado;

    public Inscripcion(Usuario usuario, boolean cancelado) {
        this.id++;
        this.usuario = usuario;
        this.cancelado = cancelado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public boolean isCancelado() {
        return cancelado;
    }

    public void setCancelado(boolean cancelado) {
        this.cancelado = cancelado;
    }

    @Override
    public String toString() {
        return "Inscripcion{" +
                "id=" + id +
                ", usuario=" + usuario +
                ", cancelado=" + cancelado +
                '}';
    }
}
