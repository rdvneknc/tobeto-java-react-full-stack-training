package Q7;

public class PerfectNumbers {

    public static void main(String[] s1){

        double num, sum = 0; //6
        double i;
        for (num = 1; num < 999999999; num++) { //
            for (double j = 1; j < num; j++) {   //
                if (num % j == 0) { //
                    sum = sum + j; //2
                }
            }
            if (sum == num) {
                System.out.println(sum);
            }
            sum = 0;                              // change made here
        }

    }
}




       //6
//        28
//        496
//        8128
//        130816
//        2096128
//        33550336
//        536870912
//        8589869056
//        137438691328


//p = 2:   21(22−1) = 6
//p = 3:   22(23−1) = 28
//p = 5:   24(25−1) = 496
//p = 7:   26(27−1) = 8128.
