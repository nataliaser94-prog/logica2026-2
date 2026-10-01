package LogicNotes;

public class CasoDoWhileContadorErrores {

    public static void main(String[] args) {

        int contador = 0;

        do {

            System.out.println("Se equivocó " + ++contador);
            //Los ++ adelantan el autoincremento

        }while (contador < 3);
    }
}
