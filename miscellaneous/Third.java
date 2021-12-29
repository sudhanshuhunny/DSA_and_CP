//Write a program to input principle, time and rate (P, T, R) from user and find Simple Interest.
import java.util.*;
public class Third {
    public static void main(String[] args) {
        Scanner Input=new Scanner(System.in);
        double principle=Input.nextDouble();
        double time=Input.nextDouble();
        double rate=Input.nextDouble();

        double simpleInterest=(principle*time*rate)/100;
        System.out.println(simpleInterest);
    }
}
