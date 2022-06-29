package ar.edu.lasalle.ejemplo4;

public class Ejemplo4 {

    //Atributos
    public int x;
    public int y;

    public Ejemplo4(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Ejemplo4 var = new Ejemplo4(0, 0);

        System.out.println("hola" + "chau");


        System.out.println("x: " + var.x + "\ny: " + var.y);
        int hola = 8;
        System.out.println(hola);
        var.x = 3;
        var.y = 5;
        System.out.println("nuevo x: " + var.x + "\nnuevoy: " + var.y);

        Ejemplo4 var2 = new Ejemplo4(6,8);
        System.out.println("x: " + var2.x + "\ny: " + var2.y);

    }
}
