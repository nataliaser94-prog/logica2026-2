package BilleteraVirtual;

import java.util.Scanner;

import static LogicNotes.ValidadorDeTipos.sc;

public class BilleteraVirtual {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        String correo;
        String telefono;
        String contrasena;
        String UsuarioLogin;
        String passwordLogin;

        System.out.println("Ingrese nombre: " );
        name = sc.nextLine();
        System.out.println("Ingrese correo: " );
        correo = sc.nextLine();
        System.out.println("Ingrese telefono: " );
        telefono = sc.nextLine();
        System.out.println("Ingrese contraseña: " );
        contrasena = sc.nextLine();

//Login
        System.out.println("Ingrese el usuario registrado; puede usar su correo o su telefono" );
        UsuarioLogin = sc.nextLine();
        System.out.println("Ingrese su contraseña registrada" );
        passwordLogin = sc.nextLine();

        if ((UsuarioLogin.equals(correo) || UsuarioLogin.equals(telefono)) && passwordLogin.equals(contrasena)) {
            System.out.println("Bienvenido: " + name);

            double saldo = 500000;
            boolean salir = false;   // Controla cuándo termina el bucle
            int opcion;

            System.out.println("=====================================");
            System.out.println("   BIENVENIDO A SU BILLETERA VIRTUAL   ");
            System.out.println("=====================================");

            while (salir == false) {
                System.out.println();
                System.out.println("------------- MENÚ -------------");
                System.out.println("1. Consultar saldo");
                System.out.println("2. Depositar dinero");
                System.out.println("3. Retirar dinero");
                System.out.println("4. Salir");
                System.out.print("Elija una opción: ");


                if (sc.hasNextInt()) {

                    opcion = sc.nextInt();

                    switch (opcion) {
                        case 1:
                            System.out.println("Su saldo actual es: $" + saldo);
                            break;

                        case 2:
                            System.out.print("Ingrese el valor a depositar: $");
                            double deposito = sc.nextDouble();
                            if (deposito > 0) {
                                saldo = saldo + deposito;
                                System.out.println("Depósito exitoso. Nuevo saldo: $" + saldo);
                            } else {
                                System.out.println("El valor a depositar debe ser mayor que cero.");
                            }
                            break;

                        case 3:
                            System.out.print("Ingrese el valor a retirar: $");
                            double retiro = sc.nextDouble();
                            if (retiro <= 0) {
                                System.out.println("El valor a retirar debe ser mayor que cero.");
                            } else if (retiro > saldo) {
                                System.out.println("Fondos insuficientes. Su saldo es: $" + saldo);
                            } else {
                                saldo = saldo - retiro;
                                System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
                            }
                            break;

                        case 4:
                            salir = true; // Hace que el bucle while termine
                            System.out.println("Gracias por usar tu billetera. ¡Hasta pronto!");
                            break;

                        default:
                            System.out.println("Opción no válida. Intente de nuevo.");
                            break;
                    }

                } else {
                    System.out.println("Entrada no válida. Debe escribir un número del 1 al 4.");
                    sc.next(); // Descarta lo que se escribió mal
                }
            }

        }else {
            System.out.println("Valida tus credenciales");
        }
    }
}
