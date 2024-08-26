import java.util.ArrayList;

public class subseq_having_k_sum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        ArrayList<Integer> list=new ArrayList<>();
        subseqsum(0,arr,list,0,2);
        System.out.println("sum = "+ countsubseqsum(0,arr,0,2,3));
    }

    public static void subseqsum(int idx, int a[], ArrayList<Integer> ls,int sum, int target){
        int n=a.length;
        if(idx == n){
            if(sum == target){
                for (int i : ls) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
            return;
        }
//        take element
        ls.add(a[idx]);
        subseqsum(idx+1,a,ls,sum,target);
        sum=sum+a[idx];
//        not take
        ls.remove(ls.size()-1);
        subseqsum(idx+1,a,ls,sum,target);
        sum=sum-a[idx];
    }

    public static int countsubseqsum(int idx,int[] arr,int sum,int target,int n){
        if(idx == n){
            if (sum == target) {
                return 1;
            } else {
                return 0;
            }
        }
        int take=countsubseqsum(idx+1,arr,sum+ arr[idx],target,n);
        int notake=countsubseqsum(idx+1,arr,sum,target,n);
        return  take+notake;
    }
}
