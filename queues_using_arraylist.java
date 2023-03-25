import java.util.ArrayList;
import java.util.Scanner;

public class queues_using_arraylist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> Q=new ArrayList<String>();
        while (true){
            System.out.println("1.Enqueue");
            System.out.println("2.Dequeue");
            System.out.println("3.peak element");
            System.out.println("4.display");
            System.out.println("5.exit");
            System.out.println("enter your choice");
            int n= sc.nextInt();
            String s;
            switch (n){
                case 1:
                    System.out.println("enter the string to be enqueued");
                    s= sc.next();
                    Q.add(s);
                    System.out.println("element enqueued successfully");
                    break;
                case 2:
                    if(Q.isEmpty()){
                        System.out.println("empty queue");
                    }
                    else{
                        Q.remove(0);
                        System.out.println("element dequeued successfully");
                    }
                    break;
                case 3:
                    if (Q.isEmpty()){
                        System.out.println("queue is empty");
                    }
                    else{
                        System.out.println("peak element is "+Q.get(0));
                    }
                    break;
                case 4:
                    System.out.println("elements of the queue are");
                    for (int i=0;i< Q.size();i++){
                        System.out.println(Q.get(i)+ " ");
                    }
                    break;
                case 5:System.exit(0);
                break;
                default:
                    System.out.println("wrong choice");
            }
        }
    }
}
