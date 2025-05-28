14. Longest Common Prefix
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

Code:
class Solution {
    public String longestCommonPrefix(String[] strs) {
        //StringBuilder sb  = new StringBuilder(strs[0]);
        String  sb = strs[0];
        for(int i = 1; i< strs.length; i++){

            int j = 0;
            while(j < sb.length() && j < strs[i].length()){
                if( sb.charAt(j) != strs[i].charAt(j))
                    break;
                j++;                   
            }
            sb = sb.substring(0, j);
            if( sb == "")
                return "";
        }
        return sb;
    }
}