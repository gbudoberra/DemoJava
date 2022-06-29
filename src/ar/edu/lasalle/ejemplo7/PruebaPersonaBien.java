package ar.edu.lasalle.ejemplo7;

public class PruebaPersonaBien {
    public static void main(String[] args) {
        Persona pepe = new Persona(1234, "pepe", "Lopez");
        System.out.println(pepe.dni);
        System.out.println(pepe.nombre);
        System.out.println(pepe.apellido);

        System.out.println(pepe.getPlata());
        pepe.setPlata(1000000);           //estaria mal que yo pueda modificarlo asi nomas?
        System.out.println(pepe.getPlata()); // no anda porque es private
        pepe.setPlata(-3);           //estaria mal que yo pueda modificarlo asi nomas?
        System.out.println(pepe.getPlata()); // no anda porque es private
        pepe.setPlata(10);           //estaria mal que yo pueda modificarlo asi nomas?
        System.out.println(pepe.getPlata()); // no anda porque es private

    }
}
