package by.tc.task01.entity;

import java.io.Serializable;

public class TabletPC extends Appliance implements Serializable {
    private int BatteryCapacity;
    private int DisplayInchs;
    private int MemoryRom ;
    private int FlashMemoryCapacity;
    private String Color;


    public TabletPC() {     super();    }


    public TabletPC(int batteryCapacity, int displayInchs,  int memoryRom, int flashMemoryCapacity, String color){
        super();
        setBatteryCapacity(batteryCapacity);
        setDisplayInchs(displayInchs);
        setMemoryRom(memoryRom);
        setFlashMemoryCapacity(flashMemoryCapacity);
        setColor(color);

    }


    public void setBatteryCapacity(int batteryCapacity){ this.BatteryCapacity=batteryCapacity; }
    public int getBatteryCapacity(){  return this.BatteryCapacity;}
    public void setDisplayInchs(int displayInchs){this.DisplayInchs=displayInchs;}
    public int getDisplayInchs(){return this.DisplayInchs;}
    public void setMemoryRom(int memoryRom){this.MemoryRom=memoryRom;}
    public int getMemoryRom(){ return this.MemoryRom;}
    public void setFlashMemoryCapacity(int flashMemoryCapacity){ this.FlashMemoryCapacity=flashMemoryCapacity;}
    public int getFlashMemoryCapacity(){return this.FlashMemoryCapacity;}
    public void setColor(String color){this.Color=color;}
    public String getColor(){return this.Color;}


    @Override
    public String toString() {
        return "TabletPC : " +
                "BATTERY_CAPACITY=" + BatteryCapacity +
                ", DISPLAY_INCHS=" + DisplayInchs+
                ", MEMORY_ROM=" + MemoryRom +
                ", FLASH_MEMORY_CAPACITY=" + FlashMemoryCapacity +
                ", COLOR=" + Color;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TabletPC)) return false;
        TabletPC tabletPC = (TabletPC) o;
        return BatteryCapacity == tabletPC.BatteryCapacity &&
                Integer.compare(tabletPC.DisplayInchs, DisplayInchs) == 0 &&
                Integer.compare(tabletPC.MemoryRom, MemoryRom) == 0 &&
                Integer.compare(tabletPC.FlashMemoryCapacity, FlashMemoryCapacity) == 0 &&
                String.CASE_INSENSITIVE_ORDER.compare(tabletPC.Color, Color) == 0;
    }




}
