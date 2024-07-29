import java.util.*;
public class MyQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;
    public MyQueue() {
        s1=new Stack<Integer>();
        s2=new Stack<Integer>();
    }

    public void push(int x) {
        s1.add(x);
    }

    public int pop() {
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int ele=s2.pop();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return ele;
    }

    public int peek() {
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int ele=s2.peek();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return ele;
    }

    public boolean empty() {
        return s1.isEmpty();
    }

    public static void main(String[] args) {
        MyQueue q=new MyQueue();
        q.push(4);
        q.push(14);
        q.push(24);
        q.push(34);
        System.out.println("The peek of the queue before deleting any element " + q.peek());
        System.out.println("The first element to be deleted " + q.pop());
        System.out.println("The peek of the queue after deleting an element " + q.peek());
        System.out.println(q.empty());
    }
}
