package net.forsaken.core.init.internal;

import net.forsaken.core.init.Forsaken;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.EnchantmentTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;

public class JTags {

    public static final TagKey<Item> EMPTY = tagItem("empty");


    private static TagKey<Item> tagItem(String name) {
        return ItemTags.create(Forsaken.rl(name));
    }

    private static TagKey<Enchantment> tagEnchantment(String name) {
        return TagKey.create(Registries.ENCHANTMENT, Forsaken.rl(name));
    }

    private static TagKey<Block> tagBlock(String name) {
        return BlockTags.create(Forsaken.rl(name));
    }

    private static TagKey<Biome> tagBiome(String name) {
        return TagKey.create(Registries.BIOME, Forsaken.rl("has_structure/" + name));
    }
}
