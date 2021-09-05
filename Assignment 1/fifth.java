import java.util.Scanner;

//Take 2 numbers as input and print the largest number.

public class fifth {
    public static void main(String[] args) {
        Scanner Input=new Scanner(System.in);
        int firstNumber=Input.nextInt();
        int secondNumber=Input.nextInt();
        if(firstNumber>secondNumber){
            System.out.println(firstNumber+" is greater");
        }
        else {
            System.out.println(secondNumber+" is greater");
        }
    }    
}
