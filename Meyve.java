//soru 2 get/set ve constructor metodlar

package Meyveler;

public class Meyve {

    private int ID;
    private String FruitName;
    private String FruitColor;
    private int Quantity;




    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFruitName() {
        return FruitName;
    }

    public void setFruitName(String fruitName) {
        FruitName = fruitName;
    }

    public String getFruitColor() {
        return FruitColor;
    }

    public void setFruitColor(String fruitColor) {
        FruitColor = fruitColor;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = Quantity;
    }


    public Meyve(int ID, String FruitName, String FruitColor, int Quantity) {
        this.ID = ID;
        this.FruitName = FruitName;
        this.FruitColor = FruitColor;
        this.Quantity = Quantity;
    }
}








