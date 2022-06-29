package ar.edu.lasalle.ejemplo3;

public class Ejemplo3 {

    //Atributos
    public int numero;

    //Constructor
    public Ejemplo3() {
    }

    public static void main(String[] args) {
        Ejemplo3 var1 = new Ejemplo3();
        var1.numero = 0;
        System.out.println(var1.numero);

        Ejemplo3 var2 = new Ejemplo3();
        var2.numero = 3;
        System.out.println(var2.numero);

    }
}
