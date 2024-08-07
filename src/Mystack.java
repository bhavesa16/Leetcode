import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;

    public MyStack() {
        q1=new LinkedList<>();
        q2=new LinkedList<>();
    }

    public void push(int x) {
        q2.add(x);
        while( !q1.isEmpty()){
            q2.add(q1.poll());
        }
        Queue<Integer> temp =q1;
        q1=q2;
        q2=temp;
    }

    public int pop() {
        return q1.poll();
    }

    public int top() {
        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}
class trail{
    public static void main(String[] args) {
        MyStack s=new MyStack();
        s.push(6);
        s.push(3);
        s.push(7);
        System.out.println("top before= "+s.top());
        System.out.println("deleted element= "+s.pop());
        System.out.println("top after= "+s.top());
    }
}
