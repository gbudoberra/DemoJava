package ar.edu.lasalle.ejempo5;

public class Ejemplo5 {

    //Atributos
    private int x;

    public int getXCuadrado() {
        return this.x*this.x;
    }

    public Ejemplo5(int pepe) {
        this.x = pepe;
    }

    public static void main(String[] args) {
        Ejemplo5 var = new Ejemplo5(5);
        var.x = 6;
        System.out.println(var.getXCuadrado());
    }
}
