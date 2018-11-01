package shatdwikamadaniputri;

import java.util.ArrayList;

public class StackString {

	ArrayList<String>kotak = new ArrayList<String>();
	int dwika = -1;
	
	public void push(String value){
		dwika++;
		kotak.add(dwika,value);
	}
	public String pop(){
		String value = "KOSONG";
		if (dwika>-1){
		value = kotak.get(dwika);
		kotak.remove(dwika);
		dwika--;}
		return value;
		}
	
	public void cetak (){
		System.out.println("dwika : " +dwika+ " # namanya : "+kotak.toString());
	}
}
