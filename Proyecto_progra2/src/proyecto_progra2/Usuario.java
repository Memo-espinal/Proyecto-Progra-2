
package proyecto_progra2;


public class Usuario {
    String nombre;
    int id ;
    String contrasena;

    public Usuario() {
    }

    public Usuario(String nombre, int id, String contrasena) {
        this.nombre = nombre;
        this.id = id;
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", id=" + id + ", contrasena=" + contrasena + '}';
    }
    
}
