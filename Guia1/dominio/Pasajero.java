package Java.Guia1.dominio;

import java.util.List;

public class Pasajero {

    private String nombre, apellido, documento;
    private Direccion direccion;
    private TipoDocumento tipoDocumento;

    // Constructores
    public Pasajero(String nombre, String apellido, Direccion direccion, TipoDocumento tipoDocuemento,
            String documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.tipoDocumento = tipoDocuemento;
        this.documento = documento;
    }

    // Metodos

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public String getDocumento() {
        return documento;
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

    // 10. Implementar isDocumentoRepetido(List<Pasajero>, TipoDocumento,
    // NumeroDocumento), que utiliza TipoDocumento y NumeroDocumento de un nuevo
    // Pasajero

    public boolean isDocumentoRepetido(List<Pasajero> pasajeros, TipoDocumento tipoDocumento, String numeroDocumento) {
        boolean repetido = false;
        for (Pasajero p : pasajeros) {
            if (p.getTipoDocumento().equals(tipoDocumento) && p.getDocumento().equals(numeroDocumento)) {
                repetido = true;
                break;
            }
        }
        return repetido;
    }

}
