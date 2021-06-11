public class Payment {
    private Double Amount;
    private String Method;
    private String CardNumbers;
    private String CardName;
    private String CardDate;
    private String CVV;
/* κλάση της πληρωμής,το τελικό στάδιο από όπου περνάνε οι πληρωμές */
    public Payment() {
        Amount = 0.0;
    }
    public Payment(Double TotalAmount){
        Amount = TotalAmount;
    }
    public void SetPayment(Double TotalAmount) {
        Amount = TotalAmount;
    }
    public Double GetPayment() {
        return Amount;
    }
    public void PaymentDetails() {
        System.out.println("The total amount is " + Amount);
    }
    public void SetPayMethod(String Method) {
        this.Method = Method;
    }
    public String GetPayMethod() {
        return Method;
    }
    public String SetCardInfo(String CardNumbers, String CardName, String CardDate, String CVV) {
        this.CardNumbers = CardNumbers;
        this.CardName = CardName;
        this.CardDate = CardDate;
        this.CVV = CVV;
        return CardNumbers + CardName + CardDate + CVV;
    }
}
