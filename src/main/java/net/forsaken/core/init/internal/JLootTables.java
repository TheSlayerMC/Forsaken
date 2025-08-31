package net.forsaken.core.init.internal;

import net.forsaken.core.init.Forsaken;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootTable;

public class JLootTables {

    public static ResourceKey<LootTable> addLootTable(String name) {
        return ResourceKey.create(Registries.LOOT_TABLE, Forsaken.rl(name));
    }

    public static ResourceKey<LootTable> addVanillaLootTable(String name) {
        return ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.withDefaultNamespace(name));
    }

    public static ResourceKey<LootTable> addRuinTable(String name) {
        return ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse(name));
    }

    public static ResourceKey<LootTable> addBossCrystalLootTable(String name) {
        return ResourceKey.create(Registries.LOOT_TABLE, Forsaken.rl("boss_crystal/" + name));
    }

}