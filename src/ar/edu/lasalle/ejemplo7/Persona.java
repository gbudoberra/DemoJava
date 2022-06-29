package ar.edu.lasalle.ejemplo7;

public class Persona {
    public int dni;
    public String nombre;
    public String apellido;
    private int plata;

    public int getPlata() {
        return plata;
    }

    public void setPlata(int plata) {
        if (plata < 0 || plata > 10000)
            return;
        this.plata = plata;
    }

    public Persona(int dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        plata = 0;
    }


}
