You are given a string s consisting of lowercase English letters.

You must repeatedly perform the following operation while the string s has at least two consecutive characters:

Remove the leftmost pair of adjacent characters in the string that are consecutive in the alphabet, in either order (e.g., 'a' and 'b', or 'b' and 'a').
Shift the remaining characters to the left to fill the gap.
Return the resulting string after no more operations can be performed.

Note: Consider the alphabet as circular, thus 'a' and 'z' are consecutive.

 Example 1:

Input: s = "abc"

Output: "c"

Example 2:

Input: s = "adcb"

Output: ""

Explanation:

Remove "dc" from the string, leaving "ab" as the remaining string.
Remove "ab" from the string, leaving "" as the remaining string.
No further operations are possible. Thus, the resulting string after all possible removals is "".

Code: 
class Solution {

    private boolean isConsecutive(String s){
        
        int diff = Math.abs(((int)s.charAt(0) - 'a' + 26) % 26 - ((int)s.charAt(1) - 'a' + 26) % 26);
        return diff == 1 || diff == 25;  // diff == 0 for same
    }
    public String resultingString(String s) {
        StringBuilder sb = new StringBuilder(s);
      
        int i =0;
        String sub; 
        while( i < sb.length() - 1 ){
            sub = sb.substring(i, i+2);
            if( isConsecutive(sub) ){
                sb.delete(i, i+2);
                if(i == 0){
                    i=0;
                }  
                else 
                    i--;
                
            }
            else
                i++;    
 
        }
        return sb.toString();
        //return "";
         
    }
}