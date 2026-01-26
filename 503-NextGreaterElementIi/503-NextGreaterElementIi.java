// Last updated: 1/26/2026, 6:02:06 PM
class Solution {
    public int[] nextGreaterElements(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        Arrays.fill(res, -1);
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < 2 * n; i++) {
            int num = arr[i % n];
            while (!stack.isEmpty() && arr[stack.peek()] < num) {
                res[stack.pop()] = num;
            }
            if (i < n)
                stack.push(i);
        }
        return res;
    }
}