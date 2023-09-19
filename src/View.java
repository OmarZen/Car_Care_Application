public class View {

    public static void mainMenu(){
        System.out.println("Choose mode: ");
        System.out.println("\t\t\t---------------------------\t\t\t");
        System.out.println("\t\t\t   1- User                       ");
        System.out.println("\t\t\t   2- Admin                      ");
        System.out.println("\t\t\t   3- Exit                       ");
        System.out.println("\t\t\t--------------------------\t\t\t ");
        System.out.print("Choice:");}

    public static void paymentFormMenu(){
        System.out.println("Choose type of Payment: ");
        System.out.println("\t\t\t---------------------------\t\t\t");
        System.out.println("\t\t\t   1- Pay by Credit Card \t\t\t");
        System.out.println("\t\t\t   2- Pay by Cash \t\t\t");
        System.out.println("\t\t\t--------------------------\t\t\t");
    }
    public static void discountMenu(){
        System.out.println("Choose type of Discounts you want to Add: ");
        System.out.println("\t\t\t---------------------------\t\t\t");
        System.out.println("\t\t\t   1- Membership Discounts \t\t\t");
        System.out.println("\t\t\t   2- Promocode Discounts \t\t\t");
        System.out.println("\t\t\t   2- Combined Discounts \t\t\t");
        System.out.println("\t\t\t--------------------------\t\t\t");
        System.out.print("Choice:");}
    public static void adminMenu(){
        System.out.println("Choose: ");
        System.out.println("\t\t\t---------------------------\t\t\t");
        System.out.println("\t\t\t   1- Show Total Income \t\t\t");
        System.out.println("\t\t\t   2- Show Total Number of Vehicles \t\t\t");
        System.out.println("\t\t\t   3- Add Service Packages \t\t\t");
        System.out.println("\t\t\t   4- Add Discounts \t\t\t");
        System.out.println("\t\t\t   5- List User Used Services \t\t\t");
        System.out.println("\t\t\t   6- Exit \t\t\t");
        System.out.println("\t\t\t--------------------------\t\t\t");
        System.out.print("Choice:");}
    public static void userMenu(){
        System.out.println("Choose: ");
        System.out.println("\t\t\t---------------------------\t\t\t");
        System.out.println("\t\t\t   1- Clean-IN \t\t\t");
        System.out.println("\t\t\t   2- Clean-OUT \t\t\t");
        System.out.println("\t\t\t   3- Pay for Any Service \t\t\t");
        System.out.println("\t\t\t   4- Check Any Discounts \t\t\t");
        System.out.println("\t\t\t   6- Check Any Discount \t\t\t");
        System.out.println("\t\t\t   5- Other Services \t\t\t");
        System.out.println("\t\t\t   7- Exit \t\t\t");
        System.out.println("\t\t\t--------------------------\t\t\t");
        System.out.print("Choice:");}

    public static void WelcomingUser(String userName)
    {
        System.out.println("==========================");
        System.out.println("          Welcome "+userName+"\t\t\t\t|" );
        System.out.println("==========================");
    }

}
