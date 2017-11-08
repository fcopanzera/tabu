package br.uece.tabusearch;


public class InitialSolutionLocator {


	private Integer totalProduction;

	private Integer totalRemanufacturation;

	private Integer totalDemand;

	public InitialSolutionLocator() {

		totalRemanufacturation = 0;
		totalDemand = 0;

		for (Integer rem : ParametersConfig.USED_ITEM_RETURNS) {
			totalRemanufacturation += rem;
		}

		for (Integer[] demByPeriod : ParametersConfig.DEMANDS) {
			for (Integer demByClient : demByPeriod) {
				totalDemand += demByClient;
			}
		}

		totalProduction = totalDemand - totalRemanufacturation;
	}

	/**
	 *	TODO: Especificar las policys
	 *
	 */
	public TabuSolution getInitialSolution() {
		TabuSolution solution =  new TabuSolution();

		for (Integer period = 0; period < ParametersConfig.NUMBER_PERIODS; period ++) {
			TabuPeriodSolution tabuPeriodSolution = new TabuPeriodSolution();

			tabuPeriodSolution.setRemanufacturation(ParametersConfig.USED_ITEM_RETURNS[period]);

			tabuPeriodSolution.setUsedItemsToStock(0);

			Integer maximumDelivery = getMinimumValue(ParametersConfig.NUMBER_VEHICLES * ParametersConfig.VEHICLE_CAPACITY,
					this.getMaximumDeliveryByPeriod(solution, period));

			tabuPeriodSolution.setProduction(getMinimumValue(totalProduction, maximumDelivery));

			totalProduction -= tabuPeriodSolution.getProduction();

			solution.getPeriodSolutions().add(tabuPeriodSolution);
		}

		return solution;
	}

	private Integer getMaximumDeliveryByClient(TabuSolution solution, Integer client, Integer period) {

		Integer maximumStorage = ParametersConfig.STORAGE_CAPACITY[client] + ParametersConfig.DEMANDS[period][client];

		if (period == 0) {
			maximumStorage -= ParametersConfig.INITIAL_STORAGE_READY_ITEM[client];
		} else {
			maximumStorage -= solution.getPeriodSolutions().get(period - 1).getReadyItemsToStock().get(client);
		}

		Integer remainingDemand = 0;
		for (Integer periodToIterate = 0; periodToIterate < ParametersConfig.NUMBER_PERIODS; periodToIterate ++) {
			remainingDemand += ParametersConfig.DEMANDS[periodToIterate][client];
			if (periodToIterate < period) {
				remainingDemand -= solution.getPeriodSolutions().get(periodToIterate).getItemsDelivered().get(client);
			}
		}

		return getMinimumValue(maximumStorage,remainingDemand);
	}

	private Integer getMaximumDeliveryByPeriod(TabuSolution solution, Integer period) {
		Integer result = 0;

		for (Integer client = 0; client < ParametersConfig.NUMBER_CLIENTS; client ++) {
			result += getMaximumDeliveryByClient(solution, client, period);
		}

		return result;

	}

	private Integer getMinimumValue(Integer a, Integer b) {
		if (a < b) {
			return a;
		} else {
			return b;
		}
	}
}
