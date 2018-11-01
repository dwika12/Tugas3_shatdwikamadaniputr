package shatdwikamadaniputri;
import java.util.ArrayList;
public class ArrayListObject<Mahasiswa> {
ArrayList<Mahasiswa> biodata;
	
public ArrayListObject(){
	biodata = new ArrayList<Mahasiswa>();
}
public void IsiData(String nama, String nim, char kelas, String alamat){
	biodata.add((Mahasiswa) new String ());
}

public static void main(String[] args) {
	ArrayList Data = new ArrayList();
	
	Data.add("shatdwika");
	Data.add("D0217307");
	Data.add("A");
	Data.add("somba");
	
	System.out.println(Data);
}
	
}
