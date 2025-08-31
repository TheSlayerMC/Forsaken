package net.forsaken.common.items.base;

import net.forsaken.core.init.internal.JItems;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;

import java.util.function.Consumer;

public class JItem extends Item {

    public JItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext pContext, TooltipDisplay display, Consumer<Component> tooltip, TooltipFlag pTooltipFlag) {

    }

    public void addItemDesc(Item item, Consumer<Component> tooltip, String descLoc) {
        if(this == item) {
            tooltip.accept(Component.translatable(descLoc));
        }
    }
}
