package br.uece.tabusearch;

public class ParametersConfig {

	public static final Integer NUMER_PERIODS = 4;

	public static final Integer NUMER_CLIENTS = 2;

	public static final Integer UNIT_PRODUCTION_COST = 0;

	public static final Integer UNIT_REMANUFACTURATION_COST = 0;

	public static final Integer NUMER_VEHICLES = 2;

	public static final Integer FIXED_PRODUCTION_COST = 0;

	public static final Integer FIXED_REMANUFACTURATION_COST = 0;

	public static final Integer[] READY_ITEM_STORAGE_COST = {0, 0, 0};

	public static final Integer USED_ITEM_STORAGE_COST = 0;

	public static final Integer[][] DEMANDS = {{1, 2}, {4, 5}, {1, 2}, {4, 6}};

	public static final Integer[] USED_ITEM_RETURNS = {0, 0, 0, 0};

	public static final Integer[][] ROUTING_COST = { {0, 1, 2}, {3, 0, 4}, {3, 5, 0}};

	public static final Integer VEHICLE_CAPACITY = 10;

	public static final Integer[] STORAGE_CAPACITY = {4, 5, 6};

	public static final Integer[] INITIAL_STORAGE_READY_ITEM = {0, 0, 0};
}
