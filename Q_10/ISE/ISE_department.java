package Q_10.ISE;
import Q_10.Department;
import Q_10.Faculty;

import java.util.Scanner;

public class ISE_department implements Department {
    Scanner sc=new Scanner(System.in);

    @Override
    public void readData(Faculty f) {
        System.out.println("enter the name of faculty:\t");
        f.name= sc.next();
        System.out.println("Enter the designation:\t");
        f.designation= sc.next();
        System.out.println("Enter the age of the faculty:\t");
        int temp_age= sc.nextInt();
        if (temp_age<=58){
            f.age=temp_age;
        }else{
            throw new java.lang.Error("Age exception!");
        }
        System.out.println("Enter the years of experience:\t");
        f.years_of_experience= sc.nextInt();
        System.out.println("Enter the joining date");
        f.Joining_date= sc.next();
        System.out.println("Enter the subjects handled:\t ");
        f.subjects_handeled=sc.next();
        System.out.println("enter the number of consultancy projects:\t");
        f.number_research_consultancy_projs= sc.nextInt();
        System.out.println("enter the number of designations:\t");
        f.number_designations= sc.nextInt();
    }

    @Override
    public void printData(Faculty f) {
        System.out.print("Faculty name:\t"+f.name);
        System.out.print("Designation:\t"+f.designation);
        System.out.print("Age:\t"+f.age);
        System.out.print("Experience:\t"+f.years_of_experience);
        System.out.print("Joining date:\t"+f.Joining_date);
        System.out.print("Subjects handled:\t"+f.subjects_handeled);
        System.out.print("No of consultancy projects:\t"+f.number_research_consultancy_projs);
        System.out.print("No of designation:\t"+f.number_designations);

    }

    @Override
    public void print_number_of_designations(Faculty f) {
        System.out.print("The number of designations the faculty had till date are :\t"+f.number_designations);

    }

    @Override
    public void number_research_consultancy_projs(Faculty f) {
        System.out.print("No of consultancy projects:\t"+f.number_research_consultancy_projs);

    }
}
