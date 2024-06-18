package test;

import java.util.Scanner;

public class DriveTest {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("R: 우회전, L: 좌회전, S: 직진");
		char ch = in.next().charAt(0);
		Drive drive = null;
		in.close();

		if(ch =='R' || ch =='r') {
			drive = new Right();
		}else if(ch == 'L' || ch == 'l') {
			drive = new Laft();
		}else if(ch =='S' || ch == 's') {
			drive = new Strate();
		}else {
			System.out.println("STOP");
			return;
		}
		drive.getNextCall();
	}

}
