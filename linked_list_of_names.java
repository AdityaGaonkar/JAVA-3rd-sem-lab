import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class linked_list_of_names {
    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList<String>();
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("1.add the name to list");
            System.out.println("2.delete the  item from the list");
            System.out.println("3.display whose length is less than 5");
            System.out.println("4.exit");
            System.out.println("enter your choice");
            int n= sc.nextInt();
            switch (n){
                case 1:
                    System.out.println("enter the name to enqueue");
                    String s= sc.next();
                    ll.add(s);
                    System.out.println("added successfully");
                    break;
                case 2:
                    if (ll.isEmpty()){
                        System.out.println("list is empty");
                    }else{
                    System.out.println("enter the index to delete");
                    int i= sc.nextInt();
                    ll.remove(i);
                        System.out.println("element deleted successfully");
                    }
                    break;
                case 3:
                    if (ll.peek()==null){
                        System.out.println("list is empty");
                    }else{
                    Iterator<String> itr=ll.iterator();

                        System.out.println("the strings whose length is less than 5 are");
                    while (itr.hasNext())
                        {
                            String e = itr.next();
                            if (e.length() < 5) {
                                System.out.println(e+" ");
                            }
                        }
                }
                    break;
                case 4:
                    if (ll.peek()==null){
                        System.out.println("list is empty");
                    }else{
                        Iterator<String> itr=ll.iterator();

                        System.out.println("the strings whose length is less than 5 are");
                        while (itr.hasNext())
                        {
                            String e = itr.next();

                                System.out.println(e+" ");

                        }
                    }
                break;
                default:
                    System.out.println("wrong choice");
            }
        }
    }
}
