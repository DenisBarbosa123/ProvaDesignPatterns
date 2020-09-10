package br.edu.univas.vo;

import java.util.ArrayList;
import java.util.List;

public class CompositePizza implements Ingrediente{

	private List<Ingrediente> ingredienteList;
	
	public CompositePizza() {
		ingredienteList = new ArrayList<>();
	}
	@Override
	public String description() {
		String description = "";
		for (Ingrediente ingrediente : ingredienteList) {
			description += ingrediente.description();
			description+=" ";
		}
		return description;
	}

	@Override
	public double price() {
		double price = 0;
		for (Ingrediente ingrediente : ingredienteList) {
			price += ingrediente.price();
		}
		return price;
	}
	
	public void addComponent(Ingrediente ingrediente) {
		ingredienteList.add(ingrediente);
	}
	
	public void removeComponent(Ingrediente ingrediente) {
		ingredienteList.remove(ingrediente);
	}

}
