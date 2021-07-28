package com.gmail.klewzow;

public class Dock implements Runnable {
	private String name;
	private Ship ship;
	private boolean isBusy;

	public Dock(String name) {
		super();
		this.name = name;
		this.isBusy = false;
	}

	public synchronized void standInLine(Ship ship) {

		while (isBusy()) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		setBusy(true);
		this.setShip(ship);
		new Thread(this).start();
	}

	public synchronized void unload() {

		while (this.ship.getCargo() > 0) {
			this.ship.setCargo((this.ship.getCargo() - 1));
			System.out.println(ship.toString() + " Dock name - " + this.getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
		setBusy(false);
		notifyAll();
	}

	public boolean isBusy() {
		return isBusy;
	}

	public void setBusy(boolean isBusy) {
		this.isBusy = isBusy;
	}

	public Ship getShip() {
		return ship;
	}

	public void setShip(Ship ship) {
		this.ship = ship;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		unload();
	}

}
