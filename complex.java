import java.util.Scanner;

public class complex {
    int r1;
     int r2;
     int i1;
    int i2;

    complex(int rr1, int ii1, int rr2, int ii2) {
        r1 = rr1;
        r2 = rr2;
        i1 = ii1;
        i2 = ii2;
    }

    public void Add() {
        System.out.format("The sum of (%d + %di) and (%d + %di) is: (%d + %di)",r1,i1,r2,i2,r1+r2,i1+i2);
    }
    public void Subtract(){
        System.out.format("The sum of (%d + %di) and (%d + %di) is: (%d + %di)",r1,i1,r2,i2,r1-r2,i1-i2);
    }
    public void Multiply() {
        System.out.format("The multiplication of (%d + %di) and (%d + %di) is: (%d + %di)", r1, i1, r2, i2, (r1 * i1 - r2 * i2), (r1 * i2 + i1 * r2));
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the real and imagianry part of 1 st complex number");
        int rr1 = sc.nextInt();
        //System.out.printf();
        int ii1 = sc.nextInt();
        System.out.println("enter real and imaginary part of 2nd complex number ");
        int rr2 = sc.nextInt();
        //System.out.printf("\t");
        int ii2 = sc.nextInt();
        complex c1 = new complex(rr1,ii1,rr2,ii2);
        while (true) {
            System.out.println("\n1: enter 1 for addition\n 2:enter 2 for subtraction\n3:enter 3 for multiplicaton\n4:exit");
            int choice = sc.nextInt();
            // Using switch to present a menu driven program
            switch (choice) {
                case 1:
                    c1.Add();
                    break;
                case 2:
                    c1.Subtract();
                    break;
                case 3:
                    c1.Multiply();
                    break;
                case 4:System.exit(0);
                    break;
                default:
                    System.out.println("INVALID INPUT!");

            }
 }
}}