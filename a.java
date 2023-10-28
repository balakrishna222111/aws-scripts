import java.util.Scanner;

public class ConvertToYardsFeetInches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number of inches: ");
        int giveninches = input.nextInt();

        int inches = giveninches;
        
        int yards = inches / 36;
        inches %= 36;
        
        int feet = inches / 12;
        inches %= 12;
        
        System.out.println(giveninches + " inches equals " + yards + " yard, " + feet + " feet and " + inches + " inches.");
        
        input.close();
    }
}
