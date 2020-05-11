public class CustomerDemo {

    public CustomerDemo() {
    }

    public static void main(String[] args){

        Customer myCustomer = new Customer("Cathal", "Walsh","12345", "abc123", false);
        System.out.println("Customer name is " + myCustomer.getName());
        System.out.println("Customer address is " + myCustomer.getAddress());
        System.out.println("Customer telephone is " + myCustomer.getTelephone());



}
}
