package BilleteraVirtual;

import java.util.Locale;
import java.util.Scanner;

public class DoWhileAdivina {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String respuesta;
        int intentos = 0;
        final int MAX_INTENTOS = 3;
        boolean acerto;

        System.out.println("Tiene dientes y no come, tiene cabeza y no es hombre.");

        do {
            System.out.print("¿Qué es?...");
            respuesta = sc.nextLine().trim().toLowerCase();
            intentos++;

            acerto = respuesta.equals("ajo");

            if (!acerto && intentos < MAX_INTENTOS) {
                System.out.println("Intenta otra vez: " + (MAX_INTENTOS - intentos));
                if (intentos == 1) {
                    System.out.println("Pista: Se usa en la cocina.");
                } else {
                    System.out.println("Pista: tiene olor fuerte.");
                }
            }
        }    while (!acerto && intentos < MAX_INTENTOS);

                if (acerto) {
                    System.out.println("¡Correcto! Lo lograste en " + intentos + " intento(s).");
                } else {
                    System.out.println("Se acabaron los intentos. Era: el ajo");
                }
            }

        }