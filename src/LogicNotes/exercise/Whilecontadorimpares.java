package LogicNotes.exercise;

class Whilecontadorimpares {
    public static void main(String[] args) {

        int contador = 0;

        while (contador <= 100) {

            if (contador % 2 != 0) {
                System.out.println(contador);
            }
            //el contador ++ se deja afuera del corchete para que pueda correr, lo usual es que el contador crezca por fuera.
            contador++;
        }
    }
}