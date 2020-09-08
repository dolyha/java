
public class Constructor {
	int x;
	int y;
	int z;
	public Constructor() {
		x = 10; // initial value x = 10
	}
	
	public Constructor(int  y, int z) {
		y = 10;
		z = 100;
	}
	
	public static void main(String agrs[]) {
		Constructor x = new Constructor();
	}
}
