package Interface.ECommerce;

public interface Payable {
    boolean processTransaction(double amount);

    public static void main (String [] args){
        CreditCard card = new CreditCard();
        PayPal pal = new PayPal();
        CryptoWallet wallet = new CryptoWallet();


    }
}

class CreditCard implements Payable{

    @Override
    public boolean processTransaction(double amount){
        double processingFee = 0.2;
        double totalCost = amount + (amount * processingFee);
        System.out.println("nigga");

        return true;
    }
}

class PayPal implements Payable{

    @Override
    public boolean processTransaction(double amount){
        return true;
    }
}

class CryptoWallet implements Payable{
    @Override
    public boolean processTransaction(double amount){
        return true;
    }
}

class CheckoutSystem {
    void completePurchase(Payable paymentMethod, double totalCost){
        paymentMethod.processTransaction(totalCost);
    }
}