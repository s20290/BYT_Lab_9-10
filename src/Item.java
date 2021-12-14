import java.util.Date;
import java.math.BigDecimal;
import java.util.Random;

/*
    _id is unique value, which is read-only
    _itemName is obtainable and editable attribute
    _description is obtainable and editable attribute
    _price is obtainable and editable attribute
*/

public final class Item {
    private final int _id;
    private String _itemName;
    private String _description;
    private BigDecimal _price;
    private final Random RANDOM = new Random();

    public Item(String itemName, String description, BigDecimal price) {
        _id = (int) ((new Date().getTime() / 1000L) % Integer.MAX_VALUE) + RANDOM.nextInt(100);
        _itemName = itemName;
        _description = description;
        _price = price;
    }

    /*  Method getId() returns ID of the Item   */
    public int getId() {
        return _id;
    }

    /*  Method getItemName() returns Name of the Item   */
    public String getItemName() {
        return _itemName;
    }

    /*  Method getDescription() returns Description of the Item   */
    public String getDescription() {
        return _description;
    }

    /*  Method getPrice() returns Price of the Item   */
    public BigDecimal getPrice() {
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
    public void setPrice(BigDecimal price) {
        if (price != null) {
            _price = price;
        }
    }
}

