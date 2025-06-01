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

    public void cancelarEvento(Evento evento){
        if (evento.getOrganizador().equals(this)){
            evento.cancelarEvento();
        }
        else {
            System.out.println("No eres el organizador de este evento");
        }
    }

}
