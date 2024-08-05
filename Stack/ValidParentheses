class Solution {
    public boolean isValid(String s) {
        Stack<String> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(")");
            }
            else if (c == '{') {
                stack.push("}");
            }
            else if (c == '[') {
                stack.push("]");
            }
            else if (stack.isEmpty() || !stack.pop().equals(Character.toString(c)))
                return false;

        }
        return stack.isEmpty();
    }
}
