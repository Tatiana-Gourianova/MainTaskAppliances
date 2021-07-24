package by.tc.task01.entity;

import java.io.Serializable;

import static by.tc.task01.entity.Appliance.ApplianceType.SPEAKERS;


public class Speakers extends Appliance implements Serializable {

    private int PowerConsumption;
    private int NumberOfSpeakers;
    private String FrequencyRange;
    private float CordLength;


    public Speakers(){
        super();

    }

    public Speakers(int powerConsumption, int numberOfSpeakers, String frequencyRange, float cordLength) {
        super();
        setPowerConsumption(powerConsumption);
        setNumberOfSpeakers(numberOfSpeakers);
        setFrequencyRange(frequencyRange);
        setCordLength(cordLength);


    }

    public void setPowerConsumption(int powerConsumption) {
        this.PowerConsumption = powerConsumption;
    }

    public int getPowerConsumption() {
        return this.PowerConsumption;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.NumberOfSpeakers = numberOfSpeakers;
    }

    public int getNumberOfSpeakers() {
        return this.NumberOfSpeakers;
    }

    public void setFrequencyRange(String frequencyRange) {
        this.FrequencyRange = frequencyRange;
    }

    public String  getFrequencyRange() {

        return this.FrequencyRange;
    }

    public void setCordLength(float cordLength) {

        this.CordLength = cordLength;
    }

    public float  getCordLength() {

        return this.CordLength;
    }


    @Override
    public String toString() {
        return "VacuumCleaner : " +
                "POWER_CONSUMPTION=" + PowerConsumption +
                ", NUMBER_OF_SPEAKERS=" + NumberOfSpeakers +
                ", FREQUENCY_RANGE=" + FrequencyRange +
                ", CORD_LENGTH=" + CordLength;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Speakers)) return false;
        Speakers speakers = (Speakers) o;
        return PowerConsumption == speakers.PowerConsumption &&
                Integer.compare(speakers.NumberOfSpeakers, NumberOfSpeakers) == 0 &&
                String.CASE_INSENSITIVE_ORDER.compare(speakers.FrequencyRange, FrequencyRange) == 0 &&
                Float.compare(speakers.CordLength, CordLength) == 0;

    }

}
