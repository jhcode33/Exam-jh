package com.jeonghui.springframework.looseCoupling.machine;

import com.jeonghui.springframework.looseCoupling.material.DrinkMaterial;
import com.jeonghui.springframework.looseCoupling.product.Product;

public interface Machine {
	public Product makeDrink();
	public void setMaterial(DrinkMaterial material);
}
