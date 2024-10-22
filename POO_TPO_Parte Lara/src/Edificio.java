public class Edificio {
    private Piso[] pisos = new Piso[10]; //En un edificio deben haber un máximo de 10 pisos, con un total de un máximo de 10 bosses

    public Edificio(Piso[] pisos) {
        this.pisos = pisos;
    }
    public void bienvenida(){
        System.out.println("Bienvenido al Edificio!");
    }
}