class Solution {
    public int subarraySum(int[] nums, int k) {
        int res = 0;
        int ps = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i : nums){
            ps += i;
            res += map.getOrDefault(ps - k, 0);
            map.put(ps, map.getOrDefault(ps,0) +1);
        }
        return res;
    }
}
