public class Customer extends Person  {
    String CustomerNumber;
    boolean MailingList;

    public Customer() {
        super();
        CustomerNumber = "";
        MailingList = false;
    }

    public Customer(String name, String address, String telephone, String customerNumber, boolean mailingList) {
        super(name, address, telephone);
        CustomerNumber = customerNumber;
        MailingList = mailingList;
    }
}


