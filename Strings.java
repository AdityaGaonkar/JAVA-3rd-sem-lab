import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;

public class Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("1.Extract and print");
            System.out.println("2.Count the number of occurrences");
            System.out.println("3.Replace a given string");
            System.out.println("4.Rearrange to alphabetical order");
            System.out.println("5.Compare two strings");
            System.out.println("6.Concatenate");
            System.out.println("enter the choice");
            int ch=sc.nextInt();
            sc.nextLine();
            switch (ch){
                case 1:
                    System.out.println("Enter the string");
                    String s=sc.nextLine();
                    System.out.println("enter the position to be extracted");
                    int m=sc.nextInt();
                    System.out.println("enter number of character to be extracted");
                    int n= sc.nextInt();
                    String k=s.substring(m-1,m+n-1);
                    System.out.println("the extracted string is "+k);
                    break;
                case 2:
                    System.out.println("enter the string");
                    s=sc.nextLine();
                    System.out.println("enter the word to be counted");
                    String b= sc.next();
                    String arr[]=s.split(" ");
                    int counter =0;
                    for (int i=0;i< arr.length;i++){
                        if (arr[i].equals(b)){
                            counter++;
                        }
                    }
                    System.out.println("the number of times the word repeated is "+counter);
                    break;
                case 3:
                    System.out.println("enter the string");
                    s=sc.nextLine();
                    System.out.println("enter the string to be replaced");
                    k=sc.nextLine();
                    System.out.println("enter the string to be replaced with");
                    b=sc.nextLine();
                    String d=s.replace(k,b);
                    System.out.println("the new string is "+d);
                case 4:
                    System.out.println("enter the string");
                    s=sc.nextLine();
                    k=s.toLowerCase();
                    char arr1[]=k.toCharArray();
                    Arrays.sort(arr1);
                    String p=new String(arr1);
                    System.out.println("the rearranged array is "+p);
                    break;
                case 5:
                    System.out.println("enter the string");
                    s=sc.nextLine();
                    System.out.println("enter the string");
                    k=sc.nextLine();
                    boolean cp=s.equalsIgnoreCase(k);
                    if(cp){
                        System.out.println("equal");
                    }
                    else {
                        System.out.println("not equal");
                    }
                    break;
                case 6:
                    System.out.println("enter the string 1");
                    s=sc.nextLine();
                    System.out.println("enter the string 2");
                    k=sc.nextLine();
                    b=s.concat(k);
                    System.out.println("concatenated string is "+b);
                    break;
                default:
                    System.out.println("wrong choice");
            }

        }
    }
}

