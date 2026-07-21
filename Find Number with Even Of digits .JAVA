class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;

        for (int b : nums) {
            int c = 1;
            int n = b;

            while (n >= 10) {
                n /= 10;
                c+=1;
            }

            if (c % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}
