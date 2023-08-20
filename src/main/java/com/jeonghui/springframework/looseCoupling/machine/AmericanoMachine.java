package com.jeonghui.springframework.looseCoupling.machine;

import com.jeonghui.springframework.looseCoupling.material.DrinkMaterial;
import com.jeonghui.springframework.looseCoupling.product.Americano;
import com.jeonghui.springframework.looseCoupling.product.Product;

public class AmericanoMachine implements Machine {
	
	private DrinkMaterial material;

	public void setMaterial(DrinkMaterial material) {
		this.material = material;
	}
	
	private AmericanoMachine() {};
	public static AmericanoMachine americanoMachine;
	public static AmericanoMachine getInstance() {
		if (americanoMachine == null) americanoMachine = new AmericanoMachine();
		return americanoMachine;
	}

	@Override
	public Product makeDrink() {
		System.out.println(material.getIce() + "을 추가합니다.");
		System.out.println(material.getAddMaterial() + "을 추가합니다.");
		System.out.println(material.getCoffeeShot() + "을 추가합니다.");
		
		Americano americano = new Americano();
		americano.setMaterial(material);
		return americano;
	}
}
