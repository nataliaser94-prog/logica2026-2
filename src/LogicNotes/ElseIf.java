package LogicNotes;

import java.util.Scanner;

public class ElseIf{

    public static void main(String[] args){
        //el sc es una forma de llamar como el leer de pseint

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su peso: ");

        float peso = sc.nextFloat();

       System.out.println("Ingrese su altura: ");

       float altura = sc.nextFloat();

       float imc = Math.round(peso/(altura * altura));

    if (imc < 18.5)
    { System.out.println("Su imc es: " + imc + "Corresponde a bajo bajo");

    }else if (imc > 18.5 && imc < 24.9){
        System.out.println("Su imc es: " + imc + "Corresponde a peso normal");

    }else if(imc > 25.0 && imc < 29.9) {

        System.out.println("Su imc es: " + imc + "Corresponde a sobrepeso");

    }else{
        System.out.println("Su imc es: " + imc + "Corresponde a obesidad");
    }
  }
}
