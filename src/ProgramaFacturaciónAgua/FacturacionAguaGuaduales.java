package ProgramaFacturaciónAgua;

import java.util.Scanner;

public class FacturacionAguaGuaduales {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] consumos = new double[6];
        int opcion;

        do {
            mostrarMenu();
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    registrarConsumo(consumos);
                    break;
                case 2:
                    consultarFactura(consumos);
                    break;
                case 3:
                    generarReporte(consumos);
                    break;
                case 4:
                    System.out.println("Saliendo del programa... ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 4);
    }

    // ===== MENÚ =====
    public static void mostrarMenu() {
        System.out.println();
        System.out.println(" LOS GUADUALES - CONTROL DE AGUA ");
        System.out.println("1. Registrar consumo de un apartamento");
        System.out.println("2. Consultar factura de un apartamento");
        System.out.println("3. Ver reporte general del conjunto");
        System.out.println("4. Salir");
        System.out.print("Elija una opción: ");
    }

    // Opción 1
    public static void registrarConsumo(double[] consumos) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número de apartamento (1-6): ");
        int apto = sc.nextInt();
        while (apto < 1 || apto > 6) {
            System.out.print("Apartamento inválido. Ingrese un número de 1 a 6: ");
            apto = sc.nextInt();
        }

        System.out.print("Consumo del mes en m3: ");
        double consumo = sc.nextDouble();
        while (consumo <= 0) {
            System.out.print("Consumo inválido. Debe ser mayor que 0: ");
            consumo = sc.nextDouble();
        }

        consumos[apto - 1] = consumo; // si ya tenía valor, se reemplaza
        System.out.println("Consumo registrado para el apartamento " + apto + ".");
    }

    // Opción 2
    public static void consultarFactura(double[] consumos) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número de apartamento (1-6): ");
        int apto = sc.nextInt();
        while (apto < 1 || apto > 6) {
            System.out.print("Apartamento inválido. Ingrese un número de 1 a 6: ");
            apto = sc.nextInt();
        }

        if (consumos[apto - 1] == 0) {
            System.out.println("El apartamento " + apto + " no tiene consumo registrado");
        } else {
            imprimirFactura(apto, consumos[apto - 1]);
        }
    }

    // Cálcular factura e impremirla
    public static void imprimirFactura(int apartamento, double consumo) {
        // valores que no cambian
        double CARGO_FIJO = 12000;
        double TARIFA1 = 3000;     // hasta 10 m3
        double TARIFA2 = 4500;     // más de 10 y hasta 20 m3
        double TARIFA3 = 6000;     // más de 20 m3
        double LIMITE_EXCESO = 25;  // más de 25 m3 = consumo excesivo
        double PORC_RECARGO = 0.10; // 10 %

        double tarifa;
        if (consumo <= 10) {
            tarifa = TARIFA1;
        } else if (consumo <= 20) {
            tarifa = TARIFA2;
        } else {
            tarifa = TARIFA3;
        }

        double valorConsumo = consumo * tarifa;
        double subtotal = CARGO_FIJO + valorConsumo;
        double recargo = 0;
        if (consumo > LIMITE_EXCESO) {
            recargo = subtotal * PORC_RECARGO;
        }
        double total = subtotal + recargo;

        System.out.println();
        System.out.println("FACTURA APARTAMENTO " + apartamento + "     ");
        System.out.println("Consumo:  " + consumo + " m3");
        System.out.println("Tarifa aplicada:    $" + tarifa + " por m3");
        System.out.println("Valor del consumo:  $" + valorConsumo);
        System.out.println("Cargo fijo:         $" + CARGO_FIJO);
        if (recargo > 0) {
            System.out.println("Recargo (10%):      $" + recargo);
        }
        System.out.println("TOTAL A PAGAR:      $" + total);
        if (recargo > 0) {
            System.out.println("ALERTA: consumo excesivo");
        }
        System.out.println("       ");
    }


        }


