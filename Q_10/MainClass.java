package Q_10;
import Q_10.Department;
import Q_10.Faculty;
import Q_10.ISE.ISE_department;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Enter the number of faculty");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        Faculty[] f=new Faculty[n];
        ISE_department ise=new ISE_department();
        boolean p1=false;
        boolean p2=false;
        boolean p3=false;
        boolean p4=false;
        int counter=0;
        while (true){
            System.out.println("1.Enter the record of a new faculty");
            System.out.println("2.Read the details of a particular faculty" );
            System.out.println("3.Know the details of faculty with experience greater than 20 years");
            System.out.println("4.Know the number of designation of a particular faculty");
            System.out.println("5.Know the number of research consultancy projects a particular faculty did");
            System.out.println("6.Exit");
            System.out.println();
            System.out.println("Enter your choice");
            int ch= sc.nextInt();
            switch (ch){
                case 1:
                    f[counter]=new Faculty();
                    ise.readData(f[counter]);
                    counter++;
                    break;
                case 2:
                    System.out.println("Enter the name of the faculty you want to read");
                    String s= sc.next();
                    for (int i=0;i<counter;i++){
                        if (s.equals(f[i].name)){
                            ise.printData(f[i]);
                            p1=true;
                            break;
                        }
                    }
                    if (p1==false){
                        System.out.println("Faculty not found");
                    }
                    break;
                case 3:
                    System.out.println("The faculty with experience greater than 20");
                    for (int i=0;i<counter;i++){
                        if (f[i].years_of_experience>20){
                            System.out.println(f[i].name);
                            p2=true;
                        }
                    }
                    if(p2==false){
                        System.out.println("record not found");
                    }
                    break;
                case 4:
                    System.out.println("Enter the name of faculty");
                    s= sc.next();
                    for (int i=0;i<counter;i++){
                        if (s.equals(f[i].name)){
                            ise.print_number_of_designations(f[i]);
                            p3=true;
                        }
                    }
                    if (p3==false){
                        System.out.println("record not found");
                    }
                    break;
                case 5:
                    System.out.println("Enter the name of faculty");
                    s= sc.next();
                    for (int i=0;i<counter;i++){
                        if (s.equals(f[i].name)){
                            ise.number_research_consultancy_projs(f[i]);
                            p4=true;
                        }
                    }
                    if (p4==false){
                        System.out.println("record not found");
                    }
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("wrong choice");
            }

        }

    }
}
