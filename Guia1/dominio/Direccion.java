package Java.Guia1.dominio;

public class Direccion {

    private String calle, provincia, pais;

    public Direccion(String calle, String pais, String provincia) {
        this.calle = calle;
        this.pais = pais;
        this.provincia = provincia;
    }

    public String getCalle() {
        return calle;
    }

    public String getPais() {
        return pais;
    }

    public String getProvincia() {
        return provincia;
    }

}
