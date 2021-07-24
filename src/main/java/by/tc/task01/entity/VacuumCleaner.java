package by.tc.task01.entity;
import java.io.Serializable;

public class VacuumCleaner extends Appliance implements Serializable {

	private int PowerConsumption;
	private String FilterType;
	private String BagType;
	private String WandType;
	private int MotorSpeedRegulation;
	private int CleaningWidth;

	public VacuumCleaner() {
		super();
			}

	public VacuumCleaner(int powerConsumption, String filterType, String bagType, String wandType, int motorSpeedRegulation, int cleaningWidth) {
		super();
		setPowerConsumption(powerConsumption);
		setFilterType(filterType);
		setBagType(bagType);
		setWandType(wandType);
		setMotorSpeedRegulation(motorSpeedRegulation);
		setCleaningWidth(cleaningWidth);

	}

	public void setPowerConsumption(int powerConsumption) {
		this.PowerConsumption = powerConsumption;
	}

	public int getPowerConsumption() {
		return this.PowerConsumption;
	}

	public void setFilterType(String filterType) {
		this.FilterType = filterType;
	}

	public String getFilterType() {
		return this.FilterType;
	}

	public void setBagType(String bagType) {
		this.BagType = bagType;
	}

	public String getBagType() {

		return this.BagType;
	}

	public void setWandType(String wandType) {

		this.WandType = wandType;
	}

	public String getWandType() {

		return this.WandType;
	}

	public void setMotorSpeedRegulation(int motorSpeedRegulation) {
		this.MotorSpeedRegulation = motorSpeedRegulation;
	}

	public int getMotorSpeedRegulation() {
		return this.MotorSpeedRegulation;
	}


	public void setCleaningWidth(int cleaningWidth) {

		this.CleaningWidth = cleaningWidth;
	}

	public int getCleaningWidth() {

		return this.CleaningWidth;
	}

	@Override
	public String toString() {
		return "VacuumCleaner : " +
				"POWER_CONSUMPTION=" + PowerConsumption +
				", FILTER_TYPE=" + FilterType +
				", BAG_TYPE=" + BagType +
				", WAND_TYPE=" + WandType +
				", MOTOR_SPEED_REGULATION=" + MotorSpeedRegulation +
				", CLEANING_WIDTH=" + CleaningWidth;
	}


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof VacuumCleaner)) return false;
		VacuumCleaner vacuumCleaner = (VacuumCleaner) o;
		return PowerConsumption == vacuumCleaner.PowerConsumption &&
				String.CASE_INSENSITIVE_ORDER.compare(vacuumCleaner.FilterType, FilterType) == 0 &&
				String.CASE_INSENSITIVE_ORDER.compare(vacuumCleaner.BagType, BagType) == 0 &&
				String.CASE_INSENSITIVE_ORDER.compare(vacuumCleaner.WandType, WandType) == 0 &&
				MotorSpeedRegulation == vacuumCleaner.MotorSpeedRegulation &&
				Integer.compare(vacuumCleaner.CleaningWidth, CleaningWidth) == 0;

	}

}