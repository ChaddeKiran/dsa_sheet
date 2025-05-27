58. Length of Last Word

Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.

Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.

code:
class Solution {
    public int lengthOfLastWord(String s) {
        
        String words[] = s.trim().split(" ");
       // String lastWord =  words[words.length -1];
        // System.out.println("Length : "+ words[words.length -1] ); 

        return words[words.length -1].length();

    }
}