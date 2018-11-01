package shatdwikamadaniputri;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class StackFloat {

	ArrayList<Float> kotak =new ArrayList<Float>();
	public int dwika = -1;
	
	public void push(float value){
		dwika++;
		kotak.add(dwika,value);
	}
	public float pop(){
		float value = dwika;
		if (dwika>-1){
			value = kotak.get(dwika);
			kotak.remove(dwika);
			dwika--;
		}
		return value;}
		public void cetak(){
	System.out.println(kotak.toString());
		}
}
