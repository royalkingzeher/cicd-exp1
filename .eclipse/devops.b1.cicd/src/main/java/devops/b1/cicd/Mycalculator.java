package devops.b1.cicd;

public class Mycalculator {
    public int add(int a, int b) {
    	return a + b;
    }
    
    public int subtract(int a, int b) {
    	return a - b;
    }
	public static void main(String[] args) {
		Mycalculator Mycalc = new Mycalculator();
		System.out.println(Mycalc.add(10, 20));
		System.out.println(Mycalc.subtract(4, 2));
	}

}
