package com.jeonghui.looseCoupling.barista;

import com.jeonghui.looseCoupling.machine.Machine;
import com.jeonghui.looseCoupling.material.DrinkMaterial;
import com.jeonghui.looseCoupling.product.Product;

public class AmericanoBarista implements Barista {

	private Machine machine;
	private DrinkMaterial material;
	
	@Override
	public void setMachine(Machine machine) {
		this.machine = machine;
	}
	
	@Override
	public void setDrinkMaterial(DrinkMaterial material) {
		this.material = material;
	}
	
	@Override
	public void makeDrink() {
		System.out.println("아메리카노를 제조를 시작합니다.");
		machine.setMaterial(material);
		
		Product product = machine.makeDrink();
		product.serveProduct();
	}
}
