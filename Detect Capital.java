520. Detect Capital


  class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.length() == 0)  return true;
        int cnt = 0;
        int len = word.length();
        for(int i =0;i<len;i++)   {
            int ch = word.charAt(i);
            if(ch >= 65 && ch < 91 ) // for Captial Letters 
                cnt++;
        }
        if(cnt == len)   return true; // LEETCODE
        if(cnt == 0) return true;   // leetcode 
        if(cnt == 1 && word.charAt(0) >= 65 && word.charAt(0) < 91)   return true;        // Leetcode 
        return false;
    }
}
