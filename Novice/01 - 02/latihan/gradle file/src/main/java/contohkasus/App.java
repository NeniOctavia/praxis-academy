/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package contohkasus;

public class App {
    
    public static void main(String[] args) {
        Customer customer1 = new Customer("Neni", "subang");
        Order order1 = new Order("baju", 25000, 2);
        customer1.order(order1);

        Customer customer2 = new Customer("regina", "lobok");
        Order order2 = new Order("celana", 45000, 4);
        customer2.order(order2);

    }
    }
