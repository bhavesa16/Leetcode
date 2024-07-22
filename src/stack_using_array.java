public class stack_using_array {
    public static void main(String[] args) {
        stack s=new stack();
        s.push(6);
        s.push(3);
        s.push(7);
        System.out.println("top before= "+s.top());
        System.out.println("size before= "+s.size());
        System.out.println("deleted element= "+s.pop());
        System.out.println("size after= "+s.size());
        System.out.println("top after= "+s.top());
    }

}
class stack{
    int size=1000;
    int arr[]=new int[size];
    int top=-1;

    void push(int x) {
        top++;
        arr[top] = x;
    }
    int pop(){
        int x=arr[top];
        top--;
        return x;
    }

    int size(){
        int ssize=top+1;
        return ssize;
    }

    int top(){
        return arr[top];
    }
}
