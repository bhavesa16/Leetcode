public class Print_number_from_1_to_N {
    public static void printnumber(int i,int n){
        if (i>n)
            return;
        System.out.println(i);
        printnumber(i+1,n);
    }

    public static void main(String[] args) {
        int n=5;
        printnumber(1,n);
    }
}
