public class rect{                  // Bonus 2 //
    public static void main(String [] args){ ;
        int width = Integer.parseInt(args[0]);
        int height = Integer.parseInt(args[1]);
        int area =  width * height;
        int peri = width * 2 + height *2;
        System.out.println("Area of rectangular is: "+ area + "\nPerimeter of rectangular: " + peri);
    }
}
