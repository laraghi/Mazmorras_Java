public class Aliado {
    private String nombre;          //Nombre designado para el aliado
    private String descripcion;     //Descripción de tipo historia
    private Efecto efecto;          //Efecto que el aliado da
    private int valor;              //Número en el cual incrementará las habilidades del jugador

    public Aliado(String nombre, String descripcion, Efecto efecto, int valor) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.efecto = efecto;
        this.valor = valor;
    }

    public String getNombre() {return nombre;}
    public String getDescripcion() {return descripcion;}
    public Efecto getEfecto() {return efecto;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}
    public void setEfecto(Efecto efecto) {this.efecto = efecto;}
    public int getValor() {return valor;}
    public void setValor(int valor) {this.valor = valor;}

    //Faltaría agregar un public class presentaciónAliado() y public class aplicarBono(Jugador juagador)
}