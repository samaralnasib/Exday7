import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        //Q1
        Scanner input = new Scanner(System.in);
        //System.out.println("please enter the number:");
        //int number1 = input.nextInt();
        //System.out.println("please enter the number:");
        //int number2 = input.nextInt();
        //System.out.println("please enter the number:");
        //int number3 = input.nextInt();

        //small(number1,number2,number3);
        ////

        //Q2
        //System.out.println("please enter the number:");
        //int num = input.nextInt();
        //check(num);

        ////

        //Q3
        System.out.println("please enter the password:");
        String pass = input.next();

        valid(pass);


        // } //public static void small (int number1,int number2,int number3){
        //int a=number1;
        //int b=number2;
        //int c=number3;
        //if (a<=b){
        //System.out.println("smallest" +a);
        // } else if (a>=c) {
        //    System.out.println("not smallest");
        // }  else System.out.println("erorr");

        //   }
        // } public static void check (int num){
        //   if (num>0){
        //  System.out.println("postive number");
        //   } else if (num<0) {
        //     System.out.println("nagtive number");

        //  } else System.out.println("zero");
    }

    public static void valid(String pass) {
        {
            if (pass.length() < 10) {
                System.out.println("A password must have at least eight characters");
            } else if (pass.contains("&") || pass.contains("@") || pass.contains("+")) {
                System.out.println(" A password consists of only letters and digits");
            } else System.out.println("Password is valid");

        }
    }
}

