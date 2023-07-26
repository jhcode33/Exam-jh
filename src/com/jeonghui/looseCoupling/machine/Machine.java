package com.jeonghui.looseCoupling.machine;

import com.jeonghui.looseCoupling.material.DrinkMaterial;
import com.jeonghui.looseCoupling.product.Product;

public interface Machine {
	public Product makeDrink();
	public void setMaterial(DrinkMaterial material);
}
