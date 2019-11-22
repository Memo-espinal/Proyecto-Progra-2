
package proyecto_progra2;

import javax.crypto.Mac;


public class Usuario {
    String nombre;
    String id ;
    String contrasena;
    Usuario tipo;//puede ser administrador ,magistrado, elector o miembro de mesa
    String roll;//ifual que tipo pero para agarrarlo como string primero

    public Usuario() {
    }

    public Usuario( String id ,String nombre, String contrasena,String roll) {
        this.nombre = nombre;
        this.id = id;
        this.contrasena = contrasena;
        setTipo(roll);//make final?
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }
    

    public Usuario getTipo() {
        return tipo;
    }

    public void setTipo(String roll) {
        if (roll.equals("administrador")) {
            this.tipo= new Administrador();
        }else if(roll.equals("magistrado")){
            this.tipo= new Magristrados();
        }else if(roll.equals("elector")){
            this.tipo= new Elector();
        }else if (roll.equals("miembro de mesa")){
            this.tipo= new Miembro_mesa();
        }
    }
    

    @Override
    public String toString() {
       //return "Usuario{" + "nombre=" + nombre + ", id=" + id + ", contrasena=" + contrasena + '}';
       return nombre;
    }
    
}
