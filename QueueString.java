package shatdwikamadaniputri;

import java.util.ArrayList;

public class QueueString {

	ArrayList<String> informatika = new ArrayList<String>();
	int dwika = -1;

	public void insert(String value) {
		dwika++;
		informatika.add(dwika,value);
	}
	public String get() {
		String value = "kosongsaja";
		if(dwika>-1) {
			value = informatika.get(0);
			informatika.remove(0);
			dwika--;
		}
		return value;
		
	}
	public void cetak() {
		System.out.println("STEP : "+dwika+" > KELAS E: "+informatika.toString());
	}
}
