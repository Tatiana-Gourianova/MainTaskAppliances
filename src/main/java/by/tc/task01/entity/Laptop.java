package by.tc.task01.entity;


import java.io.Serializable;

public class Laptop extends Appliance implements Serializable {
    private int BatteryCapacity;
    private int OS ;
    private int MemoryRom ;
    private int SystemMemory;
    private float CPU;
    private int DisplayInchs;

    public Laptop() {super(); }
    public Laptop(int batteryCapacity, int os, int memoryRom, int systemMemory, float cpu, int displayInchs){
        super();

    setBatteryCapacity(batteryCapacity);
    setOS(os);
    setMemoryRom(memoryRom);
    setSystemMemory(systemMemory);
    setCPU(cpu);
    setDisplayInchs(displayInchs);
}

public void setBatteryCapacity(int batteryCapacity){ this.BatteryCapacity=batteryCapacity; }
public int getBatteryCapacity(){  return this.BatteryCapacity;}
public void setOS(int os){ this.OS=os;}
public int getOS(){ return this.OS;}
public void setMemoryRom(int memoryRom){this.MemoryRom=memoryRom;}
public int getMemoryRom(){ return this.MemoryRom;}
public void setSystemMemory(int systemMemory){ this.SystemMemory=systemMemory;}
public int getSystemMemory(){return this.SystemMemory;}
public void setCPU(float cpu){this.CPU=cpu;}
public float getCPU(){return this.CPU;}
public void setDisplayInchs(int displayInchs){this.DisplayInchs=displayInchs;}
public int getDisplayInchs(){return this.DisplayInchs;}


    @Override
    public String toString() {
        return "Laptop : " +
                "BATTERY_CAPACITY=" + BatteryCapacity +
                ", OS='" + OS + '\'' +
                ", MEMORY_ROM=" + MemoryRom +
                ", SYSTEM_MEMORY=" + SystemMemory +
                ", CPU=" + CPU +
                ", DISPLAY_INCHS=" + DisplayInchs;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laptop)) return false;
        Laptop laptop = (Laptop) o;
        return BatteryCapacity == laptop.BatteryCapacity &&
                Float.compare(laptop.OS, OS) == 0 &&
                Float.compare(laptop.MemoryRom, MemoryRom) == 0 &&
                Float.compare(laptop.SystemMemory, SystemMemory) == 0 &&
                Float.compare(laptop.CPU, CPU) == 0 &&
                Float.compare(laptop.DisplayInchs, DisplayInchs) == 0;
    }

}


