import java.util.Random;
import java.util.Scanner;

public class Bank {

    static Scanner input = new Scanner(System.in);

    public static final int MONTHLY_PAYMENT = 100;


    public static int input_number () {

        System.out.println("Please, enter number: ");
        int number;
        if(input.hasNextInt()){
            number = input.nextInt();
        } else {
            System.out.println("Wrong input, please, enter your number again! ");
            input.next();
            number = input_number();

        }
        return number;
    }


    public static int getRundom() {
        Random random = new Random();

        int result_number = random.nextInt(5000);

        return result_number;

    }

    /*public static boolean isArrears (int number) {
        boolean result = false;

    }*/



}
