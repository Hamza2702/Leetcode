class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
        	return true;
        }
        int start = 0;
        int last = s.length() - 1;
        while(start <= last) {
        	char cFirst = s.charAt(start);
        	char cLast = s.charAt(last);
        	if (!Character.isLetterOrDigit(cFirst )) {
        		start++;
        	} else if(!Character.isLetterOrDigit(cLast)) {
        		last--;
        	} else {
        		if (Character.toLowerCase(cFirst) != Character.toLowerCase(cLast)) {
        			return false;
        		}
        		start++;
        		last--;
        	}
        }
        return true;
    }
}
