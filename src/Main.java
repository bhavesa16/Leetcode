public class Main {
        public boolean threeConsecutiveOdds(int[] arr) {
            int count=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i] % 2 != 0){
                    count++;
                    if(count == 3){
                        return true;
                    }
                }else{
                    count=0;
                }
            }
            return false;
        }

    public static void main(String[] args) {
        Main main = new Main();

        // Test case 1: Contains three consecutive odd numbers
        int[] testArray1 = {2, 6, 4, 1, 3, 5};
        boolean result1 = main.threeConsecutiveOdds(testArray1);
        System.out.println("Test case 1: " + result1);
    }
}