import java.util.Arrays;

class Main {
    
    public static boolean threeSum(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        for (int i = 0; i < n - 2; i++) {
            int a = arr[i];
            int start = i + 1;
            int end = n - 1;
            while (start < end) {
                int b = arr[start];
                int c = arr[end];
                int sum = a + b + c;
                if (sum == 0) {
                    return true;
                } else if (sum > 0) {
                    end--;
                } else {
                    start++;
                }
            }
        }
        return false;
    }

    public static void runTest(int[] arr) {
        boolean result = threeSum(arr);
        System.out.println("Test for array: " + Arrays.toString(arr));
        if (result) {
            System.out.println("\t - True");
        } else {
            System.out.println("\t - False");
        }
    }

    public static void main(String[] args) {
        int[] test1 = {-6, 2, 4};
        runTest(test1);

        int[] test2 = {-6, 2, 5};
        runTest(test2);

        int[] test3 = {-6, 3, 10, 200};
        runTest(test3);

        int[] test4 = {8, 2, -1, 15};
        runTest(test4);

        int[] test5 = {8, 2, -1, -1, 15};
        runTest(test5);

        int[] test6 = {5, 1, 0, 3, 6};
        runTest(test6);
    }
}