package pl.sdacademy;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class vat {
	public static void main(String[] args) {
		List<BigDecimal> kwota = new ArrayList<>();
		List<BigDecimal> vat = new ArrayList<>();

		double i = 0.0;
		BigDecimal k;
		while (true){
			i+=1.0;
			k = BigDecimal.valueOf(i);
			kwota.add(k);
			BigDecimal wynik = k.multiply(BigDecimal.valueOf(0.23)).setScale(2, BigDecimal.ROUND_HALF_UP);
			//v.setScale(2, BigDecimal.ROUND_HALF_UP);
			vat.add(wynik);


			//System.out.println(kwota.get(i - 1));
			//System.out.println(vat.get(i - 1));
		}
		/*
		for (int j = 0; j < kwota.size(); j++){

			System.out.println(kwota.get(j) + " " + vat.get(j));
		}
		*/
	}
}
