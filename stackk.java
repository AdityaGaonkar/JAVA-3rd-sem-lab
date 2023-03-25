import java.util.Scanner;

public class stackk {
    int top;
    int size;
    int stack[];
    stackk(int top,int size){
        this.top=top;
        this.size=size;
        this.stack=new int[size];
    }
    public void push(int ele){
        if(top==size-1){
            System.out.println("stack is full");
        }
        else{
            stack[++top]=ele;
        }
    }
    public int pop(){
        if (top==-1){
            System.out.println("stack is empty");
            return -1000;
        }
        else{
            return stack[top--];
        }
    }
    public void display(){
        System.out.println("the elements of the stack are");
        for (int i=0;i<=top;i++){
            System.out.println(stack[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the stack");
        int size= sc.nextInt();
        stackk s=new stackk(-1,size);
        while (true){
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.display");
            int n= sc.nextInt();
            switch (n){
                case 1:
                    System.out.println("enter the element to be pushed");
                    int ele= sc.nextInt();
                    s.push(ele);
                    break;
                case 2:
                    int num= s.pop();
                    System.out.println("The popped element is "+num);
                    break;
                case 3:
                    s.display();
                    break;
                default:
                    System.out.println("fuck off");
            }
        }
    }
}
