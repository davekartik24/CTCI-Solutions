

public class StringRotationWithSubString{

	public boolean isRotation(String first, String second) {

		if(first == null || second == null || first.length() != second.length()) return false;

		StringBuilder sb = new StringBuilder(second.length() * 2);
		sb.append(second);
		sb.append(second);

		return sb.indexOf(first) >= 0;
	}

	public static void main(String[] args) {

		StringRotationWithSubString testInstance = new StringRotationWithSubString();

		System.out.println(testInstance.isRotation("waterbottle", "erbottlewat"));
	}
}