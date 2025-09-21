package Guia2;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        try{
            Scanner sc = new Scanner(System.in);
        String usuario, passwd;
        System.out.print("Ingrese su nombre: ");
        usuario = sc.nextLine();
        System.out.print("Ingrese la contraseña del user "+usuario+":");
        passwd = sc.nextLine().trim();
        
        System.out.print("Ingrese 1 (Guardar texto secreto), 2 (Mostrar )");
        int opcion = sc.nextInt();
        sc.nextLine();
        switch (opcion) {
            case 1:
                System.out.print("Ingrese su secreto: ");
                break;
            case 2:
            mostrarSecreto()

            default:
                throw new AssertionError();
        }
        }

        }
        
    }

/*def Splash (mommy)
   if mommy like me 
   mommy=suck my dick
   else 
   suck=othermommys
#SoloUsarEnEmegergencia*/
