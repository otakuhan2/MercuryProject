import java.util.HashMap;
import java.util.Map;
class problem1{
	public static void main(String []args){
		
		//a given string	
		String str = new String("abadacababaaaa");
		
		//boolean found check if the required character exist
		boolean found = false;
		
		//define a char to store the value of qualified character
		char qualifiedChar = '\0';

		//check length
		int len = str.length();
		int bound = len/2;
		System.out.print("Given String Length : ");
		System.out.println(len);

		Map<Character, Integer> numChars = new HashMap<Character, Integer>(Math.min(len, 26));
		
		for(int i = 0; i < len; ++i){
			char charAt = str.charAt(i);
			
			if(!numChars.containsKey(charAt)){
				numChars.put(charAt, 1);
			}
			else{
				numChars.put(charAt, numChars.get(charAt) + 1);
			}
			
			//check if the number of appearance of char exceed the bound
			int checkChar = (int)numChars.get(charAt);
			if(checkChar>=bound){
				found = true;
				qualifiedChar = charAt;
				break;
			}

		}
		
		//check boolean found
		System.out.println("Output: " + qualifiedChar);
		

		
	}

}