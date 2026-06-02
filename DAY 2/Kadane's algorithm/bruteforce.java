class BruteForce {

    public static int maxSubArray(int[] arr) {

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {

                int sum = 0;

                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }

                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};

        System.out.println(maxSubArray(arr));
    }
}