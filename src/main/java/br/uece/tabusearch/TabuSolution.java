package br.uece.tabusearch;

import java.util.List;
import java.util.ArrayList;

public class TabuSolution implements Solution {
	
	private Integer value;

	private List<TabuPeriodSolution>  periodSolutions = new ArrayList<>();

	public TabuSolution() {
		value = 0;
	}

	public Integer getValue() {
		this.calculateValue();
		return this.value;
	}

	private void calculateValue() {
		for (Integer period = 0; period < ParametersConfig.NUMBER_PERIODS; period ++) {
			value += ParametersConfig.UNIT_PRODUCTION_COST * this.periodSolutions.get(period).getProduction();
			value += ParametersConfig.UNIT_REMANUFACTURATION_COST * this.periodSolutions.get(period).getRemanufacturation();

			if (this.periodSolutions.get(period).getProduction() > 0) {
				value += ParametersConfig.FIXED_PRODUCTION_COST;
			}

			if (this.periodSolutions.get(period).getRemanufacturation() > 0) {
				value += ParametersConfig.FIXED_REMANUFACTURATION_COST;
			}

			for (Integer i = 0; i < this.periodSolutions.get(period).getReadyItemsToStock().size(); i++) {
				value += this.periodSolutions.get(period).getReadyItemsToStock().get(i)
						* ParametersConfig.READY_ITEM_STORAGE_COST[i];
			}

			value += this.periodSolutions.get(period).getUsedItemsToStock() * ParametersConfig.USED_ITEM_STORAGE_COST;

			//TODO: Calular los costos del ruteo
		}
	}

	public List<TabuPeriodSolution> getPeriodSolutions() {
		return this.periodSolutions;
	}

	public void setPeriodSolutions(List<TabuPeriodSolution> periodSolutions) {
		this.periodSolutions = periodSolutions;
	}

	public List<TabuSolution> getNeighbors() {
		return new ArrayList<TabuSolution>();
	}
}

