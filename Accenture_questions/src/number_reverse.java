public class number_reverse {
    public static void main(String[] args) {
        int n=36942;
        System.out.println("original number: "+n);
        int res=reverse(n);
        System.out.println("reversed number: "+res);
    }

    public static int reverse(int num){
        int rem;
        int rev=0;
        while(num!=0){
            rem= num % 10;
            rev= rev*10 + rem;
            num = num/10;
        }
        return  rev;
    }
}