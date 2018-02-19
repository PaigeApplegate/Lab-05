import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        //Variables
        Scanner input = new Scanner(System.in);
        double length, width, tBase, tSideOne, tSideTwo, radius, pi, S, diameter, hight, hightC, radiusC;
        double triangleP, rectangleP, circleC, triangleA, rectangleA, circleA;
        double sfAreaSphere, VolumeSphere, sfAreaRectangle, VolumeRectangle;
        double sfAreaCylinder, VolumeCylinder;
        pi = 3.14;

        //Ask user
        System.out.print("Enter length of rectangle (positive integer): ");
        length = input.nextDouble();
        System.out.print("Enter width of rectangle (positive integer): ");
        width = input.nextDouble();
        System.out.print("Now enter the radius of the circle (positive integer): ");
        radius = input.nextDouble();
        System.out.print("Enter side A of triangle (positive integer): ");
        tBase = input.nextDouble();
        System.out.print("Enter side B of triangle (positive integer): ");
        tSideOne = input.nextDouble();
        System.out.print("Enter side C of triangle (positive integer): ");
        tSideTwo = input.nextDouble();

        //Formula
        circleC = 2 * pi * radius;
        circleA = pi * radius * radius;
        triangleP = tBase + tSideOne + tSideTwo;
        S = (tBase + tSideOne + tSideTwo) / 2;
        triangleA = Math.sqrt(S * (S - tBase) * (S - tSideOne) * (S - tSideTwo));
        rectangleP = 2 * (length + width);
        rectangleA = length * width;

        //Results
        System.out.println("");
        System.out.println("Area of rectangle: " + rectangleA);
        System.out.println("Area of circle: " + circleA);
        System.out.println("Perimeter of rectangle: " + rectangleP);
        System.out.println("Circumference of circle: " + circleC);
        System.out.println("Area of triangle: " + triangleA);
        System.out.println("Perimeter of triangle: " + triangleP);

        //Prompt user
        System.out.println("");
        System.out.print("Enter the radius of the sphere: ");
        radius = input.nextDouble();
        System.out.print("Enter the diameter of the rectangular prism: ");
        diameter = input.nextDouble();
        System.out.print("Enter the height of the rectangular prism: ");
        hight = input.nextDouble();
        System.out.print("Enter the width of the rectangular prism: ");
        width = input.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        hightC = input.nextDouble();
        System.out.print("Enter the radius of the cylinder: ");
        radiusC = input.nextDouble();

        //Formulas
        sfAreaSphere = 4 * pi * radius * radius;
        VolumeSphere = 4 * pi * ((radius * radius * radius) / 3);
        sfAreaRectangle = 2 * ((hight * diameter) + (hight * width) + (diameter * width));
        VolumeRectangle = hight * diameter * width;
        sfAreaCylinder = 2 * pi * radiusC * hightC + 2 * pi * radiusC * radiusC;
        VolumeCylinder = pi * radiusC * radiusC * hightC;

        //Results
        System.out.println("");
        System.out.println("The surface area of the sphere is: " + sfAreaSphere);
        System.out.println("The volume of the sphere is: " + VolumeSphere);
        System.out.println("The surface area of the rectangular prism is: " + sfAreaRectangle);
        System.out.println("The volume of the rectangular prism is: " + VolumeRectangle);
        System.out.println("The surface area of the cylinder is: " + sfAreaCylinder);
        System.out.println("The volume of the cylinder is: " + VolumeCylinder);
    }
}
