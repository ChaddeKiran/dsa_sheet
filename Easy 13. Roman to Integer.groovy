13. Roman to Integer

Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.

 

Example 1:

Input: s = "III"
Output: 3
Explanation: III = 3.
Example 2:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.

code:
import java.util.HashMap;
class Solution {

    public int check(char ch){
        switch(ch){
            case 'I':  return 1;   
            case 'V':  return 5;
            case 'X':  return 10;
            case 'L':  return 50;
            case 'C':  return 100;
            case 'D':  return 500;
            case 'M':  return 1000;
            default : return 0;
        }
    }
    public int romanToInt(String s) {
        //   HashMap<Character, Integer> roman = new HashMap<>();
        // roman.put('I', 1);
        // roman.put('V', 5);
        // roman.put('X', 10);
        // roman.put('L', 50);
        // roman.put('C', 100);
        // roman.put('D', 500);
        // roman.put('M', 1000);

        int sum = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            if (check(s.charAt(i)) < check(s.charAt(i + 1))) {
                sum -= check(s.charAt(i));
            } else {
                sum += check(s.charAt(i));
            }
        }
        sum += check(s.charAt(s.length() - 1));

        return sum;
    }
}