package homework2;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 0, 1, 1, 1, 0, 0, 0, 1};
        int[] arr2 = new int[8];
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        replacemant0and1(arr1);
        System.out.println();
        fillingArr(arr2);
        System.out.println();
        multiplyNumbersLess6(arr3);
        System.out.println();
        fillingDiagonalElements(3);
        System.out.println();
        searchMinAndMax(arr3);

    }

    static void replacemant0and1(int array[]) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0)
                array[i] = 1;
            else array[i] = 0;
            System.out.print(array[i] + " ");
        }

    }

    static void fillingArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
            System.out.print(arr[i] + " ");
        }
    }

    static void multiplyNumbersLess6(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6)
                arr[i] = arr[i] * 2;
            System.out.print(arr[i] + " ");
        }

    }

    static void fillingDiagonalElements(int n) {
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j)
                    arr[i][j] = 1;
                System.out.print(arr[i][j] + " ");
            }
        }

    }

    static void searchMinAndMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Минимальное значение: " + min + " Максимальное значение:  " + max);
    }


    }

