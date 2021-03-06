package pl.mikigal.bytesectors.commons.packet;

import pl.mikigal.bytesectors.commons.serializable.LocationSerializable;
import pl.mikigal.bytesectors.commons.serializable.PotionEffectSerializable;

import java.util.UUID;

public class PacketPlayerTransfer extends Packet {

    private UUID uniqueId;
    private String inventory;
    private String armor;
    private String enderChest;
    private LocationSerializable location;
    private PotionEffectSerializable[] potionEffects;
    private int level;
    private int exp;
    private double health;
    private int foodLevel;
    private int fireTicks;
    private boolean fly;
    private boolean allowFlight;
    private String gameMode;
    private boolean inBoat;

    public PacketPlayerTransfer(UUID uniqueId, String inventory, String armor, String enderChest, LocationSerializable location, PotionEffectSerializable[] potionEffects, int level, int exp, double health, int foodLevel, int fireTicks, boolean fly, boolean allowFlight, String gameMode, boolean inBoat) {
        super();
        this.uniqueId = uniqueId;
        this.inventory = inventory;
        this.armor = armor;
        this.enderChest = enderChest;
        this.location = location;
        this.potionEffects = potionEffects;
        this.level = level;
        this.exp = exp;
        this.health = health;
        this.foodLevel = foodLevel;
        this.fireTicks = fireTicks;
        this.fly = fly;
        this.allowFlight = allowFlight;
        this.gameMode = gameMode;
        this.inBoat = inBoat;
    }


    public UUID getUniqueId() {
        return uniqueId;
    }

    public String getInventory() {
        return inventory;
    }

    public String getArmor() {
        return armor;
    }

    public String getEnderChest() {
        return enderChest;
    }

    public LocationSerializable getLocation() {
        return location;
    }

    public PotionEffectSerializable[] getPotionEffects() {
        return potionEffects;
    }

    public int getLevel() {
        return level;
    }

    public int getExp() {
        return exp;
    }

    public double getHealth() {
        return health;
    }

    public int getFoodLevel() {
        return foodLevel;
    }

    public int getFireTicks() {
        return fireTicks;
    }

    public boolean isFly() {
        return fly;
    }

    public boolean isAllowFlight() {
        return allowFlight;
    }

    public String getGameMode() {
        return gameMode;
    }

    public boolean isInBoat() {
        return inBoat;
    }
}
