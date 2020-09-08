đyhghgfhf

import java.util.*;

import common.Person;
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String name = "Do ly ha";
//		System.out.println("My name is: " + name);
////		int a = 7;
////		int b = 0;
////		System.out.println("My devide" + (a/b));
		
		Person ps = new Person("Ha");
		ps.setAge(25);
		ps.getAge();
		
//		try (Scanner sc = new Scanner(System.in)) {
//			System.out.println("Vui long cjon phuong thuc");
//			System.out.println("1: rut tien");
//			System.out.println("2: chuyen khoan");
//			System.out.println("3: kiem tra tai khoan");
//			
//			int a = sc.nextInt();
//			
//			if(a == 1) {
//				System.out.println("rut tien");
//			}else if( a == 2) {
//				System.out.println("Chuyen khoan: ");
//			}else {
//				System.out.println("Kiem tra tai khoan !");
//			}
//		}
		
//		try  (Scanner sc = new Scanner(System.in)) {
//			System.out.println("Vui long cjon phuong thuc");
//			System.out.println("1: rut tien");
//			System.out.println("2: chuyen khoan");
//			System.out.println("3: kiem tra tai khoan");
//			
//			int a = sc.nextInt();
//			
//			switch (a) {
//			case 1:
//				System.out.println("rut tien");
//				break;
//			case 2:
//				System.out.println("chuyen khoan");
//				break;
//			default:
//				System.out.println("Kiem tra tai khoan");
//				break;
//			}
//		}
//		Scanner sc = new Scanner(System.in);
//		int ha = sc.nextInt();
//		int nhan = sc.nextInt();
//		if(ha != nhan) {
//			System.out.println("cao thuong vcl");
//		}else {
//			System.out.println("bro");
//		}
		
		int i;
		
		for( i = 0; i < 10; i++) {
			System.out.println(i);
		}

		
		// common
		for( int k = 0; k < 10; k++) {
			System.out.println(i);
		}
		
		int y = 0;
		
		for( ; y < 10; y++) {
			System.out.println(i);
		}
	}

}
//
//JDK = Java development kit = Cong cu
//JRE = Java Runtime enviroment = Moi truong
//JVM = Java Vitural Machine = May ao