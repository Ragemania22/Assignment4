
public class MathEvalTest {

	public static void main(String[] args) {
		/*String text = "(3*4)+7/2)";
		System.out.println("Original text: " + text);
		System.out.println("Chkec if the said string is a mathematical expression or not: " + validate(text));*/
		
		String text = "(((8*8-2) + 9 - (12*5)) - 2 )";
		System.out.println("Original text: " + text);
		System.out.println("Chkec if the said string is a mathematical expression or not: " + validate(text));
		
	}
	
	public static boolean validate(String text) {
		return text.matches("((?:(?:^|[-+_*/])(?:\\\\s*-?\\\\d+(\\\\.\\\\d+)?(?:[eE][+-]?\\\\d+)?\\\\s*))+$)");
	}

}
