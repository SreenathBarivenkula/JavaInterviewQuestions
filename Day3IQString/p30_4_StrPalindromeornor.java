package Day3IQString;

public class p30_4_StrPalindromeornor {

	public static void main(String[] args) {
		 String str = "madam"; 	        
	       
		 str = str.replaceAll("\\s+", "").toLowerCase();
	        
	        if (isPalindrome(str)) {
	            System.out.println(str + " is a palindrome.");
	        } else {
	            System.out.println(str + " is not a palindrome.");
	        }
	    }

	    public static boolean isPalindrome(String str) {
	        int left = 0;
	        int right = str.length() - 1;

	        while (left < right) {
	            if (str.charAt(left) != str.charAt(right)) {
	                return false; 
	            }
	            left++;
	            right--;
	        }
	        return true; 
	    }

	}
