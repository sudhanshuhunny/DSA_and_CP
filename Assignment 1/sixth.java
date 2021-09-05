import java.util.Scanner;

//Input currency in rupee and output in dollar.

public class sixth {
    public static void main(String[] args) {
        Scanner Input=new Scanner(System.in);
        double rupee=Input.nextDouble();
        double dollar=rupee/75;
        System.out.println(dollar);
    }    
}
