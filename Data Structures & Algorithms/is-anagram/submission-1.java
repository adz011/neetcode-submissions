class Solution {
    public boolean isAnagram(String s, String t) {
        int[] diff = new int[27];
        if(s.length() != t.length()){
            return false;
        }
        for(int i =0; i< s.length(); i++){
            diff[s.charAt(i) & 31]++;
            diff[t.charAt(i) & 31]--;
        }
        for (int j : diff) {
            if (j != 0) {
                return false;
            }
        }
        return true;
    }
}
