
public class Pb_4_4 {

	public static void main(String[] args) {
		String str1 = "Mickey";
		String str2 = new String(" Mouse");
		String str3 = str1+str2;
		String str4 = "Mickey Mouse";
		System.out.println(str3);
		System.out.println(str1+str2);
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
	}

}
