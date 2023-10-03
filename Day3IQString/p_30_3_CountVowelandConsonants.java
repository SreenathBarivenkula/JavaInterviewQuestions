package Day3IQString;

public class p_30_3_CountVowelandConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="SreenathNick";
		str=str.toLowerCase();
		int v=0,c=0;
		
		for(int i=0;i<str.length();i++) {
		if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
			
			v++;
		}else {
			c++;
		}
		}
		System.out.println("Vowels are :"+ v);
		System.out.println("Consonants are :"+ c);
	}
}
