/* Write a program to check if a number 
   is greater than, less than, or equal to another */
public class Que6 {

    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 45;

        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } 
        else if (num1 < num2) {
            System.out.println(num1 + " is less than " + num2);
        } 
        else if(num1 == num2) {
            System.out.println(num1 + " is equal to " + num2);
        }
        else{
            System.out.println("Invalid input.");
        }
    } 
}
