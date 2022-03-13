public class Order {
    private long orderValue = 0;
    private int itemQuantity = 10000000; 
    private int itemPrice = 555500;

    

    public void calculateTotal(){
        orderValue =  itemPrice + itemQuantity;

        System.out.println(orderValue);
    }
}



class OrderTest{
    public static void main(String[] args) {
        Order order1 = new Order();
        order1.calculateTotal();
    }
}