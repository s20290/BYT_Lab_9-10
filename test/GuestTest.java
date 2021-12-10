import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class GuestTest {
    public Guest guest1;
    public Guest guest2;

    @Before
    public void setUp(){
        guest1 = new Guest();
        guest2 = new Guest();
    }

    /*  Method getId returns ID of the guest   */
    @Test
    public void testGetId(){
        Assert.assertEquals(0, guest1.getId());
        Assert.assertEquals(1, guest2.getId());
    }
}
