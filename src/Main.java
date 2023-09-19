// Car Care Application

import Controller.UserController;
import Model.Vehicle;
import Model.Workers;
import Payment.*;
import service.*;

import java.util.*;

public class Main {
    static Scanner input;

    private static UserController controller = new UserController();
    private static Queue<Vehicle> waitingList = new ArrayDeque<Vehicle>();
    private static Vehicle vehicle = new Vehicle();
    private static Workers worker = new Workers();
    private static ArrayList<Workers> list = new ArrayList<>(5);
    private static Payment payment;
    private static Service service;
    public static void userFunctions(){
        int Choice;
        Choice = input.nextInt();
        View.userMenu();
        switch(Choice){
            case 1:
                //Queue of waiting list , obj of his vehicle , list of workers
                controller.cleanIn(waitingList,vehicle,list);
                break;
            case 2:
                controller.cleanOut(vehicle,worker);
                break;
            case 3:
                //other services
                service = new CarMaintenance("Hyundai");
                service = new CarOil("Shell");
                service = new CarTires(20);
                break;
            case 4:
                View.paymentFormMenu();
                int choice;
                choice = input.nextInt();
                if(choice == 1){
                    payment = new CreditCard();
                }else if(choice == 2){
                    payment = new Cash();
                }else{
                    System.out.println("Invalid Choice");
                }
                break;
            case 5:
                View.discountMenu();
                break;
            case 6:
                System.out.println("Exited");
                System.exit(0);
        }
    }
    public static void adminFunctions(){

    }
    public static void runApp() {
        int Choice;

        while(true){
            View.mainMenu();
            System.out.println();
            Choice = input.nextInt();
            switch (Choice){
                case 1:
                    View.userMenu();
                    //user functions
                    userFunctions();
                    break;

                case 2:
                    View.adminMenu();
                    //admin functions
                    break;

                case 3:
                    System.out.println("Thank You.");
                    System.exit(0);

                default:
                    System.out.println("You Entered Invalid Number, Try Again");
            }
        }

    }
    public static void main(String[] args) {
        runApp();
    }

    static {input = new Scanner(System.in);}
}

