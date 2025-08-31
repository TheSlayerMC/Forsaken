package net.forsaken.core.data.loot;

import net.forsaken.core.init.Forsaken;
import net.forsaken.core.init.internal.JEntities;
import net.forsaken.core.init.internal.JItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.loot.EntityLootSubProvider;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.EnchantedCountIncreaseFunction;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import org.jetbrains.annotations.NotNull;

import java.util.stream.Stream;

public class JEntityLootTables extends EntityLootSubProvider {

    protected JEntityLootTables(HolderLookup.Provider p) {
        super(FeatureFlags.REGISTRY.allFlags(), p);
    }

    @Override
    protected @NotNull Stream<EntityType<?>> getKnownEntityTypes() {
        return BuiltInRegistries.ENTITY_TYPE.stream()
                .filter(block -> BuiltInRegistries.ENTITY_TYPE.getKey(block)
                        .getNamespace()
                        .equals(Forsaken.MOD_ID));
    }

    @Override
    public void generate() {

    }

    private LootTable.Builder empty() {
        return LootTable.lootTable();
    }
}
