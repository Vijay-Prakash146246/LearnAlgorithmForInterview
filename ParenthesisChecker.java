/*
Company Tags
Flipkart Amazon Microsoft OYO Rooms Snapdeal Oracle Walmart Adobe Google Yatra.com

Parenthesis Checker
Given an expression string x. Examine whether the pairs and the orders of {,},(,),[,] are correct in exp.
For example, the function should return 'true' for exp = [()]{}{[()()]()} and 'false' for exp = [(]).

Note: The drive code prints "balanced" if function return true, otherwise it prints "not balanced".

Example 1:

Input:
{([])}
Output: 
true
Explanation: 
{ ( [ ] ) }. Same colored brackets can form 
balanced pairs, with 0 number of 
unbalanced bracket.

Example 3:

Input: 
([]
Output: 
false
Explanation: 
([]. Here square bracket is balanced but 
the small bracket is not balanced and 
Hence , the output will be unbalanced.

Expected Time Complexity: O(|x|)
Expected Auixilliary Space: O(|x|)

Constraints:
1 ≤ |x| ≤ 32000

*/
import java.util.*;
class ParenthesisChecker
 
{
	static boolean ispar(String x)
    {
        // add your code here
        //Here we are creating stack for pushing open paranthesis 
        Stack<Character> s = new Stack<>();
        for(int i=0;i<x.length();i++)
        {
            char ch = x.charAt(i);
            if(ch=='('||ch=='{'||ch=='[')
            {
                s.push(ch);
                continue;
            }
            else
            {
                //checking string contain open bracket or not for matching
            if(s.isEmpty())
            return false;
    
                    //Here we are checking maching if match then ok 
                    //other wise is is incorrect 
              char element = s.pop(); 
                if((ch == ')' && element == '(') ||  (ch == ']' && element == '[') || (ch == '}' && element == '{')) 
                continue;
                else return false;
            }
        }
        return s.isEmpty();
    }
	public static void main(String[] args) 
	{
		String str = "{([])}(";
			if (ispar(str ))
			{
			     			System.out.println("balanced");
			}
			else
		{
						System.out.println("unbalanced");
		}
	}
}
