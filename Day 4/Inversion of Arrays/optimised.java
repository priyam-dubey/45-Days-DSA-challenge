class Solution {

    public long inversionCount(long[] arr) {
        return mergeSort(arr, 0, arr.length - 1);
    }

    private long mergeSort(long[] arr, int low, int high) {

        long count = 0;

        if (low < high) {

            int mid = low + (high - low) / 2;

            count += mergeSort(arr, low, mid);
            count += mergeSort(arr, mid + 1, high);

            count += merge(arr, low, mid, high);
        }

        return count;
    }

    private long merge(
            long[] arr,
            int low,
            int mid,
            int high) {

        long count = 0;

        long[] temp =
                new long[high - low + 1];

        int left = low;
        int right = mid + 1;
        int k = 0;

        while (left <= mid && right <= high) {

            if (arr[left] <= arr[right]) {
                temp[k++] = arr[left++];
            } else {

                count += (mid - left + 1);

                temp[k++] = arr[right++];
            }
        }

        while (left <= mid) {
            temp[k++] = arr[left++];
        }

        while (right <= high) {
            temp[k++] = arr[right++];
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp[i - low];
        }

        return count;
    }
}