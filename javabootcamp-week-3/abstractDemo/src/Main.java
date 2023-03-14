public class Main {
    public static void main(String[] args)
    {
        CustomerManager customerManager=new CustomerManager();

        //Database değiştirmek için.
        customerManager.databaseManager =new MySqlDatabaseManager();
        customerManager.getCustomers();


    }
}