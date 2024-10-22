public class Boss extends Enemigo{
    private Efecto efecto; //Los enemigos de tipo "Boss" podrán tener un efecto sobre el jugador

    public Boss(String nombre, int vida, int defensa, int danio, int bono, int numPiso, Efecto efecto) {
        super(nombre, vida, defensa, danio, bono, numPiso);
        this.efecto = efecto;
    }
    public Efecto getEfecto() {return efecto;}
    public void setEfecto(Efecto efecto) {this.efecto = efecto;}

    @Override //El efecto del "Boss" afecta al jugador úncamente si el mismo consigue atcarlo y el Boss tiene un efecto asignado
    public void atacar(Personaje objetivo) {
        super.atacar(objetivo);
        if (efecto != null && objetivo instanceof Jugador) {
            aplicarEfecto((Jugador) objetivo);
        }
    }

    public void aplicarEfecto(Jugador objetivo) {
        System.out.println("¡El Boss aplica el efecto: " + efecto.getNombre() + " sobre " + objetivo.getNombre() + "!");
        objetivo.aplicarEfecto(efecto);
    }
}

