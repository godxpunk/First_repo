
public class Boy_ {
	// There will always be a constructor. (Invisible riht now.)
	// Other types of constructors:
	//Overloaded constructors.
	
	public Boy_() {
		hobby="Football";
		age = 15;
		name = "Anand";
	}
	public Boy_(String boyname) {
		name = boyname;
	}
	String hobby;
	int age;
	String name;
	void bwl() {
		System.out.println(name +" with love");
	}
	void play() {
		System.out.println("I am playing "+ hobby);
	}
}
