package LogicNotes;

import java.util.Scanner;

public class ValidadorDeTipos {

    public static Scanner sc   = new Scanner(System.in);

    public static int validarEnteros(){

        int value = sc.nextInt();

        return value;
    }

    public static String validarString()
    {
        String value = sc.nextLine();

        return value;
    }



    }
