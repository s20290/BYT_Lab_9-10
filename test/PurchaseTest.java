import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PurchaseTest {


    Purchase p1;
    Player player1;
    Item item1,item2;
    List<Item> items;
    @Before
    public void setup(){
        p1 = new Purchase();
        items = new ArrayList<>();
        player1 = new Player("Joh","joh@gmail.com");

        item1 = new Item("Book", "Old book", new BigDecimal("150.25"));
        item2 = new Item("Sword", "New sharp sword", new BigDecimal("220.00"));
        items.add(item1);
        items.add(item2);
        p1.set_item(items);
    }

    @Test
    public void getIdTest(){
        //by default, id is -1
        assertEquals(-1,p1.get_id());
    }

    @Test
    public void setIdTest(){
        //by default, id is -1
        assertEquals(-1,p1.get_id());
        //setting id to 1 should return 1 when we call getter
        p1.set_id(1);
        assertEquals(1,p1.get_id());
    }

    @Test
    public void getUserTest(){
        //by default user is null
        assertNull(p1.get_user());
    }

    @Test
    public void setUserTest(){
        //by default user is null
        assertNull(p1.get_user());
        //setting user to player1 should return player1 when we call getter
        p1.set_user(player1);
        assertEquals(player1,p1.get_user());
    }

    @Test
    public void getCostTest(){
        //by default cost is -1.0
        assertEquals(-1,(int)p1.get_cost());
    }

    @Test
    public void setCostTest(){
        //by default cost is -1.0
        assertEquals(-1,(int)p1.get_cost());
        //setting cost to 1 should return 1 when we call getter
        p1.set_cost(1);
        assertEquals(1,(int)p1.get_cost());

    }

    @Test
    public void getItemTest(){
        //getItem should return item1
        assertEquals(items,p1.get_item());
    }

    @Test
    public void setItemTest(){
        //getItem should return list of items
        assertEquals(items,p1.get_item());
        //setting item to tmp should return tmp when we call getter
        List<Item> tmp = new ArrayList<>();
        p1.set_item(tmp);
        //tmp is not the same as items so this should not be equal
        assertNotEquals(items,p1.get_item());

    }

}
