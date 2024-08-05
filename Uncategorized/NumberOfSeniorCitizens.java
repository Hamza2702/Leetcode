class Solution {
    public int countSeniors(String[] details) {
        int seniors = 0;
        for (String person : details){
           if (person.charAt(11) == '6' && person.charAt(12) == '0'){
               continue;
           }

           if (person.charAt(11) >= '6'){
               seniors++;
           }
        }
        return seniors;
    }
}
