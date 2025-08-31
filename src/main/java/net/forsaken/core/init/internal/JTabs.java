package net.forsaken.core.init.internal;

import net.forsaken.core.init.Forsaken;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class JTabs {
    public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Forsaken.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> FORSAKEN = REGISTRY.register("forsaken", () -> CreativeModeTab.builder().title(Component.translatable("itemGroup.forsaken.tab")).icon(() -> new ItemStack(Items.BEEF)).build());

    public static void registerTabs(BuildCreativeModeTabContentsEvent event){
        if(event.getTab() == FORSAKEN.get()) {
            for(DeferredHolder<Item, ? extends Item> item : JItems.ITEMS.getEntries()){
                event.accept(item.get());
            }
            for(DeferredHolder<Block, ? extends Block> block : JBlocks.BLOCKS.getEntries()){
                event.accept(block.get());
            }
        };
    }
}
