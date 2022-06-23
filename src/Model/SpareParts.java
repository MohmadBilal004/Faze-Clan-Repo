
package Model;

/**
 *
 * @author theCodeMonster
 */
public class SpareParts {
    private String nameOfItem;
    private int sparePartID;
    private String category;
    private String brand;
    private int quantity;
    
    
    public SpareParts(int sparePartID, String nameOfItem, String category, String brand, int quantity){
        this.nameOfItem = nameOfItem;
        this.sparePartID = sparePartID;
        this.category = category;
        this.brand = brand;
        this.quantity = quantity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getNameOfItem() {
        return nameOfItem;
    }

    public void setNameOfItem(String nameOfItem) {
        this.nameOfItem = nameOfItem;
    }

    public int getSparePartID() {
        return sparePartID;
    }

    public void setSparePartID(int sparePartID) {
        this.sparePartID = sparePartID;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
