
public class StringLogic {

	String stringInput;

	StringLogic(String stringInput) {
		this.stringInput = stringInput;
	}

	public String reverseString() {
		if (stringInput.trim().isEmpty()) {
			return stringInput;
		}
		StringBuilder reverse = new StringBuilder();
		String[] sa = stringInput.trim().split("\\s");
		for (int i = sa.length - 1; i >= 0; i--) {
			reverse.append(sa[i]);
			reverse.append(' ');
		}
		return reverse.toString().trim();
	}

}
