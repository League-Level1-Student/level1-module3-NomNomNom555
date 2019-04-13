package backpack;

public class BackpackRunner {
	public static void main(String[] args) {
		Backpack mine = new Backpack();
		Pencil p = new Pencil();
		String masterpiece = "Orion: The past, present, and future";
		p.write(masterpiece);
		Ruler r = new Ruler();
		r.measure();
		Textbook t = new Textbook();
		t.read();
		mine.putInBackpack(p);
		mine.putInBackpack(r);
		mine.putInBackpack(t);
		mine.packAndCheck();
		//mine.goToSchool();
		
	}
}
