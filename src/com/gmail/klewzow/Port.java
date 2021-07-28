package com.gmail.klewzow;

import java.util.Arrays;

public class Port implements Runnable {
	private Ship[] ships;
	private Dock[] dock = new Dock[] { new Dock("  One "), new Dock("  Two") };

	public Port() {
		super();
	}

	void setToDock() {
		new Thread(this).start();
	}

	public Ship[] getShips() {
		return ships;
	}

	public void setShips(Ship[] ships) {
		this.ships = ships;
	}

	@Override
	public String toString() {
		return "Port [ships=" + Arrays.toString(ships) + ", dock=" + Arrays.toString(dock) + "]";
	}

	@Override
	public void run() {
		for (int i = 0; i != ships.length;) {
			dock[0].standInLine(ships[i]);
			i += 1;
			if (i == ships.length) {
				break;
			}
			dock[1].standInLine(ships[i]);
			i += 1;
			if (i == ships.length) {
				break;
			}
		}

	}

}
