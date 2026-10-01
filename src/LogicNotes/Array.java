package LogicNotes;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = {"Maria" ,"Luis" , "Juan"};

        int ages[] = new int[4];

        //Vamos a mandar valores al array

        ages[0] = 23;

        ages[1] = 26;

        ages[2] = 34;

        ages [3] = 19;

        //Si quiero imprimir, puedo llamar la variable con la posición

        System.out.println("Posición 1:" + ages[0]);
        System.out.println("Posición 2:" + ages[1]);
        System.out.println("Posición 3:" + ages[2]);
        System.out.println("Posición 4:" + ages[3]);


        //Podemos usar scanner para capturar datos desde la consola

        double [] salaries = new double[3];

        salaries[0] = sc.nextDouble();
        salaries[1] = sc.nextDouble();
        salaries[2] = sc.nextDouble();

        System.out.println(salaries[0] + "\n" + salaries[1]+ "\n" + salaries[2]);
    }
}
