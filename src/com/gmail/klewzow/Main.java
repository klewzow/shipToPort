package com.gmail.klewzow;

public class Main {

	public static void main(String[] args) {
		Port p = new Port();

		Ship a = new Ship("A");
		Ship b = new Ship("B");
		Ship c = new Ship("C");

		p.setShips(new Ship[] { a, b, c });
		p.setToDock();

	}

}
