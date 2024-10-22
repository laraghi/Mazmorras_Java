public class Piso {
    private int numPiso;        //Se enumeran los pisos desde el 1 hasta el 10
    private MiniBoss miniBoss;  //Cada piso tiene por lo menos un miniBoss (hacer para que se haya hasta un máximo de 5)
    private Boss boss;          //Cada piso tiene su Boss asignado
    private Aliado aliado;      //Cada piso puede o no tener un aliado

    public Piso(int numPiso, MiniBoss miniBoss, Boss boss,Aliado aliado) {
        this.numPiso = numPiso;
        this.miniBoss = miniBoss;
        this.boss = boss;
        this.aliado = aliado;
    }
    public int getNumPiso() {return numPiso;}
    public String getMiniBoss(){return miniBoss.getNombre();}
    public String getBoss(){return boss.getNombre();}
    public String getAliado(){return aliado.getNombre();}
}