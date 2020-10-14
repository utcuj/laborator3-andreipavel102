
public class Pb_4_3 {

	public static void main(String[] args) {
		String sir = "Ana are mere";
		int len = sir.length();
		int consoane = 0;
		int vocale = 0;
		sir = sir.toLowerCase();
		for(int i=0;i<len;i++) {
			char x = sir.charAt(i);
			if(x == 'a' || x =='e'||x == 'i'||x == 'o' || x == 'u')
				vocale++;
			else if(x != ' ')
				consoane++;
		}
		System.out.println("Numar vocale:" + vocale);
		System.out.println("Numar consoane:" + consoane);
		
	}
}
