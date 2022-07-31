package com.cg.shop.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class IceCream {
	
	@Id
	private int flavourCode;
	private String flavour;
	private String toppings;
	private double cost;
	
	public IceCream() {
		super();
	}

	public IceCream(int flavourCode, String flavour, String toppings, double cost) {
		super();
		this.flavourCode = flavourCode;
		this.flavour = flavour;
		this.toppings = toppings;
		this.cost = cost;
	}

	public int getFlavourCode() {
		return flavourCode;
	}

	public void setFlavourCode(int flavourCode) {
		this.flavourCode = flavourCode;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public String getToppings() {
		return toppings;
	}

	public void setToppings(String toppings) {
		this.toppings = toppings;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "IceCream [flavourCode=" + flavourCode + ", flavour=" + flavour + ", toppings=" + toppings + ", cost="
				+ cost + "]";
	}

}
