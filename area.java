import java.util.Scanner;

class circle{
    int radius;
    circle(int radius){
        this.radius=radius;
    }
    double area(){
        return (float) (3.14*radius*radius);
    }
}
class sector extends circle{
    int angle;
    sector(int radius,int angle){
        super(radius);
        this.angle=angle;
    }
    double area(){
        return 0.5*radius*radius*angle;
    }
}
class segment extends circle{
    int length;
    segment(int radius,int length){
        super(radius);
        this.length=length;
    }
    double area(){
        return radius*radius*((radius-length)/radius)-(radius-length)* Math.sqrt(2*radius*length-length*length);
    }
}

public class area {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius");
        int radius= sc.nextInt();
        circle c=new circle(radius);
        System.out.println("area of circle is "+c.area());
        System.out.println("enter the angle of sector in radians");
        int angle= sc.nextInt();
        sector s=new sector(radius,angle);
        System.out.println("the area of sector is "+ s.area());
        System.out.println("enter the length of segment");
        int length= sc.nextInt();
        segment ss=new segment(radius,length);
        System.out.println("the area of segment is "+ss.area());

    }
}
