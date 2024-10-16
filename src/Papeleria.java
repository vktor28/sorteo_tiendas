
/**
 * @author Victor Juarez
 * @see SorteoClientes
 */
public class Papeleria implements SorteoClientes {
    private String nombre;
    private int telefono;
    /**
    * @param nombre indica el nombre
     * @param telefono indica el telefono
    */

    public Papeleria() {
    }

    public Papeleria(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    /**
     * Este método es para inscribir usuarios de las tiendas que le pasamos.
     * @param nombre es el nombre del usuario
     * @param telefono es el nombre del usuario
     * @see Informatica
     * @see Clientes
     */
    public void inscribirDatos(String Nombre, int telefono){
        System.out.println("Usuario de la tienda de informática inscrito en el sorteo");
        System.out.println("Usuario de la Papelería inscrito en el sorteo");
    }
    /**
     * Este método comunica el resuñtado
     */
    public void comunicarResultado(){
        System.out.println("Ha ganado el usuario " + resultadoSorteo + "\n\n");
    }


    @Override
    public String toString() {
        return "Cliente Chucherías: " + getNombre() + " | Tel: " + getTelefono();
    }

    
}
