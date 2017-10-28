package br.uece.tabusearch;

import java.util.List;
import java.util.ArrayList;

public TabuSolution implements Solution {
	
	private Double value;

	private List<TabuPeriodSolution>  periodSolutions = new ArrayList<>();

	public TabuSolution() {

	}

	/**
	 * Get the value of this solution.<br>
	 * Is the same value returned by the {@link Solution} objective function
	 * @return the value of this solution
	 */
	public Double getValue() {
		return this.value;
	}
	
	public void setValue(Double value) {
		this.value = value;
	}

	public List<TabuPeriodSolution> getPeriodSolutions() {
		return this.periodSolutions;
	}

	public void setPeriodSolutions(List<TabuPeriodSolution> periodSolutions) {
		this.periodSolutions = periodSolutions;
	}

	public List<Solution> getNeighbors() {
		return new ArrayList<TabuSolution>();
	}
}

