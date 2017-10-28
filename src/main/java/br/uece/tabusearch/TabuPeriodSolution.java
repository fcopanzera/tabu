package br.uece.tabusearch;

import java.util.List;
import java.util.ArrayList;

public class TabuPeriodSolution {
	
	private Integer production;

	private Integer remanufacturation;

	private List<Integer> readyItemsToStock = new ArrayList<>();

	private Integer usedItemsToStock;

	private List<Integer> itemsDelivered = new ArrayList<>();

	//TODO: definir matiz de traslado del vehiculo entre los clientes

	//TODO: definir array de carga del vehiculo previo a realizar cada entrega.


	public TabuPeriodSolution() {

	}

	public Integer getProduction() {
		return this.production;
	}

	public void setProduction(Integer production) {
		this.production = production;
	}

	public Integer getRemanufacturation() {
		return this.remanufacturation;
	}

	public void setRemanufacturation(Integer remanufacturation) {
		this.remanufacturation = remanufacturation;
	}

	public List<Integer> getReadyItemsToStock() {
		return this.readyItemsToStock;
	}

	public void setReadyItemsToStock(List<Integer> readyItemsToStock) {
		this.readyItemsToStock = readyItemsToStock;
	}

	public Integer getUsedItemsToStock() {
		return this.usedItemsToStock;
	}

	public void setUsedItemsToStock(Integer usedItemsToStock) {
		this.usedItemsToStock = usedItemsToStock;
	}

	public List<Integer> getItemsDelivered() {
		return this.itemsDelivered;
	}

	public void setItemsDelivered(List<Integer> itemsDelivered) {
		this.itemsDelivered = itemsDelivered;
	}
}
