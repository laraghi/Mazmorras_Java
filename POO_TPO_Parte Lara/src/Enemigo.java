public class Enemigo extends Personaje{
    private int numPiso;    //Cada enemigo tiene asignado un piso

    public Enemigo(String nombre, int vida, int defensa, int danio, int bono, int numPiso) {
        super(nombre, vida, defensa, danio, bono);
        this.numPiso = numPiso;
    }

    public int getNumPiso() {return this.numPiso;}
    public void setNumPiso(int numPiso) {this.numPiso = numPiso;}
}
