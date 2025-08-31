package net.forsaken.core.data.loot;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.LootTableSubProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetComponentsFunction;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;

import java.util.function.BiConsumer;

public class JItemLoot implements LootTableSubProvider {

    protected JItemLoot(HolderLookup.Provider p) {
        super();
    }


    @Override
    public void generate(BiConsumer<ResourceKey<LootTable>, LootTable.Builder> consumer) {
//        consumer.accept(
//                BuiltInLootTables.EMPTY,
//                LootTable.lootTable()
//                        .withPool(
//                        LootPool.lootPool().setRolls(ConstantValue.exactly(1))
//                                .add(LootItem.lootTableItem(JItems.LORE_SCROLL.asItem())
//                                        .setWeight(1))
//                                .apply(SetComponentsFunction.setComponent(
//                                        JDataComponents.SCROLL.get(), new LoreScroll(ScrollEntries.BEYOND_BOILING.getId(), EnumKnowledge.BOIL.getName(), 10, false)))
//                )
//        );
    }
}
