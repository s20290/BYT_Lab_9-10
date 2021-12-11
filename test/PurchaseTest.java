import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PurchaseTest {


    Purchase p1;
    Player player1;
    @Before
    public void setup(){
        p1 = new Purchase();
        player1 = new Player("Joh","joh@gmail.com");
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

}
