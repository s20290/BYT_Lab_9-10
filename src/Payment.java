public class Payment {
    public static enum PaymentMethod{
        Visa,
        MasterCard,
        Blik,
        Transfer
    }

    private String _paymentDetails;
    private PaymentMethod _paymentMethod;
    private Purchase _purchase;
   
    public Payment(String _paymentDetails, PaymentMethod _paymentMethod,Purchase _purchase) {
        this._paymentDetails = _paymentDetails;
        this._paymentMethod = _paymentMethod;
        this._purchase = _purchase;
    }

    public String GetPaymentDetails() {
        return _paymentDetails;
    }

    public void SetPaymentDetails(String _paymentDetails) {
        this._paymentDetails = _paymentDetails;
    }

    public PaymentMethod GetPaymentMethod() {
        return _paymentMethod;
    }

    public void SetPaymentMethod(PaymentMethod _paymentMethod) {
        this._paymentMethod = _paymentMethod;
    }

    public Purchase GetPurchase() {
        return _purchase;
    }

    public void SetPurchase(Purchase _purchase) {
        this._purchase = _purchase;
    }
}
