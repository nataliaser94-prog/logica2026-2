package LogicNotes;

import java.util.Scanner;

public class RecorrerUnArrayConNombre {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] name = new String[4];


        int i = 0;
        while (i < 4) {
            System.out.println("Ingrese un nombre :" + (i+1));
            name[i] = sc.nextLine();
            i++;

        }

        int j = 0;     //Se declara este nuevo indice ya que el i se agota si lo envío a imprimir bucle
        //Ahora queremos imprimir el bucle, debemos usar un while

        while(j<4) {
            System.out.println("Nombre:" + (j+1)+ ": " + name[j] );
            j++;
        }
    }
}