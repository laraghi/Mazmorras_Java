import java.util.HashMap;
import java.util.Map;

public class Equipamiento {
    private Map<String, Item> equipo;   //Utilizamos un Map para mejorar la navegación en el Equipamiento

    public Equipamiento() {
        equipo = new HashMap<>();   //Hay un límite por cada tipo de item
        equipo.put("arma", null);   //Solo se permite un item de tipo "arma"
        equipo.put("armadura", null); //Solo se permite un item de tipo "armadura"
        equipo.put("artefacto1", null); //Solo se permiten tres items de tipo "artefacto"
        equipo.put("artefacto2", null);
        equipo.put("artefacto3", null);
    }

    //Antes de realizar esto, se debería comprobar que el item exista en el Inventario y una vez se lo equipa, hay que quitarlo del inventario para que no aparezca dos veces
    public Item equipar(Item item) {
        String tipo = item.getItemTipe();
        if (tipo.equals("artefacto")){
            if (equipo.get("artefacto1") == null) {     //Si el espacio de artefacto 1 está libre, se lo incerta allí directamente
                equipo.put("artefacto1", item);
                System.out.println("Has equipado " + item.getItemName() + " como artefacto1");
                return null;
            } else if (equipo.get("artefacto2") == null) {
                equipo.put("artefacto2", item);
                System.out.println("Has equipado " + item.getItemName() + " como artefacto2");
                return null;
            } else if (equipo.get("artefacto3") == null) {
                equipo.put("artefacto3", item);
                System.out.println("Has equipado " + item.getItemName() + " como artefacto3");
                return null;
            } else {
                System.out.println("Ya no tienes espacio para artefactos.");
                return null;
            }
        } else {
            // Falta tmb tener en cuenta en INVENTARIO
            Item itemActual = equipo.get(tipo); //Para armadura y arma, hay tan solo un objeto, por lo que no hace falta analizar cada posibilidad
            if (itemActual != null) {   //Si ya hay un item, se realiza automáticamente el cambio
                System.out.println("Se ha remplazado el item anterior por: " + itemActual.getItemName());
                equipo.put(tipo, itemActual);
            } else { //Si es que está vacío, se agrega de manera inmediata.
                System.out.println("Equipado " + item.getItemName() + " como " + tipo + ".");
            }
            return itemActual;
        }
    }

    public Item reemplazarItem(Item itemNuevo, int artefactoSlot) { //Se busca reemplazar un nuevo item por el item en un Slot definido
        String tipo = itemNuevo.getItemTipe();
        if (!tipo.equals("artefacto")){
            return equipar(itemNuevo);
        } else {
            if (artefactoSlot == 1) {
                Item itemReeplazado = equipo.get("artefacto1");
                equipo.put("artefacto1", itemNuevo);
                System.out.println("Has equipado " + itemNuevo.getItemName() + " como artefacto1");
                return itemReeplazado;
            } else if (artefactoSlot == 2) {
                Item itemReeplazado = equipo.get("artefacto2");
                equipo.put("artefacto2", itemNuevo);
                System.out.println("Has equipado " + itemNuevo.getItemName() + " como artefacto2");
                return itemReeplazado;
            } else if (artefactoSlot == 3) {
                Item itemReeplazado = equipo.get("artefacto3");
                equipo.put("artefacto3", itemNuevo);
                System.out.println("Has equipado " + itemNuevo.getItemName() + " como artefacto3");
                return itemReeplazado;
            } else {
                System.out.println("Slot de artefacto inválido.");
                return null;
            }
        }
    }

    //Se imprime por pantalla todos los items con su tipo definido con un aviso en caso de estar vacíos.
    public void visualizarEquipamiento() {
        System.out.println("Equipamiento actual:");
        System.out.println("Arma: " + (equipo.get("arma") != null ? equipo.get("arma").getItemName() : "No equipado"));
        System.out.println("Armadura: " + (equipo.get("armadura") != null ? equipo.get("armadura").getItemName() : "No equipada"));
        System.out.println("Artefacto 1: " + (equipo.get("artefacto1") != null ? equipo.get("artefacto1").getItemName() : "No equipado"));
        System.out.println("Artefacto 2: " + (equipo.get("artefacto2") != null ? equipo.get("artefacto2").getItemName() : "No equipado"));
        System.out.println("Artefacto 3: " + (equipo.get("artefacto3") != null ? equipo.get("artefacto3").getItemName() : "No equipado"));
    }

}
