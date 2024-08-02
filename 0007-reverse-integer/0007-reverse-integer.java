public class Solution {
    public int reverse(int x) {
        long reversed = 0; 
        while (x != 0) {
            int digit = x % 10;  
            reversed = reversed * 10 + digit;  
            x /= 10;
            if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
                return 0; 
            }
        }

        return (int) reversed; 
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int num = 123;
        System.out.println(solution.reverse(num)); 
        num = -123;
        System.out.println(solution.reverse(num));
        num = 1534236469;
        System.out.println(solution.reverse(num));
    }
}
