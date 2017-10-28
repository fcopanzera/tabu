package br.uece.tabusearch;

import java.util.List;
import java.util.ArrayList;

public TabuPeriodSolution {
	
	private Double production;

	private Double remanufacturation;

	private List<Integer> readyItemsToStock = new ArrayList<>();

	private Double usedItemsToStock;

	private List<Integer> itemsDelivered = new ArrayList<>();

	//TODO: definir matiz de traslado del vehiculo entre los clientes

	//TODO: definir array de carga del vehiculo previo a realizar cada entrega.


	public TabuPeriodSolution() {

	}

	public Double getProduction() {
		return this.production;
	}

	public void setProduction(Double production) {
		this.production = production;
	}

	public Double getRemanufacturation() {
		return this.remanufacturation;
	}

	public void setRemanufacturation(Double remanufacturation) {
		this.remanufacturation = remanufacturation;
	}

	public List<Integer> getReadyItemsToStock() {
		return this.readyItemsToStock;
	}

	public void setReadyItemsToStock(List<Integer> readyItemsToStock) {
		this.readyItemsToStock = readyItemsToStock;
	}

	public Double getUsedItemsToStock() {
		return this.usedItemsToStock;
	}

	public void setUsedItemsToStock(Double usedItemsToStock) {
		this.usedItemsToStock = usedItemsToStock;
	}

	public List<Integer> getItemsDelivered() {
		return this.itemsDelivered;
	}

	public void setItemsDelivered(List<Integer> itemsDelivered) {
		this.itemsDelivered = itemsDelivered;
	}
}
