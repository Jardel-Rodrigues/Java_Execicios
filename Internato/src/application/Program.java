package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Room;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented ? ");
		int N = sc.nextInt();
		
		Room [] Vect = new Room [10];
		
		for(int i=1; i<=N; i++) {
			System.out.println("Rent #" + i + ":");
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			System.out.println();
		    Vect[room] = new Room (name, email, room);
		}
		
		System.out.println("Busy rooms:");
		
		for(int i=0; i<Vect.length; i++) {
			if(Vect[i] != null) {
				System.out.println(i + ": " + Vect[i]);
			}
		}
		
sc.close();		
	}

}
