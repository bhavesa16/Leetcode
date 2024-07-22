class queue{
    int arr[];
    int front,rear,count,size;
    public queue(){
        arr=new int[16];
        front=-1;
        rear=-1;
        count=0;
    }
    public queue(int size){
        this.size=size;
        arr=new int[size];
        front=-1;
        rear=-1;
        count=0;
    }

    void push(int ele){
        if(count==size){
            System.out.println("queue is full");
        }
        if(rear == -1){
            front=0;
            rear=0;
        }else{
            rear=(rear+1)%size;
        }
        arr[rear]=ele;
        System.out.println("element pushed");
        count++;

    }

    int pop(){
        if(front == -1){
            System.out.println("queue is empty");
        }
        int popped=arr[front];
        if(count == -1){
            rear=-1;
            front=-1;
        }else{
            front=(front+1)%size;
        }
        count--;
        return popped;
    }

    int top() {
        if (front == -1) {
            System.out.println("Queue is Empty");
            System.exit(1);
        }
        return arr[front];
    }

    public int size() {
        return count;
    }
}

public class queue_using_array {
    public static void main(String[] args) {
        queue q=new queue(6);
        q.push(4);
        q.push(14);
        q.push(24);
        q.push(34);
        System.out.println("The peek of the queue before deleting any element " + q.top());
        System.out.println("The size of the queue before deletion " + q.size());
        System.out.println("The first element to be deleted " + q.pop());
        System.out.println("The peek of the queue after deleting an element " + q.top());
        System.out.println("The size of the queue after deleting an element " + q.size());
    }
}