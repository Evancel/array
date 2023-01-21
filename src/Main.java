import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       /* task0();
        System.out.println();*/
        task1();
        System.out.println();
        }

    /*    public static void task0(){
            int [] weights = {90,91,93,92,85,87,88,89,0,0,0,0};
            weights[0] = 90;
            int januaryWeight = weights[0];
            System.out.println(januaryWeight);
            System.out.println(weights[0]);
            System.out.println(weights[4]);
            System.out.println(weights[11]);
            int january = 0;
            System.out.println(weights[january]);
            for (int i = 0; i < weights.length; i++) {
                System.out.println(weights[i]);
            }
        }
*/
        public static void task1(){
            int [] arr1 = new int[3];
            arr1[0] = 1;
            arr1[1] = 2;
            arr1[2] = 3;

            double [] arr2 = {1.57, 7.654, 9.986};

            int countStudents = 10;
            int [] arr3 = new int[countStudents];
            int v = 5;
            for (int i = 0; i < arr3.length; i++) {
                arr3[i] = v;
                v+=3;
            }


            //task2
            System.out.println("Task2:");
            for (int i = 0; i < arr1.length; i++) {
                if (i== arr1.length-1){
                    System.out.println(arr1[i]);
                } else {
                    System.out.print(arr1[i] + ", ");
                }
            }

            for (int i = 0; i < arr2.length; i++) {
                if (i == arr2.length - 1) {
                    System.out.println(arr2[i]);
                } else {
                    System.out.print(arr2[i] + ", ");
                }
            }

            for (int i = 0; i < arr3.length; i++) {
                if (i == arr3.length - 1) {
                    System.out.println(arr3[i]);
                } else {
                    System.out.print(arr3[i] + ", ");
                }
            }
            System.out.println();

            //task3
            System.out.println("Task3:");
            for (int j = arr1.length - 1; j >= 0 ; j--) {
                if (j== 0){
                    System.out.println(arr1[j]);
                } else {
                    System.out.print(arr1[j] + ", ");
                }
            }

            for (int j = arr2.length - 1; j >= 0 ; j--) {
                if (j== 0){
                    System.out.println(arr2[j]);
                } else {
                    System.out.print(arr2[j] + ", ");
                }
            }

            for (int j = arr3.length - 1; j >= 0 ; j--) {
                if (j== 0){
                    System.out.println(arr3[j]);
                } else {
                    System.out.print(arr3[j] + ", ");
                }
            }
            System.out.println();

            //task4
            System.out.println("Task4:");
            for (int i = 0; i < arr1.length; i++) {
                if(arr1[i]%2 != 0){
                    arr1[i] += 1;
                }
            }
            System.out.println(Arrays.toString(arr1));
        }
    }