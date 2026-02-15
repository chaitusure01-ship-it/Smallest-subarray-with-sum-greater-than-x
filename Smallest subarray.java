class Solution {
    public static int smallestSubWithSum(int x, int[] arr) {

        int start = 0;
        int n = arr.length;
        int sum = 0;
        int minlength = n + 1;

        for (int i = 0; i < n; i++) {

            sum = sum + arr[i];

            while (sum > x) {

                int currlength = i - start + 1;

                if (currlength < minlength) {
                    minlength = currlength;
                }

            
                sum = sum - arr[start];
                start++;
            }
        }

        if (minlength == n + 1) {
            return 0;
        } else {
            return minlength;
        }
    }
}
