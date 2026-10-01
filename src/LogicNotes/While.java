package LogicNotes;

import org.w3c.dom.ls.LSOutput;

public class While {

    public static void main(String[] args) {

        System.out.println("Escena he venido a negociar");

        String negociar = "no";

        while (negociar.equals("no"))
        {

            System.out.println("Socio, he venido a negociar:");
            negociar = ValidadorDeTipos.validarString();
        }

    }
}
