import java.util.Scanner;

public class MyMain {
    
    public static int binaryToDecimal(String binary) { 
        int len = binary.length();
        int bi = Integer.parseInt(binary);
        int dec = 0;
        for (int i = 0; i < len; i++){
            dec += ((bi/(int)Math.pow(10,i))%10) * Math.pow(2,i);
        }
        return dec;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        String binary = scan.next();
        int decimal = binaryToDecimal(binary);
        System.out.println("That is equal to the decimal value: " + decimal);
        scan.close();

    }
}
