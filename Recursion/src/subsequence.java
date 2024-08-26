import java.util.ArrayList;

public class subsequence {
    public static void main(String[] args) {
        int[] arr={3,1,2};
        int n=arr.length;
        ArrayList<Integer> list=new ArrayList<>();
        subseq(0,arr,list,n);
        System.out.println("total subsequence = "+countSubseq(0,arr,n));
    }
    public static void subseq(int idx, int[] arr, ArrayList<Integer> list,int n){
        if(idx == n){
                for (int i : list) {
                    System.out.print(i + " ");
                }
                System.out.println();
            return;
        }
//        take element
        list.add(arr[idx]);
        subseq(idx+1,arr,list,n);
//        not take
        list.remove(list.size()-1);
        subseq(idx+1,arr,list,n);
    }

//    count subsequence
    public static int countSubseq(int idx,int[] arr,int n){
        if(idx == n)
            return 1;
        int take=countSubseq(idx+1,arr,n);
        int notake=countSubseq(idx+1,arr,n);
        return  take+notake;
    }
}
