import java.math.BigDecimal;
import java.math.RoundingMode;
public class Pb_4_5 {

	public static void main(String[] args) {
		//a
		BigDecimal a = new BigDecimal(720);
		BigDecimal b = new BigDecimal(1);
		for(int i=44;i<=49;i++) {
			b = b.multiply(BigDecimal.valueOf(i));
		}
		BigDecimal sanse = a.divide(b, 16, RoundingMode.CEILING);
		System.out.println(sanse);
		//b
		
		Loterie loterie = new Loterie();
		loterie.genereazaNr();
		Bilet bilet = new Bilet();
		bilet.alegeNumere();
		if(loterie.verifica(bilet.getNrAlese()))
			System.out.print("Bilet castigator");
		else
			System.out.print("Bilet necastigator");
	}

}
