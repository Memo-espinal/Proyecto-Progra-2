
package proyecto_progra2;

import java.util.ArrayList;

// aqui hay una cagada, cada municipio tiene diferentes mesas electorales
//aka hay varias mesas en un solo lugar ejemplo: la miraflores alli hay varias mesas electorales pero solo es en un lugar
public class Mesa_electoral {
    int codigo;
    String ubicacion;
    Double ubicacion_x_lat_long;//???
    ArrayList<Elector> electores= new ArrayList<>();
    ArrayList<Miembro_mesa> miembros_mesa= new ArrayList<>();
    String reporte;//??
    // este reporte o acta se puede anular por el magistrado, osea que le podemos poner un boolean para anular?
}
