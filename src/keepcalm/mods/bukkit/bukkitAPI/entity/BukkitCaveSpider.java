package keepcalm.mods.bukkit.bukkitAPI.entity;

import keepcalm.mods.bukkit.bukkitAPI.BukkitServer;
import net.minecraft.entity.monster.EntityCaveSpider;

import org.bukkit.entity.CaveSpider;
import org.bukkit.entity.EntityType;
//import org.bukkit.craftbukkit.CraftServer;

public class BukkitCaveSpider extends BukkitSpider implements CaveSpider {
    public BukkitCaveSpider(BukkitServer server, EntityCaveSpider entity) {
        super(server, entity);
    }

    @Override
    public EntityCaveSpider getHandle() {
        return (EntityCaveSpider) entity;
    }

    @Override
    public String toString() {
        return "BukkitCaveSpider";
    }

    public EntityType getType() {
        return EntityType.CAVE_SPIDER;
    }
}
