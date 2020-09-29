/**
 * @author (Kis Boisen Hansen - FEN) 
 * @version (2010.09.23 - 2019.09.13)
 */
import java.util.ArrayList;
public class Order{
    private int number;
    private String orderDate;
    private String deliveryDate;
    private String payDate;
    private boolean status;
    private ArrayList<OrderLine> myOrderLines;// at the moment only one partorder pr. order

    public Order(int number, String orderDate, String deliveryDate){
        this.number = number;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.status = false;
        this.myOrderLines = new ArrayList<>(); 
       
    }
    
    public void addOrderLine(OrderLine newLine){
        myOrderLines.add(newLine);
    }
    
    public double getPrice(){
        double total= 0;
        for(OrderLine orderLine : myOrderLines){
            double subtotal = orderLine.getPrice();
            total = total + subtotal;
        }
        return total;
    }

    public void printInfo(){
        System.out.println("Ordrenummer: " + number + " Orderdato: "
                    + orderDate);
        System.out.println("------------------------------------");            
        //print info about order line(s)
        for(OrderLine orderLine : myOrderLines){
            orderLine.printInfo();
        }
        System.out.println("Total: " + getPrice());
        System.out.println("");
    }
    
    
    
    
}
