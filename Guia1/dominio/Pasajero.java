package Java.Guia1.dominio;

public class Pasajero {

    private String nombre, apellido;
    private Direccion direccion;

    // Constructores
    public Pasajero(String nombre, String apellido, Direccion direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }

    // Metodos

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    // 3. Sobreescribir el método toString() de Pasajero, para que retorne el
    // apellido y nombre del mismo, en ese orden, separado con una coma.

    @Override
    public String toString() {
        return this.getApellido() + ',' + this.getNombre();
    }

    // 5. Implementar un método estático getUsuariosFrom(), el cual recibe un List
    // de Pasajeros y un país (String), y retorna la lista de Pasajeros que son de
    // dicho país.

    public void getUsuariosFrom(Pasajero lista[], String pais) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].direccion.getPais() == pais) {
                System.out.println(lista[i].toString());
            }
        }
    }

}
