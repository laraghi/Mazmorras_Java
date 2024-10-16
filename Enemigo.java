package TP;

public class Enemigo extends Personaje{
    private String tipo;

    public Enemigo(String nombre, int vida, int defensa, int ataque, String tipo) {
        super(nombre,vida,defensa,ataque);
        this.tipo = tipo;
    }

}
