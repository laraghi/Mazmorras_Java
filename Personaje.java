package TP;

abstract class Personaje {
    // Clase abstracta que define los atributos basicos para Jugador y enemigo
    private String nombre;
    private int vida;
    private int defensa;
    private int ataque;
    private Bonus bonus;
    private boolean estado; //True si esta vivo

    public Personaje(String nombre, int vida, int defensa, int ataque) {
        this.nombre = nombre;
        this.vida = vida;
        this.defensa = defensa;
        this.ataque = ataque;
    }



}
