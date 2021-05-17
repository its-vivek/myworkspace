package shammi.corejavaprograms;

public class Sample {

	public static void main(String[] args) {
		String a = "abc";
		String b = " abc";
		String c = new String("abc");
		if(a==c) {
			System.out.println("equal " + a + " " + c);
		}
		else {
			System.out.println("not equal:" + a + "*" +c+"*"+b);
		}
	}
}
