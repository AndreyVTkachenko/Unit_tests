package main.java.seminars.seminar_04.card;

public class PaymentForm {
    private CreditCard creditCard;

    public PaymentForm(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public void pay(double amount) {
        creditCard.charge(amount);
    }
}
