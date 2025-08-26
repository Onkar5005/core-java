import java.util.Scanner;

public class AreaCircumferenceOfCircle {
    public static void main(String[] args) {
        double area, circumference, r;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of Circle: ");
        r = sc.nextDouble(); // use double instead of float

        area = Math.PI * r * r;
        circumference = 2 * Math.PI * r;

        System.out.println("Area is: " + area);
        System.out.println("Circumference of Circle is: " + circumference);
    }
}
