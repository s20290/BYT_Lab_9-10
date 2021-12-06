import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class PaymentTest{
    //init purchase
    private Purchase _purchaseA;
    private Purchase _purchaseB;
    //init payments
    private Payment _paymentA;
    private Payment _paymentB;
    private Payment _paymentC;
    //list of payments details
    private String[] _paymentDetailsList = {"Item One","Item Two","Item Three"};
    @Before
    public void SetUp() throws Exception {
        //set value of parchase
        _purchaseA = new Purchase();
        _purchaseB = new Purchase();
        //set value of payment
        _paymentA = new Payment(_paymentDetailsList[0],Payment.PaymentMethod.Blik,_purchaseA);
        _paymentB = new Payment(_paymentDetailsList[1],Payment.PaymentMethod.Visa,_purchaseA);
        _paymentC = new Payment(_paymentDetailsList[2],Payment.PaymentMethod.MasterCard,_purchaseB);

    }       
    /*
        Test of Getters
    */
    @Test
    public void TestGetPaymentDetails(){

        //Testing only true/valid examples
        assertTrue( _paymentDetailsList[0].equals(_paymentA.GetPaymentDetails()));
        assertTrue( _paymentDetailsList[1].equals(_paymentB.GetPaymentDetails()));
        assertTrue( _paymentDetailsList[2].equals(_paymentC.GetPaymentDetails()));

        //Testing only false/invalid examples
        assertFalse( _paymentDetailsList[1].equals(_paymentC.GetPaymentDetails()));
        assertFalse(_paymentDetailsList[0].equals(_paymentC.GetPaymentDetails()));
        assertFalse( _paymentDetailsList[2].equals(_paymentA.GetPaymentDetails()));
    }
    @Test
    public void TestGetPaymentMethod(){
        //Test true/valid examples
        assertEquals(Payment.PaymentMethod.Blik,_paymentA.GetPaymentMethod());   
        assertEquals(Payment.PaymentMethod.Visa,_paymentB.GetPaymentMethod());   
        assertEquals(Payment.PaymentMethod.MasterCard,_paymentC.GetPaymentMethod());
        //Test false/invalid examples   
        assertNotEquals(Payment.PaymentMethod.MasterCard,_paymentA.GetPaymentMethod());
        assertNotEquals(Payment.PaymentMethod.Transfer,_paymentC.GetPaymentMethod());
        assertNotEquals(Payment.PaymentMethod.Transfer,_paymentB.GetPaymentMethod());
    }
    @Test
    public void TestGetPurchase(){
        //Test true/valid examples
        assertEquals(_purchaseA, _paymentA.GetPurchase());  
        assertEquals(_purchaseA, _paymentB.GetPurchase());  
        assertEquals(_purchaseB, _paymentC.GetPurchase());  
        //Test false/invalid examples  
        assertNotEquals(_purchaseB, _paymentA.GetPurchase());  
        assertNotEquals(_purchaseA, _paymentC.GetPurchase());  
    }
    /*
        Test of Setters
     */
    @Test
    public void TestSetPaymentDetails(){
        var msg = "Item Zero";
        //Test initial value
        assertTrue( _paymentDetailsList[0].equals(_paymentA.GetPaymentDetails()));
        //Change value
        _paymentA.SetPaymentDetails(msg);
        //Check value
        //Previous value
        assertFalse( _paymentDetailsList[0].equals(_paymentA.GetPaymentDetails()));
        //Current value
        assertTrue( msg.equals(_paymentA.GetPaymentDetails()));
        //test if a diffrent payment was modified
        assertFalse( msg.equals(_paymentC.GetPaymentDetails()));
    }
    @Test
    public void TestSetPaymentMethod(){
        //Test initial value
        assertEquals(Payment.PaymentMethod.Visa,_paymentB.GetPaymentMethod());
        //Change value
        _paymentB.SetPaymentMethod(Payment.PaymentMethod.Transfer);
        //Check value
        //Previous Value
        assertNotEquals(Payment.PaymentMethod.Visa,_paymentB.GetPaymentMethod());
        //Current value
        assertEquals(Payment.PaymentMethod.Transfer,_paymentB.GetPaymentMethod());
        //test if a diffrent payment was modified
         assertNotEquals(Payment.PaymentMethod.Transfer,_paymentC.GetPaymentMethod());
    }

    @Test
    public void TestSetPurchase(){
        var purchaseC = new Purchase();
        //Test initial value
        assertEquals(_purchaseB,_paymentC.GetPurchase());
        //Change value
        _paymentC.SetPurchase(purchaseC);
        //Check value
        //Previous Value
        assertNotEquals(_purchaseB,_paymentC.GetPurchase());
        //Current value
        assertEquals(purchaseC, _paymentC.GetPurchase());
        //test if a diffrent payment was modified
         assertNotEquals(purchaseC, _paymentB.GetPurchase());
    }
}