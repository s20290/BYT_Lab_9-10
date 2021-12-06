import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ItemTest {

    public Item item1;
    public Item item2;

    @Before
    public void setUp(){
        item1 = new Item("Book", "Old book", Double.valueOf("150.25"));
        item2 = new Item("Sword", "New sharp sword", Double.valueOf("220.00"));
    }

    /*  Method testGetItemNane() returns ID of the Item   */
    @Test
    public void testGetItemNane(){
        Assert.assertEquals("Book", item1.getItemName());
    }

    /*  Method getId() returns ID of the Item   */
    @Test
    public void testGetDescription(){
        // String item
        Assert.assertEquals("Old book", item1.getDescription());
    }

    /*  Method getId() returns ID of the Item   */
    @Test
    public void testGetPrice(){
        Assert.assertEquals("Old book", item1.getDescription());
    }

    /*  Method getId() returns ID of the Item   */
    @Test
    public void testSetItemNane(){
        Assert.assertEquals("Old book", item1.getDescription());
    }

    /*  Method getId() returns ID of the Item   */
    @Test
    public void testSetDescription(){
        Assert.assertEquals("Old book", item1.getDescription());
    }

    /*  Method getId() returns ID of the Item   */
    @Test
    public void testSetPrice(){
        Assert.assertEquals("Old book", item1.getDescription());
    }
}