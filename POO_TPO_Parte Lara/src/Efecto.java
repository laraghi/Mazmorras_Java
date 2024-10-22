public class Efecto {
    private String nombre;  //Ej: "Fuego", "Hielo", "Cegués", etc.
    private String descripcion; //Una corta descripción del efecto que sea accesible para el jugador
    private int efect;      // 0 = defensa, 1 = ataque, 2 = bono
    private int valor;  //El valor en el cual incrementa/disminuye

    public Efecto(String nombre, String descripcion, int efect, int valor) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.efect = efect;
        this.valor = valor;
    }

    public String getNombre() {return nombre;}
    public String getDescripcion() {return descripcion;}
    public int getEfect() {return efect;}
    public int getValor() {return valor;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}
    public void setEfect(int efect) {this.efect = efect;}
    public void setValor(int valor) {this.valor = valor;}
}
