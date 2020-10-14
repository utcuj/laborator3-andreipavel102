import java.util.Random;
public class Loterie {
	private int nrCastigatoare[] = new int[6];
	public int[] getNrCastigatoare() {
		return nrCastigatoare;
	}
	public void genereazaNr() {
		Random random = new Random();
		for(int i=0;i<6;i++) {
			nrCastigatoare[i] = random.nextInt(49)+1;
		}
	}
	public boolean verifica(int nrAlese[]) {
		for(int i=0;i<6;i++) {
			if(nrCastigatoare[i] != nrAlese[i])
				return false;
		}
		return true;
	}
}
