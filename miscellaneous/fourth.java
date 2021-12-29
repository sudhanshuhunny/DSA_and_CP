import java.util.Scanner;

//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
public class fourth {
    public static void main(String[] args) {
        Scanner Input=new Scanner(System.in);
        double firstNumber=Input.nextDouble();
        double secondNumber=Input.nextDouble();
        char op=Input.next().charAt(0);
        if(op=='+')
        {
            System.out.println(firstNumber+secondNumber);
        }
        else if(op=='-'){
            System.out.println(firstNumber-secondNumber);
        }
        else if(op=='*'){
            System.out.println(firstNumber*secondNumber);
        }
        else if(op=='/'){
            System.out.println(firstNumber/secondNumber);
        }
        else{
            System.out.println("Wrong Operator entered");
        }

    }
}
