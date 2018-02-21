
// Author: Murtaza Meerza

package balancedParentheses;

import algs13.*;

import stdlib.*;

public class BalancedParentheses {

	public static void main(String[] args) {
		 Stack<String> BPstack = new Stack<>();
	        StdOut.print("Enter the Target string");
	        String text= StdIn.readLine();
	        for(int i=0;i<text.length() ; i++){
	            if(text.charAt(i)=='('){
	                BPstack.push(text);
	            }
	            else{
	                if(text.charAt(i)==')'){
	                    if(!BPstack.isEmpty()){
	                        BPstack.pop();
	                    }
	                    else{
	                        StdOut.printf("This is not balanced");
	                        System.exit(0);

	                    }
	                }
	            }
	        }
	        if(!BPstack.isEmpty()){
	            StdOut.printf("Unbalanced left Parentheses were found");
	        }
	        else{
	            StdOut.printf("The Parentheses were balanced");
	        }

	    }

	}
	
		

