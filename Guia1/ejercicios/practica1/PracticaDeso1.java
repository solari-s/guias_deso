package Java.Guia1.ejercicios.practica1;

import Java.Guia1.dominio.*;
import java.time.LocalDate;

public class PracticaDeso1 {
    public static void main(String[] args) {

        // 1. Implementar main, imprimiendo “Hola mundo” por consola.

        System.out.println("Hola mundo");

        // 2. Instanciar 3 Pasajeros, incorporando la información correspondiente
        // (nombre, dirección, etc).

        Direccion d1 = new Direccion("Rivadavia 123", "Argentina", "Buenos Aires");
        Direccion d2 = new Direccion("Ituzaingo 420", "Uruguay", "Montevideo");
        Direccion d3 = new Direccion("Victoria 321", "Chile", "Valparaíso");

        Pasajero p1 = new Pasajero("Juan", "Debona", d1);
        Pasajero p2 = new Pasajero("Lucas", "Dominguez", d2);
        Pasajero p3 = new Pasajero("Pedro", "Perez", d3);

        // 4. Construir un array que contenga los 3 Pasajeros, y luego recorrerlo para
        // imprimir el nombre y apellido de cada uno de ellos.

        Pasajero vectorPasajero[] = { p1, p2, p3 };
        for (int i = 0; i < vectorPasajero.length; i++) {
            System.out.println(vectorPasajero[i].toString());
        }

        // 6. Instanciar 3 Habitaciones. 2 de un mismo tipo y 1 de un tipo diferente.
        // Creando los enum (o clases) TipoHabitacion y enum EstadoHabitacion.

        Habitacion h1 = new Habitacion(1, TipoHabitacion.DOBLE, EstadoHabitacion.DISPONIBLE, 100.0);
        Habitacion h2 = new Habitacion(2, TipoHabitacion.DOBLE, EstadoHabitacion.NO_DISPONIBLE, 100.0);
        Habitacion h3 = new Habitacion(3, TipoHabitacion.SUITE, EstadoHabitacion.DISPONIBLE, 300.0);

        // 9. Crear dos objetos Reserva con Pasajero, Habitacion, fechaIngreso,
        // fechaEgreso y probar el método previamente implementado.

        Reserva r1 = new Reserva(p1, h1, LocalDate.of(25, 05, 11), LocalDate.of(25, 05, 22));
        Reserva r2 = new Reserva(p2, h2, LocalDate.of(24, 02, 01), LocalDate.of(24, 03, 1));

        System.out.println(h1.isDisponible(LocalDate.of(25, 05, 11), LocalDate.of(25, 05, 22)));

        /*
         * 11. Crear una clase abstracta Pago con el atributo importe y el método
         * abstracto
         * registrarPago(importe):
         * ○ Crear 2 clases que hereden de Pago: Cheque y Efectivo.
         * i. Al ejecutarse registrarPago en Cheque, se debe imprimir “Pago con cheque
         * registrado”.
         * ii. Al ejecutarse registrarPago en Efectivo, se debe imprimir “Efectivo
         * procesado”
         * ○ Instanciar objetos de cada clase concreta, crear una lista con los objetos,
         * recorrerla
         * con forEach y llamar al método registrarPago para ver qué ocurre.
         * ○ Crear un objeto Cheque que modifique el comportamiento del método registrar
         * pago,
         * sin modificar la clase Cheque original.
         */

    }
}
