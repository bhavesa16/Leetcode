public class sum_n_numbers {
    public static int sum(int i,int sum){
        if(i<1)
            return sum;
        return sum(i-1,sum+i);
    }

    public static int sumfunc(int n){
        if(n==0)
            return 0;
        return n+sumfunc(n-1);
    }
    public static void main(String[] args) {
        int sum=0;
        int res=sum(4,sum);
        int res2=sumfunc(4);
        System.out.println(res);
        System.out.println(res2);

    }
}
