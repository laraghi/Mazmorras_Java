abstract class Personaje {
    protected String nombre;        //Todos los personajes dentro del juego tendrán un determiando nombre que los defina
    protected int vida;             //Esta es la vida máxima para cada tipo de personaje
    protected int defensa;
    protected int danio;
    protected int bono;

    public Personaje(String nombre, int vida, int defensa, int ataque, int bono) {
        this.nombre = nombre;
        this.vida = vida;
        this.defensa = defensa;
        this.danio = ataque;
        this.bono = bono;
    }

    public Personaje() {}

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public int getVida() {return vida;}
    public void setVida(int vida) {this.vida = vida;}
    public int getDefensa() {return defensa;}
    public void setDefensa(int defensa) {this.defensa = defensa;}
    public int getDanio() {return danio;}
    public void setDanio(int danio) {this.danio = danio;}
    public int getBono() {return bono;}
    public void setBono(int bono) {this.bono = bono;}

    public boolean estaVivo(){
        return this.vida > 0;
    }
    public void recivirDaño(int danio) {
        this.vida -= danio;
        System.out.println(this.nombre + " recibió un total de " + danio + " de daño.");
        if (!this.estaVivo()) {
            System.out.println(" -  " + this.getNombre() + " está muerto.");
        }
    }

    public void recibirDaño(int daño){
        vida -= daño;
        if (vida <= 0) {
            System.out.println("Se ha eliminado a " + this.getNombre());
        }
    }

    public void atacar(Personaje personaje){
        int resultadoAtaque = Dado.lanzar() + this.bono;
        if (resultadoAtaque >= personaje.getDefensa()) {
            personaje.recibirDaño(this.danio);
            System.out.println(" - " + this.nombre + " ha atacado a " + personaje.getNombre() + " con un total de " + this.getDanio() + " de daño.");
        } else {
            System.out.println(" - " + personaje.getNombre() + " ha esquivado el ataque de " + this.getNombre());
        }
    }

}
