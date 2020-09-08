import java.util.Scanner;

public class menu {

	public void nhap(int a[], int n) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Moi nhap vao mang: ");
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();

	}

	public void xuat(int a[], int n) {
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
		System.out.println("");
	}

	public void tang(int a[], int n) {
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
	}

	public void giam(int a[], int n) {
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n - 1; j++) {
				if (a[j] < a[j + 1]) {
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
	}

	public int max2(int a[], int n) {
		
		giam(a,n);
		int max2= a[1];
		return max2;
	}

	public boolean check(int n) {
		if (n <= 1)
			return false;
		for (int i = 2; i <= Math.sqrt(n); i++)
			if (n % i == 0)
				return false;
		return true;
	}

	public static void main(String[] args) {
		menu me = new menu();
		int[] a;
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n: ");
		n = sc.nextInt();
		a = new int[n];
//		me.nhap(a, n);
		me.nhap(a, n);
		me.xuat(a, n);

		try (Scanner sca = new Scanner(System.in)) {
			System.out.println("Vui long chon phuong thuc");
			System.out.println("1: cong");
			System.out.println("2: tru");
			System.out.println("3: nhan");
			System.out.println("4: chia");
			System.out.println("5: tang");
			System.out.println("6: giam");
			System.out.println("7: so lon thu 2");
			System.out.println("8: so nguyen to");

			int b = sca.nextInt();

			switch (b) {
			case 1:
				int x, y;
				System.out.println("Nhập vào số thứ nhất: ");
				x = sc.nextInt();
				System.out.println("Nhập vào số thứ hai: ");
				y = sc.nextInt();
				System.out.println("cong:" + x + " + " + y + " = " + (x + y));
				break;
			case 2:
				System.out.println("Nhập vào số thứ nhất: ");
				x = sc.nextInt();
				System.out.println("Nhập vào số thứ hai: ");
				y = sc.nextInt();
				System.out.println("tru:" + x + " - " + y + " = " + (x - y));
				break;
			case 3:
				System.out.println("Nhập vào số thứ nhất: ");
				x = sc.nextInt();
				System.out.println("Nhập vào số thứ hai: ");
				y = sc.nextInt();
				System.out.println("tru:" + x + " * " + y + " = " + (x * y));
				break;
			case 4:
				System.out.println("Nhập vào số thứ nhất: ");
				x = sc.nextInt();
				System.out.println("Nhập vào số thứ hai: ");
				y = sc.nextInt();
				if (y == 0) {
					System.out.println("làm cax gì chia được ba");
				} else {
					System.out.println("chia :" + x + " / " + y + " = " + (float) x / y);
				}
				break;
			case 5:
				System.out.println("mang giam:");
				me.tang(a, n);
				me.xuat(a, n);
				break;
			case 6:
				System.out.println("mang giam:");
				me.giam(a, n);
				me.xuat(a, n);
				break;
			case 7:
				System.out.println("Max2: " + me.max2(a, n));
				break;
			case 8:
				System.out.print("Cac so nguyen to la: ");
				for (int i = 0; i < n; i++) {
					if (me.check(a[i]))
						System.out.print(a[i] + " ");
				}
				System.out.println("");
				break;
			default:
				System.out.println("cmm nhân");
				break;
			}
		}
	}
}
