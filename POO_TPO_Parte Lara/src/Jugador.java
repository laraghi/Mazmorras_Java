public class Jugador extends Personaje{
    private int vidaActual;         //Se trata de la vida que irá siendo modificada deo jugador
    private int puntos;             //Se irán suamndo a medida que abance por los pisos
    private Inventario inventario;  //Coemnzará siendo vacío y se llenará con los objetos que el jugador ocnsiga
    private Equipamiento equipamiento;  //Será los items, dentro de su inventario, que tengan efecto sobre el jugador

    public Jugador(String nombre, int vida, int defensa, int danio, int bono) {
        super(nombre, vida, defensa, danio, bono);
        this.vidaActual = vida;
        this.puntos = 0;
        this.inventario = new Inventario();
        this.equipamiento = new Equipamiento();
    }

    public Jugador(String nombre){
        super();
        this.setNombre(nombre);
        this.setVida(50);
        this.setDefensa(10);
        this.setDanio(2);
        this.setBono(2);
        this.vidaActual = this.getVida();
        this.puntos = 0;
        this.inventario = new Inventario();
        this.equipamiento = new Equipamiento();
    }
    public void aplicarEfecto(Efecto efecto){
        switch (efecto.getEfect()) {
            case 0: //Afecta la defensa
                defensa += efecto.getValor();
                System.out.println("La defensa se ha modificado en " + efecto.getValor());
                break;
            case 1: //Afecta al daño
                danio += efecto.getValor();
                System.out.println("El ataque de se ha modificado en " + efecto.getValor());
                break;
            case 2: //Afecta el bono
                bono += efecto.getValor();
                System.out.println("El bono de se ha modificado en " + efecto.getValor());
                break;
            default:
                System.out.println("No se puede aplicar el efecto");
        }
    }
    public void equiparItem(String nombreItem){
        Item item = inventario.obtenerItem(nombreItem);
        if (item == null) {
            System.out.println("No se puede equipar el item");
        } else {
            Item itemReemplazado = equipamiento.equipar(item);
            inventario.removerItem(item);
            if (itemReemplazado != null) {
                equipamiento.equipar(itemReemplazado);
                System.out.println("Se ha remplazado por el item: " + item.getItemName() + ".");
            }
        }
    }

    public void reempleazarArtefacto(String nombreArtefacto, int slot){
        Item item = inventario.obtenerItem(nombreArtefacto);
        if (item == null) {
            System.out.println("No se puede reemplazar el item");
        } else if (!item.getItemTipe().equals("artefacto")){
            System.out.println("Este item no es un artefacto.");
        } else {
            Item itemReemplazado = equipamiento.reemplazarItem(item,slot);
            if (itemReemplazado != null) {
                inventario.addItem(itemReemplazado);
            }
        }
    }
    public void mostrarEquipamiento(){
        equipamiento.visualizarEquipamiento();
    }
    public void agregarAlInventario(Item item){inventario.addItem(item);}
}