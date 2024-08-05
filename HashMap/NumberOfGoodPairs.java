class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        int counter = 0;

        for (int num : nums){
            int numCount = hm.getOrDefault(num, 0);
            counter += numCount;
            hm.put(num, numCount + 1);
        }
        return counter;
    }
}
