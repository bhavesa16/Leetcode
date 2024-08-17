public class evenOddDifference {
    public static void main(String[] args) {
        int m=1,n=10;
        System.out.println(squarerootDiff(m,n));
    }
    public static double squarerootDiff(int m,int n){
        double evensum=0,oddsum=0;
        for(int i=m;i<=n;i++){
            double sqr=Math.sqrt(i);
            if(i%2==0){
                evensum += sqr;
            } else{
                oddsum += sqr;
            }
        }
        return evensum-oddsum;
    }
}
