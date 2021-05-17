package shammi.corejavaprograms;

public class FindLengthOfStringWithoutLenMethod {

	public static void main(String[] args) {
		String userInput = "hello brother";
		int i = 0;
		try {
			for(i = 0; ;i++) {
				userInput.charAt(i);
			}
		} catch (Exception e) {
			System.out.println("length of string is:: " + i);
		}
		
		int length = 0;
		for(char c: userInput.toCharArray()) {
			length++;
		}
		System.out.println("length of string is:: " + length);
	}
}
