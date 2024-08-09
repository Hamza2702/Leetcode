class Solution {
    public int maxDepth(String s) {
        int result = 0;
        int curr = 0;
        for (char c : s.toCharArray()){
            if (c == '('){
                curr++;
                result = Math.max(result, curr);
            } else if (c == ')'){
                curr--;
            }
        }
        return result;
    }
}
