import java.util.Scanner;
public class Bilet {
	private int nrAlese[] = new int[6];
	public Bilet() {
		
	}
	public Bilet(int nrAlese[]) {
		this.nrAlese = nrAlese;
	}
	public int[] getNrAlese() {
		return nrAlese;
	}
	public void alegeNumere() {
		System.out.println("Alege numerele:");
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<6;i++) {
			nrAlese[i] = scanner.nextInt();
		}
		scanner.close();
	}
}
