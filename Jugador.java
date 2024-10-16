package TP;

public class Jugador extends Personaje{
    private int nivel;
    private int experiencia;
    private Bonus[] inventario;

    public Jugador(String nombre, int vida, int defensa, int ataque, int nivel, int experiencia, Bonus[] inventario) {
        super(nombre,vida,defensa,ataque);
        this.nivel = nivel;
        this.experiencia = experiencia;
        this.inventario = inventario;
    }




}
