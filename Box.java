import java.util.*;
public class Box {
    double h,w,d;

     Box(double width,double height,double depth)
    {
        h=height;
        w=width;
        d=depth;
    }
    double volume()
    {
 double v;
    v=h*w*d;
    return v;
    }
   
    public static void main(String[] args) {
       
    Box b = new Box(10,5,4);
    System.out.println(b.volume());

    }

}
