import java.util.Date;

/*
    _id is unique value, which is read-only 
    _itemName is obtainable and editable attribute
    _description is obtainable and editable attribute
    _price is obtainable and editable attribute
*/

public final class Item {
    private static int _id;
    private static String _itemName;
    private static String _description;
    private static Double _price;

    public Item(String itemName, String description, Double price) {
        _id = (int) ((new Date().getTime() / 1000L) % Integer.MAX_VALUE);
        _itemName = itemName;
        _description = description;
        _price = price;
    }

    /*  Method getId() returns ID of the Item   */
    public static int getId() {
        return _id;
    }

    /*  Method getItemName() returns Name of the Item   */  
    public static String getItemName() {
        return _itemName;
    }

    /*  Method getDescription() returns Description of the Item   */
    public static String getDescription() {
        return _description;
    }

    /*  Method getPrice() returns Price of the Item   */
    public static Double getPrice() {
        return _price;
    }

    /*  Method setItemName() sets up new name for Item   */
    public void setItemName(String name) {
        if (name != null) {
            _itemName = name;
        }
    }

    /*  Method setDescription() sets up new description for Item   */
    public void setDescription(String description) {
        if (description != null) {
            _description = description;
        }
    }

    /*  Method setPrice() sets up new price for Item   */
    public void setPrice(Double price) {
        if (price != null) {
            _price = price;
        }
    }
}
