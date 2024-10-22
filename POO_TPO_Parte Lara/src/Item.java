public class Item {
    private String itemName;            //El nombre del item obtenido
    private String itemDescription;     //Una pequeña descripción del item
    private String itemTipe;           //Puede ser de tipo armadura, artefacto o arma
    private Efecto itemEfecto;      //Un item tiene un determinado efecto

    public Item(String itemName, String itemDescription, String itemTipe, Efecto itemEfecto) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemTipe = itemTipe;
        this.itemEfecto = itemEfecto;
    }

    public String getItemName() {return itemName;}
    public void setItemName(String itemName) {this.itemName = itemName;}
    public Efecto getItemEfecto() {return itemEfecto;}
    public void setItemEfecto(Efecto itemEfecto) {this.itemEfecto = itemEfecto;}
    public String getItemTipe() {return itemTipe;}
    public void setItemTipe(String itemTipe) {this.itemTipe = itemTipe;}
    public String getItemDescription() {return itemDescription;}
    public void setItemDescription(String itemDescription) {this.itemDescription = itemDescription;}

    public String infoItem(){   //Devuelve un texto con la infromación del item
        return "      -" + itemName + " \n       Descrpción: \n       " + itemDescription + "      -Tipo " + itemTipe + "\n       Efecto: " + itemEfecto;
    }
}