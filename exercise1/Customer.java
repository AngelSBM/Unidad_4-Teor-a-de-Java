public class Customer {
    private int customerID = 3;
    private String customerStatus = "O";
    private int totalPuchases = 23;

    public void displayCustomerInfo(){
        System.out.println("The customerID is: " + customerID);
        System.out.println("The customer status is: " + customerStatus);
        System.out.println("Purchases are: " + totalPuchases);
    }

}


class CustomerTest{
    public static void main(String[] args) {
        Customer angelo = new Customer();
        angelo.displayCustomerInfo();
    }
}