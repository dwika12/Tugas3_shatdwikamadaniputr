package shatdwikamadaniputri;

import java.util.ArrayList;

public class StackDouble {
	ArrayList<Double> kotak =new ArrayList<Double>();
	public int dwika = -1;
	
		public void push(Double value){
			dwika++;
			kotak.add(dwika,value);
		}
		
			public double pop() {
				double value=dwika;
			if (dwika>-1){				
				value = kotak.get(dwika);
				kotak.remove(dwika);
				dwika--;
			}
			return value;
			}
			public void cetak(){
				System.out.println(kotak.toString());
			}
}
