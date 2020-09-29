

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TestRig.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestRig
{
    private Product product1;
    private Product product2;
    private OrderLine orderLin1;
    private OrderLine orderLin2;
    private Order order1;
    private Product product3;
    private OrderLine orderLin3;
    private Order order2;
    private Customer customer1;

    
    
    
    
    
    
    
    

    
    
    
    
    

    
    
    
    
    

    /**
     * Default constructor for test class TestRig
     */
    public TestRig()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        product1 = new Product(1, "Rødvin", 66, 100);
        product2 = new Product(2, "Hvidvin", 99, 200);
        orderLin1 = new OrderLine(6, product1);
        orderLin2 = new OrderLine(12, product2);
        order1 = new Order(1, "29-09-2020", "29-09-2020");
        order1.addOrderLine(orderLin1);
        order1.printInfo();
        order1.addOrderLine(orderLin2);
        product3 = new Product(3, "Whisky", 400, 4);
        orderLin3 = new OrderLine(1, product3);
        order2 = new Order(3, "09-10-2020", "09-10-2020");
        orderLin3.getProduct();
        order2.printInfo();
        order2.addOrderLine(orderLin3);
        customer1 = new Customer(1, "Joakim", "Bygade", "11 22 33 44");
        customer1.addOrder(order1);
        customer1.addOrder(order2);
        customer1.printInfo();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
