package LogicNotes;

import java.util.Scanner;

public class RecorrerUnArrayUsandoWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] ages = new int[7];

        int i = 0;

        while (i < 7) {
            System.out.println("Ingrese la edad :" + (i+1));
            ages[i] = sc.nextInt();
            i++;
        }

        int j = 0;     //Se declara este nuevo indice ya que el i se agota si lo envío a imprimir bucle
            //Ahora queremos imprimir el bucle, debemos usar un while

        while(j<7) {
            System.out.println("Edad:" + (j+1)+ ": " + ages[j] );
            j++;
        }                                           //ages es la variable a recorrer

    }
}
