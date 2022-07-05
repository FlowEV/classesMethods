public class Main {
    public static void main(String[] args) {

        class Customer {
            int amountOfPurchases;
            String name;

            public boolean hasDiscount(){
                if(amountOfPurchases >= 1000){
                    return true;
                } else {
                    return false;
                }
            }
            public void helloCustomer(){
                if (hasDiscount()) {
                    System.out.println("Hello " + name + ", you have 30% discount!");
                } else {
                    System.out.println("Hello " + name + "!");
                }
            }
        }
        Customer jack = new Customer();
        jack.amountOfPurchases = 1000;
        jack.name = "Jack";

        Customer joe = new Customer();
        joe.amountOfPurchases = 700;
        joe.name = "Joe";

        jack.helloCustomer();
        joe.helloCustomer();
    }
}