public class QueueFloat {

	ArrayList<Float> informatika = new ArrayList<Float>();
	int dwika = -1;

	public void insert(Float value) {
		dwika++;
		informatika.add(dwika,value);
	}
	public Float get() {
		Float value = 0.1f;
		if(dwika>-1) {
			value = informatika.get(0);
			informatika.remove(0);
			dwika--;
		}
		return value;
		
	}
	public void cetak() {
		System.out.println("Step : "+dwika+" > VARIABLE: "+informatika.toString());
	}
}
