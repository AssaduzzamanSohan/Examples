package Day_4;

interface Hello {
	void show();
}

// Simple Inner class example
class OuterClass { // outer class
	static int outer_x = 10; // static member
	int outer_y = 20; // instance(non-static) member
	private int outer_private = 30; // private member

	class InnerClass { // inner class
		void display() {
			System.out.println("outer_x = " + outer_x); // can access static member of outer class
			System.out.println("outer_y = " + outer_y); // can also access non-static member of outer class
			System.out.println("outer_private = " + outer_private); // can also access private member of outer class
		}
	}
}

// Method Local inner classes example
class Outer {
	void outerMethod() {
		System.out.println("inside outerMethod");
		// Inner class is local to outerMethod()
		class Inner {
			void innerMethod() {
				System.out.println("inside innerMethod");
			}
		}
		Inner y = new Inner();
		y.innerMethod();
	}
}

// enum example
enum Names {
	Sohan, Aniruddha, Tushar, Sworna, Tanvir, kamrul, rafi, cute_viya, jatir_bon;

}
 enum Names_2 {
    Sohan("Is a cute Boy"),
    Tonmoy("Is a good Boy"),
    Aniruddo("Is a good Man"),
    Richin("Is one of the Best Poison"),
    Arsenic("Is one of the Best Deadly Poison"),
    Cyanide("kapaiya deya Poison"),
    Vector("Is the villain of Fantastic four movie"),
    Lol("Lot of Love"),
    UNKNOWN("");

    private String str;

	public String getStr() {
		return str;
	}

	private Names_2(String str) {
		this.str=str;
	}
}

public class Main {

	// An anonymous class that implements Hello interface
	static Hello h = new Hello() {
		public void show() {
			System.out.println("i am in anonymous class");
		}
	};

	public static void main(String[] args) {
		// Simple Inner class example
		// accessing an inner class
		OuterClass outerObject = new OuterClass();
		OuterClass.InnerClass innerObject = outerObject.new InnerClass();
		innerObject.display();

		// Method Local inner classes example
		Outer x = new Outer();
		x.outerMethod();

		// Anonymous inner classes example
		h.show();
		
		// enum example
		Names[] n = Names.values();
		for (Names name : n) {
			System.out.println(name);
		}
		Names_2[] nam = Names_2.values();
		for (Names_2 name : nam) {
			System.out.println(name+" "+name.getStr());
		}
		
	}
}
