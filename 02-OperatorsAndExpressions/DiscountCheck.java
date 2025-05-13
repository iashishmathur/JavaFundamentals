public class DiscountCheck {
    public static void main(String[] args) {
        double amount = 1200;
        boolean isPremiumUser = true;

        double discount = (amount > 1000 && isPremiumUser) ? 0.20 : 0.10;
        double finalPrice = amount - (amount * discount);

        System.out.println("Final price after discount: ₹" + finalPrice);
    }
}

//Output
//Final price after discount: ₹960.0
