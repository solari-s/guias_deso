package Java.Guia1.dominio;

import java.time.LocalDate;

public class Habitacion {

    private int numero;
    private TipoHabitacion tipo;
    private EstadoHabitacion estado;
    private double costoXNoche;
    private Reserva reserva;

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

    public Reserva getReserva() {
        return reserva;
    }

    // 7. Implementar un método sortHabitacionesByPrice(), el cual recibe una lista
    // de Habitaciones y las retorna ordenadas de mayor a menor por su costo por
    // noche.

    public void sortHabitacionesByPrice(Habitacion lista[]) {

        for (int i = 0; i < lista.length - 1; i++) {
            for (int j = 0; j < lista.length; j++) {
                if (lista[i].getCostoXNoche() < lista[j].getCostoXNoche()) {
                    Habitacion aux = lista[i];
                    lista[i] = lista[j];
                    lista[j] = aux;
                }
            }
        }

    }

    // 8. Implementar en Habitación el método isDisponible(fecha) que devuelva true
    // si la habitación no está reservada en esa fecha

    public boolean isDisponible(LocalDate fechaIngreso, LocalDate fechaEgreso) {
        boolean reservada = true;
        if (this.getReserva().getFechaIngreso() != fechaIngreso && this.getReserva().getFechaEgreso() != fechaEgreso) {
            reservada = false;
        }
        return reservada;
    }

}