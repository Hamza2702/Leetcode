class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List array = new ArrayList<>();

        for (int i = 0; i < words.length; i++){
            String str = words[i];
            for (int j = 0; j < str.length(); j++){
                char s = str.charAt(j);
                if (x == s){
                    array.add(i);
                    break;
                }
            }
        }
        return array;
    }
}
