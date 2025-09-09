package Java.Guia1.dominio;

import java.time.LocalDate;

public class Reserva {

    private Pasajero pasajero;
    private Habitacion habitacion;
    private LocalDate fechaIngreso;
    private LocalDate fechaEgreso;

    public Reserva(Pasajero pasajero, Habitacion habitacion, LocalDate ingreso, LocalDate egreso) {
        this.pasajero = pasajero;
        this.habitacion = habitacion;
        this.fechaIngreso = ingreso;
        this.fechaEgreso = egreso;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public LocalDate getFechaEgreso() {
        return fechaEgreso;
    }

    @Override
    public String toString() {
        return fechaIngreso + " - " + fechaEgreso;
    }

}
