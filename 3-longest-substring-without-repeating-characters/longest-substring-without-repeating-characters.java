class Solution {
    public int lengthOfLongestSubstring(String s) {
        String s1 = "";
        int count = 0;
        int max = 0;

        for (int i=0; i<s.length(); i++){
            char ch = s.charAt(i);


            while (s1.indexOf(ch) != -1){
                s1 = s1.substring(1);
            }
            s1 += ch;
            count = s1.length();
            if (count > max){
                max = count;
            }

            
        }
        return max;
        
    }
}