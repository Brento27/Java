
package ex10_2_exercise;

public class ShoppingCart {
    public static void main(String args[]){
        Order order = new Order("Rick Wilson", 899.00, "VA", Order.CORP);
        System.out.println("Discount is: "+ order.getDiscount());
    }
}