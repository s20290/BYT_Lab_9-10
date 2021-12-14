import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public class ItemTest {

    public Item item1;
    public Item item2;

    /*  Method setUp() using @Before annotaion to define temporary items   */
    @Before
    public void setUp(){
        item1 = new Item("Book", "Old book", new BigDecimal("150.25"));
        item2 = new Item("Sword", "New sharp sword", new BigDecimal("220.00"));
    }

    /*  Method getIdTest() checks ID of the Item   */
    @Test
    public void getIdTest(){
        System.out.println(item1.getId());
        System.out.println(item2.getId());
        // Comparing id of two items, they must be unique and not equal
        Assert.assertNotEquals(item1.getId(), item2.getId());
    }

    /*  Method getItemNameTest() checks name of the Item   */
    @Test
    public void getItemNameTest(){
        // Considering nameTest variable equals name of item1 and comparing this var with method getItemName()
        String nameTest = "Book";
        Assert.assertEquals(nameTest, item1.getItemName());
    }

    /*  Method getDescriptionTest() checks description of the Item   */
    @Test
    public void getDescriptionTest(){
        // Considering descriptionTest variable equals description of item1 and comparing this var with method getDescription()
        String descriptionTest = "Old book";
        Assert.assertEquals(descriptionTest, item1.getDescription());
    }

    /*  Method getPriceTest() checks price of the Item   */
    @Test
    public void getPriceTest(){
        // Considering priceTest variable equals price of item1 and comparing this var with method getPrice()
        BigDecimal priceTest = new BigDecimal("150.25");
        Assert.assertEquals(priceTest, item1.getPrice());
    }

    /*  Method setItemNameTest() checks name of the Item when new name been set  */
    @Test
    public void setItemNameTest(){
        // Considering newName variable, setting this var as new name of item2 and comparing this var with method getItemName()
        String newName = "Blade";
        item2.setItemName(newName);
        Assert.assertEquals(newName, item2.getItemName());
    }

    /*  Method setDescriptionTest() checks description of the Item when new description been set  */
    @Test
    public void setDescriptionTest(){
        // Considering newDescription variable, setting this var as new description of item2 and comparing this var with method getDescription()
        String newDescription = "Old rusted blade";
        item2.setDescription(newDescription);
        Assert.assertEquals(newDescription, item2.getDescription());
    }

    /*  Method setPriceTest() checks price of the Item when new price been set  */
    @Test
    public void setPriceTest(){
        // Considering newPrice variable, setting this var as new price of item2 and comparing this var with method getPrice()
        BigDecimal newPrice = new BigDecimal("500");
        item2.setPrice(newPrice);
        Assert.assertEquals(newPrice, item2.getPrice());
    }
}