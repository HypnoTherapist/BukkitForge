package keepcalm.mods.bukkit.bukkitAPI.entity;

import keepcalm.mods.bukkit.bukkitAPI.BukkitServer;
import net.minecraft.entity.passive.EntityWaterMob;

import org.bukkit.entity.WaterMob;
//import org.bukkit.craftbukkit.BukkitServer;

public class BukkitWaterMob extends BukkitCreature implements WaterMob {

    public BukkitWaterMob(BukkitServer server, EntityWaterMob entity) {
        super(server, entity);
    }

    @Override
    public EntityWaterMob getHandle() {
        return (EntityWaterMob) entity;
    }

    @Override
    public String toString() {
        return "BukkitWaterMob";
    }
}
