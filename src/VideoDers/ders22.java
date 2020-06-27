package VideoDers;

class hayvan{
	public void ses(){
		System.out.println("Hayvanýn çýkarttýðý ses");
	}
	
}

class kedi extends hayvan{
	public void ses(){
		System.out.println("Miyav");
	}	
}

class kopek extends kedi{
	public void ses(){
		System.out.println("Hav hav");
	}
}

class hses extends hayvan{
	public void hsesi(hayvan Hayvan){
		Hayvan.ses();
	}
	
}


public class ders22 {

	public static void main(String[] args) {
		hayvan h = new hayvan();
		h.ses();
		
		kedi k = new kedi();
		k.ses();
		
		kopek kop = new kopek();
		kop.ses();
		
		hses hs = new hses();
		hs.hsesi(k);
		hs.hsesi(kop);
		hs.hsesi(hs);
		

	}

}
