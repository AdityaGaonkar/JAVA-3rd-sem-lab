import java.util.Scanner;

abstract class vehicle{
    int yr_of_manufacture;
    vehicle(int year){
        year=yr_of_manufacture;
    }
    abstract void getdata();
    abstract void putdata();
}
class Twowheeler extends vehicle{
    Scanner sc=new Scanner(System.in);
    String s;
    int yr_of_manufacture,milage,cc;
    Twowheeler(int yr){
        super(yr);
    }

    @Override
    void getdata() {
        System.out.println("enter details of the two wheeler");
        System.out.println("enter the model name");
        s=sc.next();
        System.out.println("enter the milage");
         milage=sc.nextInt();
        System.out.println("enter cc of the vehilce");
         cc=sc.nextInt();
    }

    @Override
    void putdata() {
        System.out.println("The details of two wheeler are");
        System.out.println("the model name is "+ s);
        System.out.println("The milage is "+milage);
        System.out.println("The cc of the vehicle is "+cc);

    }
}
final class FourWheeler extends vehicle{
    Scanner sc=new Scanner(System.in);
    String s;
    int yr_of_manufacture,milage,cc;
    FourWheeler(int yr){
        super(yr);
    }

    @Override
    void getdata() {
        System.out.println("enter details of the four wheeler");
        System.out.println("enter the model name");
        s=sc.next();
        System.out.println("enter the milage");
        milage=sc.nextInt();
        System.out.println("enter cc of the vehilce");
        cc=sc.nextInt();
    }

    @Override
    void putdata() {
        System.out.println("The details of four wheeler are");
        System.out.println("the model name is "+ s);
        System.out.println("The milage is "+milage);
        System.out.println("The cc of the vehicle is "+cc);

    }
}
class MytwoWheeler extends Twowheeler{
    String model_name;
    String gear_type;
    MytwoWheeler(int yr,String model_name,String gear_type){
        super(yr);
        this.model_name=model_name;
        this.gear_type=gear_type;
        System.out.println("Model name is "+ model_name);
        System.out.println("gear type is "+ gear_type);
    }
}
public class demo_vehicle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year of manufacture of two wheeler");
        int yr_of_manufacture= sc.nextInt();
        Twowheeler tt=new Twowheeler(yr_of_manufacture);
        System.out.println("enter year of manufacture of four wheeler");
        yr_of_manufacture= sc.nextInt();
        FourWheeler ff=new FourWheeler(yr_of_manufacture);
        tt.getdata();
        tt.putdata();
        ff.getdata();
        ff.putdata();
        System.out.println("enter the yr of manufacture model name and gear type of my two wheeler");
        yr_of_manufacture= sc.nextInt();
        String mode_name=sc.next();
        String gear_type= sc.next();
        MytwoWheeler mt=new MytwoWheeler(yr_of_manufacture,mode_name,gear_type);


    }
}
