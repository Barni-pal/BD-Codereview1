import java.util.Scanner;

public class BarnabasDoebroessy {
        public static void calculateRectArea() {    // 3./1 //
            int height1 = 30;
            int width1 = 20;
            int height2 = 50;
            int width2 = 40;
            int rect1 = height1 * width1;
            int rect2 = height2 * width2;
            System.out.println("Area of the first rectangular: " + rect1 + "cm²\n" + "Area of the second rectangular: " + rect2 +"cm²");
        }
        public static void demonstrateMethod1(int widthsq1, int squareArea1, int squarePerimeter, String cm) {  // 5./1 //
            System.out.println(squareArea1 + cm + "²\n" + squarePerimeter + "cm");

        }
        public static void demonstrateMethod2(int widthsq1, String cm, int per, String gap) {  // 5./2 //
        System.out.println(widthsq1 * widthsq1 + cm + "²" + gap + widthsq1 * per + cm);
        }
        public static int[] demonstrateMethod3(int height3, int width3, int height4, int width4) {  // 5./3-Methode //
            int rect3 = height3 * width3;
            int rect4 = height3 * 2 + width3 * 2;
            int rect5 = height4 * width4;
            int rect6 = height4 * 2 + width4 * 2;
            return new int[]{rect3, rect4, rect5, rect6};
        }
        public static void main(String[] args) {    // 1. //
            int width = 5;                          // 2.-Beginn //
            int height = 2;
            int rectangularArea = width * height;
            System.out.println("Area of the bottom left rectangular is: " + rectangularArea + "cm²"); // 2.-Ende//
            calculateRectArea();                   // 3./2 //
            int widthsq = 8;                        // 4.- Beginn//
            int squareArea = widthsq * widthsq;
            int squarePerimeter = widthsq * 4;
            System.out.println("Area of the square is: " + squareArea + "cm²\n" + "Perimeter of the square is: " + squarePerimeter + "cm"); //4.-Ende//
            demonstrateMethod1(8, widthsq * widthsq, widthsq * 4, "cm");         // 5./1 //
            demonstrateMethod2(8, "cm", 4, "\n");         // 5./2 //
            Scanner in = new Scanner(System.in);                                // 5./3-Beginn //
            System.out.println("Which rectangle's parameters would you like to know?: Please enter 1 or 2 ");
            int rectin = Integer.parseInt(in.nextLine());
            int[] z = demonstrateMethod3(19, 23, 59, 79);
            if (rectin == 1) {
                System.out.println("Area of the first rectangle: " + z[0] + "cm²\nPerimeter of the first rectangle: " + z[1] + "cm");
            }else if (rectin == 2) {
                System.out.println("Area of the second rectangle: " + z[2] + "cm²\nPerimeter of the second rectangle: " + z[3] + "cm");
            }else {
                System.out.println("You entered a number outside of the field of allowance(1/2)");      // 5./3-Ende //
            }
            // Bonus 1./1- Beginn //
            int[] arrheight = {34, 65, 76, 91};
            int[] arrwidth = {45, 87, 105, 186};
            for (int i = 0; i < arrheight.length; i++) //for loop to print the array
                System.out.println( "Area of the rectangular: " + arrheight[i] * arrwidth[i] + "cm²");
            for (int i = 0; i < arrwidth.length; i++)
                System.out.println( "Perimeter of the rectangular: " + arrwidth[i] * 4 + "cm"); // Bonus 1./1- Ende //
        }


    }
