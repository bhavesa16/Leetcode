public class primeno {
    public static void main(String[] args) {
        int number = 29;
        System.out.println("number="+number);
        System.out.println(isPrime(number));
        int number2=20;
        System.out.println("number="+number2);
        System.out.println(isPrime(number2));
    }
    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<Math.sqrt(num);i++){
            if(num % i == 0)
                return  false;
        }
        return true;
    }
}
