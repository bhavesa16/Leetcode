import java.util.*;
public class count_occurence {
    public static void main(String[] args) {
//        int[] a={1,2,3,5,2};
        int elem=2;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("enter elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int res=count_occr(arr,elem);
        System.out.println("occurence of "+elem+" in array:" +res);
    }
    public  static int count_occr(int[] arr,int elem){
        int count=0;
        for(int num:arr){
            if(num==elem){
                count++;
            }
        }
        return count;
    }
}
