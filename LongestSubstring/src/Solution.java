class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] characters = s.toCharArray();
        int max = 0;
        for(int i = 0; i < s.length(); i++){
            String solution = "";
            for (int j = i; j < s.length(); j++){
                if (solution.contains(Character.toString(s.charAt(j)))) {
                    break;
                } else {
                    solution = solution.concat(Character.toString(s.charAt(j)));
                }
                int l = solution.length();
                if (l > max)
                    max = l;
            }
        }
        return max;
    }
}