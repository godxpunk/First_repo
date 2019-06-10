
public class test_class {
	public static void main(String args[]) {
		
		Boy_ boy1 = new Boy_();
		boy1.hobby = "Cricket";
		boy1.bwl();
		boy1.play();
		
		Boy_ boy2 = new Boy_();
		boy2.play();
		boy2.hobby = "Studying";
		boy2.play();
		String t="Aditya";
		Boy_ boy3 = new Boy_(t);
		boy3.play();
		boy3.bwl();
		//By default objects get stored in heap memory.
	}

}
