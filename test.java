public class CalculateArea {
    public static void main(String[] args) {
        // Define the length and width of the rectangle
        double length = 25.0; // in meters
        double width = 13.0; // in meters
        
        // Calculate the area of the rectangle
        double area = length * width;
        
        // Print the output
        System.out.printf("The area of a rectangle with length %.1f m and width %.1f m is %.1f m**2%n", length, width, area);
    }
}
