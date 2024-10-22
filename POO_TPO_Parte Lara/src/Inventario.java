import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Item> items; //Trabajamos ocn una lista a fin de simplificar el trabajo

    public Inventario() {
        items = new ArrayList<>();
    }
    public void addItem(Item item) { //Cuando el jugador se encuentra con un item, se lo añade al inventario
        items.add(item);
        System.out.println("Se ah añadido el item: " + item.getItemName() + " a tu inventario.");
    }

    public List<Item> getItems() { // devuelve una lista con todos los items que se enceuntren dentro de la lista de iventario
        return items;
    }

    public Item obtenerItem(String nombreItem) {        //Devuelve la información de un item en particular perteneciente al inventario que el jugador queira saber
        for (Item item : items) {
            if (item.getItemName().equals(nombreItem)) {
                return item;
            }
        }
        return null;
    }
    public void removerItem(Item item) {items.remove(item);}    //Elimina un item en específico del inventario
}