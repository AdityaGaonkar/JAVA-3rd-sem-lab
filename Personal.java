import java.util.Scanner;

public class Personal {
    String name;
    int age;
    String edu;
    int salary;
    int yr_of_exp;
    int no_of_loans;
    double[] loan_amt;
    Personal(String name,int age,String edu,int salary,int yr_of_exp,int no_of_loans,double[] loan_amt){
        this.name=name;
        this.age=age;
        this.edu=edu;
        this.salary=salary;
        this.yr_of_exp=yr_of_exp;
        this.no_of_loans=no_of_loans;
        this.loan_amt=new double[no_of_loans];
        this.loan_amt=loan_amt;
    }
    void isEligible(Personal p){
        if(p.no_of_loans<3){
            System.out.println("Heis eligible for loan");
        }
        else {
            System.out.println("Not eligible");
        }
    }
    void tax(Personal p){
        double tax;
        if (p.salary<250000){
            System.out.println("no tax");
        }
        if (p.salary<500000&&p.salary>250000){
            tax=0.3*salary;
            System.out.println("tax is "+ tax);
        }
        if (p.salary>500000&&p.salary<1000000){
            tax=0.5*salary;
            System.out.println("tax is "+ tax);
        }
        if (p.salary>1000000){
            tax=0.7*salary;
            System.out.println("tax is "+ tax);
        }
    }
    void isEligiblePromotion(Personal p){
        if (p.yr_of_exp>5&&p.no_of_loans<3){
            System.out.println("elgible for promotion");
        }else {
            System.out.println("not eligible");
        }
    }
    void display(Personal p){
        System.out.println("Name is"+p.name);
        System.out.println("age is "+p.age);
        System.out.println("education is"+p.edu);
        System.out.println("salary is "+p.salary);
        System.out.println("year of experience is "+p.yr_of_exp);
        System.out.println("no of loans is "+p.no_of_loans);
        System.out.println("loan amount for each loan is");
        for (int i=0;i<p.no_of_loans;i++){
            System.out.println(p.loan_amt[i]+" ");
        }
        p.isEligible(p);
        p.tax(p);
        p.isEligiblePromotion(p);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of employees");
        int n= sc.nextInt();
        Personal[] p=new Personal[n];
        for (int i=0;i<n;i++){
            System.out.println("Enter the name");
            String name=sc.next();
            System.out.println("Enter age");
            int age=sc.nextInt();
            System.out.println("enter education");
            String edu= sc.next();
            System.out.println("Enter salary");
            int salary= sc.nextInt();
            System.out.println("enter year of experience");
            int yr_of_experience= sc.nextInt();
            System.out.println("enter no of loans");
            int no_of_loans= sc.nextInt();
            double[] loan_amt=new double[no_of_loans];
            for (int j=0;j<no_of_loans;j++){
                System.out.println("enter  loan amount "+(j+1));
                loan_amt[j]= sc.nextDouble();
            }
            //sc.next();
            p[i]=new Personal(name,age,edu,salary,yr_of_experience,no_of_loans,loan_amt);
            System.out.println("Details of the employee are");
            System.out.println("--------------------------------");
            p[i].display(p[i]);
            System.out.println("--------------------------------");
        }
    }
}
