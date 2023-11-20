import java.util.Scanner;

public class Main {

    public static void AscendingOrderByUsingBubble(int[] arr){

//        int value;
//        for (int i = 0; i < my.length; i++) {
//            for (int j = k + 1; l < my.length; l++) {
//                if (my[k] > my[l]) {
//                    value = my[k];
//                    my[k] = my[l];
//                    my[l] = value;
//                }
//            }
//        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("This is bubble sort >>>");
    }

    public static void AscendingOrderByUsingInsertion(int[] my){
        int n = my.length;
        for (int i = 1; i < n; ++i) {
            int key = my[i];
            int j = i - 1;

            while (j >= 0 && my[j] > key) {
                my[j + 1] = my[j];
                j = j - 1;
            }
            my[j + 1] = key;
        }
        System.out.println("This is insertion sort >>>");
    }



    public static void Print(int [] my){
        for (int k : my) System.out.println(k);
    }




    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = s.nextInt();

        if(number < 0) System.out.println("error");
        else {
            int[] my = new int[number];
            for (int i = 0; i < my.length; i++) {
                System.out.println("Enter your number value: ");
                my[i] = s.nextInt();
            }

            AscendingOrderByUsingBubble(my);
            Print(my);
            AscendingOrderByUsingInsertion(my);
            Print(my);
        }
    }
}


/* reference : https://beginnersbook.com/2018/10/java-program-to-sort-an-array-in-ascending-order/
               https://stackoverflow.com/questions/7787754/sorting-integers-in-order-lowest-to-highest-java
               https://docs.oracle.com/javase/8/docs/api/java/lang/Character.html#digit-char-i
               https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html#compareUnsigned-int-int-
               https://sentry.io/answers/how-do-i-convert-a-string-to-an-int-in-java/

*/

