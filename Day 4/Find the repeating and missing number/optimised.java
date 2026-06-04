class Solution {

    int[] findTwoElement(int arr[]) {

        int n = arr.length;

        long actualSum = 0;
        long actualSqSum = 0;

        for (int num : arr) {
            actualSum += num;
            actualSqSum += (long) num * num;
        }

        long expectedSum = (long) n * (n + 1) / 2;
        long expectedSqSum =
                (long) n * (n + 1) * (2L * n + 1) / 6;

        long diff = actualSum - expectedSum; // x - y

        long sqDiff =
                actualSqSum - expectedSqSum; // x² - y²

        long sum = sqDiff / diff; // x + y

        int repeating = (int) ((diff + sum) / 2);
        int missing = (int) (sum - repeating);

        return new int[]{repeating, missing};
    }
}