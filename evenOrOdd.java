
package even;
import java.util.Scanner;

public class Even {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number = input.nextInt();
        
        if(number%2==0){
            System.out.print("The number is Even \n");
        }
        else{
            System.out.print("The number is Odd \n");
        }
    }
    
}
