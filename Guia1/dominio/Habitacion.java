package Java.Guia1.dominio;

public class Habitacion {

    private int numero;
    private TipoHabitacion tipo;
    private EstadoHabitacion estado;
    private double costoXNoche;

    // Constructores

    public Habitacion(int numero, TipoHabitacion tipo, EstadoHabitacion estado, double costoXNoche) {
        this.numero = numero;
        this.tipo = tipo;
        this.estado = estado;
        this.costoXNoche = costoXNoche;
    }

    // Metodos

    public int getNumeroHabitacion() {
        return numero;
    }

    public EstadoHabitacion getEstadoHabitacion() {
        return estado;
    }

    public TipoHabitacion getTipoHabitacion() {
        return tipo;
    }

    public double getCostoXNoche() {
        return costoXNoche;
    }

    // 7. Implementar un método sortHabitacionesByPrice(), el cual recibe una lista
    // de Habitaciones y las retorna ordenadas de mayor a menor por su costo por
    // noche.

    public void sortHabitacionesByPrice(Habitacion lista[]) {

    }

}
