package br.edu.univas.vo;

public class Cheese implements Ingrediente{
	@Override
	public String description() {
		return "Queijo";
	}
	@Override
	public double price() {
		return 2.5;
	}

}
