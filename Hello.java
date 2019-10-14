
public class Hello {

	public static void main(String[] args) {
		printPowersOf4(3);
		printPowersOf5(6);
		
	}

	private static void printPowersOf4(int max) {
		for (int i = 0; i <= max; i ++){
			System.out.print((int)Math.pow(4,i)+ "");}
	}
	

	private static void printPowersOf5(int max) {
		for (int i = 0; i <= max; i ++){
			System.out.print((int)Math.pow(5,i)+ "");
		}
		System.out.println();
		// TODO Auto-generated method stub
		
	}

}

