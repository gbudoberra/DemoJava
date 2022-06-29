package ar.edu.lasalle.ejemplo7;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona pepe = new Persona(1234, "pepe", "Lopez");
        System.out.println(pepe.dni);
        System.out.println(pepe.nombre);
        System.out.println(pepe.apellido);

//        System.out.println(pepe.plata); // no anda porque es private
//        pepe.plata = 1000000;           //estaria mal que yo pueda modificarlo asi nomas?
//        pepe.plata = -125;           //estaria mal que yo pueda modificarlo asi nomas?

    }
}
