/** 
 * @author (Kis Boisen Hansen - FEN) 
 * @version (2010.09.23, 2019.09.13)
 */
import java.util.ArrayList;
public class Customer{
    // instance variables - replace the example below with your own
    private int number;
    private String name;
    private String address;
    private String phone;
    private ArrayList<Order> myOrder;//at the moment onlyone instance of order

    public Customer(int number, String name, String address, String phone){
        this.number = number;
        this.name= name;
        this.address = address;
        this.phone = phone;
        this.myOrder = new ArrayList<>();
    }

    public void addOrder(Order newOrder){
        myOrder.add(newOrder);
    }

    public void printInfo(){
        System.out.println("Kundenummer: " + number + ", Kundenavn: " + name
            + ", adresse: " + address + ", telefon: " + phone);
        System.out.println("Kundes ordre:");
        if(myOrder != null) {
            for(Order order : myOrder) {
                order.printInfo();
            }
            System.out.print("Samlede pris for alle ordre " + getTotal());
        } else {
            System.out.println("Kunden har ingen ordre");
        }
    }

    public double getTotal(){
        double customerTotal= 0;
        for(Order order : myOrder){
            double total = order.getPrice();
            customerTotal = customerTotal + total;
        }
        return customerTotal;
    }
    
}
