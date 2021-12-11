import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class PlayerTest {

    Player p1,p2,p3;
    Payment pay1,pay2;
    Team t1,t2;
    @Before
    public void setup(){
        p1 = new Player("Rajesh","rj@gmail.com");
        p2 = new Player("Joh","joh@gmail.com");
        p3 = new Player("Kim","kim@yahoo.com");
        pay1 = new Payment("item1", Payment.PaymentMethod.Transfer, new Purchase());
        pay2 = new Payment("item2", Payment.PaymentMethod.Blik, new Purchase());
        t1 = Team.createTeam("Team1", p1);
        t2 = Team.createTeam("Team2", p2);
        p1.set_team(t1);
    }

    //getter test for nickname
    @Test
    public void getNickNameTest(){
        //p1 should have nickname rajesh
        assertEquals("Rajesh",p1.get_nickName());
    }

    //setter test for nickname
    @Test
    public void setNickNameTest(){
        //before setting p1's nickname to Bob
        assertEquals("Rajesh",p1.get_nickName());
        p1.set_nickName("Bob");
        //p1 should now have nickname "Bob"
        assertEquals("Bob", p1.get_nickName());
    }

    //getter test for email
    @Test
    public void getEmailTest(){
        //p1 should have rj@gmail.com as his email
        assertEquals("rj@gmail.com",p1.get_email());
    }

    //setter test for email
    @Test
    public void setEmailTest(){
        //p1 should have rj@gmail.com as his email
        assertEquals("rj@gmail.com",p1.get_email());
        p1.set_email("bob@gmail.com");
        //after setting a new email, p1 should have bob@gmail.com as his new email
        assertEquals("bob@gmail.com", p1.get_email());
    }

    //getter test for friends
    @Test
    public void getFriendsTest(){
        //p1 has no friends to start with so the size of list is 0
        assertEquals(0, p1.get_friends().size());
        p1.addFriend(p2);
        //after adding p2 as a friend the size of list should be 1
        assertEquals(1,p1.get_friends().size());
    }

    //setter test for friends
    @Test
    public void setFriendsTest(){
        //p1 has no friends to start with so the size of list is 0
        assertEquals(0, p1.get_friends().size());
        p1.set_friends(null);
        //setting friends list as null will return null when we call getter
        assertNull(p1.get_friends());
    }

    //getter test for items
    @Test
    public void getItemsTest(){
        //p1 has no items to begin with
        assertEquals(0,p1.get_items().size());
    }

    //setter test for items
    @Test
    public void setItemsTest(){
        //p1 has no items to begin with
        assertEquals(0,p1.get_items().size());
        p1.set_items(null);
        //assertNull should succeed because items list is now null for p1
        assertNull(p1.get_items());
    }

    //getter test for payment
    @Test
    public void getPaymentTest(){
        //p1 currently has no payments
        assertNull(p1.get_payment());
        p1.set_payment(pay1);
        //after setting a payment it should no longer be null
        assertNotNull(p1.get_payment());
    }

    //setter test for payment
    @Test
    public void setPaymentTest(){
        //p1 currently has no payments
        assertNull(p1.get_payment());
        p1.set_payment(pay1);
        //after setting a payment it should no longer be null
        assertNotNull(p1.get_payment());
    }

    //getter test for team
    @Test
    public void getTeamTest(){
        //p1 belongs to t1 (team1)
        assertEquals(t1,p1.get_team());
    }

    //setter test for team
    @Test
    public void setTeamTest(){
        //p1 belongs to t1 (team1)
        assertEquals(t1,p1.get_team());
        p1.set_team(t2);
        //p1 now belongs to t2
        assertEquals(t2,p1.get_team());
    }

}
