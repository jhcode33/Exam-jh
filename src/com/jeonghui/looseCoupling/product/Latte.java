package com.jeonghui.looseCoupling.product;

import com.jeonghui.looseCoupling.material.DrinkMaterial;

public class Latte implements Product {
	
	private DrinkMaterial material;
	
	public void setMaterial(DrinkMaterial material) {
		this.material = material;
	}

	@Override
	public void serveProduct() {
		System.out.println(
				material.getIce() + "과 " +
				material.getCoffeeShot() + "과 " +
				material.getAddMaterial() + "을 추가한 "
			    + "라떼가 완성되었습니다.");
	}
}
