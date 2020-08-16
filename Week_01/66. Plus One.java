package result;

class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = 0; i < digits.length; i++) {
            digits[i] += 1;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}