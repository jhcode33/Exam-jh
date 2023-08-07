package com.jeonghui.looseCoupling.barista;

import com.jeonghui.looseCoupling.machine.Machine;
import com.jeonghui.looseCoupling.material.DrinkMaterial;

public interface Barista {
	public void makeDrink();
	public void setMachine(Machine machine);
	public void setDrinkMaterial(DrinkMaterial material);
}
