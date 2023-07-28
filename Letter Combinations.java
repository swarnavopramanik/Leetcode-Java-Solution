## Google 
  
/* https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/  */
  
  17. Letter Combinations of a Phone Number

/* Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. 
Return the answer in any order.

A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters. */


  /* Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"] */


  // Solution 
  
  // approach 1

  class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits.length() == 0)
            return ans;
        
        HashMap<Character, String> hm = new HashMap<>();
        hm.put('2', "abc");
        hm.put('3', "def");
        hm.put('4', "ghi");
        hm.put('5', "jkl");
        hm.put('6', "mno");
        hm.put('7', "pqrs");
        hm.put('8', "tuv");
        hm.put('9', "wxyz");
        
        backtrack(digits, 0, hm, new StringBuilder(), ans);
        return ans;
    }
    
    private static void backtrack(String digits, int i, HashMap<Character, String> hm, StringBuilder sb, List<String> ans){
        if(i == digits.length()){
            ans.add(sb.toString());
            return;
        }
        String curr =  hm.get(digits.charAt(i));
        for(int k =0; k <curr.length(); k++){
            sb.append(curr.charAt(k));
            backtrack(digits, i+1, hm,  sb, ans);
            sb.deleteCharAt(sb.length() -1);
        }
    }
}



  
  // approach 2

  class Solution {
    public List<String> letterCombinations(String digits) 
    {   ArrayList<String> list = new ArrayList<>();
        if(digits.isEmpty()) return list;

        return  keypad("",digits);
    }
    public List<String> keypad(String ans, String inp)
    {
         if(inp.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        
        // thsi will convert like,'2' into 2

         int digit=inp.charAt(0) - '0' ;
         ArrayList<String> list=new ArrayList<>();
         int i=(digit - 2) * 3;
         if( digit > 7) i+=1;
         int len=i + 3;
         if( digit == 7 || digit == 9) 
         len+=1;

         for(;i< len; i++)
        {
          char ch= (char) ('a' + i);
          list.addAll(keypad(ans + ch, inp.substring(1)));
        }
        return list;
   }
}
