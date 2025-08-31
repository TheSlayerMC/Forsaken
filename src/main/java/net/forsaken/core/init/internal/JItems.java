package net.forsaken.core.init.internal;

import net.forsaken.common.items.base.JItem;
import net.forsaken.core.init.Forsaken;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.FuelValues;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;

public class JItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Forsaken.MOD_ID);
    public static final DeferredRegister.Items BLOCK_ITEMS = DeferredRegister.createItems(Forsaken.MOD_ID);

    public static final ArrayList<String> itemName = new ArrayList<>();
    public static final ArrayList<String> toolName = new ArrayList<>();
    public static final ArrayList<String> modelName = new ArrayList<>();
    public static final ArrayList<String> recordName = new ArrayList<>();
    public static final ArrayList<String> recordDescName = new ArrayList<>();
    public static final ArrayList<String> spawnName = new ArrayList<>();
    public static final ArrayList<String> spawnLangName = new ArrayList<>();
    public static final ArrayList<String> bowName = new ArrayList<>();
    public static final ArrayList<String> bowLangName = new ArrayList<>();
    public static final ArrayList<String> shieldName = new ArrayList<>();
    public static final ArrayList<String> shieldLangName = new ArrayList<>();
    public static final ArrayList<String> gunName = new ArrayList<>();
    public static final ArrayList<String> gunLangName = new ArrayList<>();
    public static final ArrayList<String> hammerName = new ArrayList<>();
    public static final ArrayList<String> hammerLangName = new ArrayList<>();
    public static final ArrayList<String> langName = new ArrayList<>();
    public static final ArrayList<String> toolLangName = new ArrayList<>();
    public static final ArrayList<String> modelLangName = new ArrayList<>();
    public static final ArrayList<String> recordLangName = new ArrayList<>();
    public static final ArrayList<String> recordDescLangName = new ArrayList<>();
    public static final ArrayList<String> swordName = new ArrayList<>();
    public static final ArrayList<String> pickaxeName = new ArrayList<>();
    public static final ArrayList<String> axeName = new ArrayList<>();
    public static final ArrayList<String> shovelName = new ArrayList<>();
    public static final ArrayList<String> hoeName = new ArrayList<>();
    public static final ArrayList<String> piercerName = new ArrayList<>();

    public static final ArrayList<String> helmetName = new ArrayList<>();
    public static final ArrayList<String> chestplateName = new ArrayList<>();
    public static final ArrayList<String> leggingsName = new ArrayList<>();
    public static final ArrayList<String> bootsName = new ArrayList<>();



    private static DeferredItem<Item> registerNormalItem(String name, String translatedName) {
        return register(name, translatedName, JItem::new, ItemType.ITEM);
    }

    private static DeferredItem<Item> registerFuelItem(String name, String translatedName, int burnTime /* 200 ticks per item */) {
        return register(name, translatedName, (p) -> new JItem(p) {
            @Override
            public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType, FuelValues fuelValues) {
                return burnTime;
            }
        }, ItemType.ITEM);
    }

    private static DeferredItem<Item> registerNormalItem(String name, String translatedName, Function<Item.Properties, ? extends Item> item, ItemType type) {
        switch(type) {
            case HELMET -> helmetName.add(name);
            case CHESTPLATE -> chestplateName.add(name);
            case LEGGINGS -> leggingsName.add(name);
            case BOOTS -> bootsName.add(name);
        }
        return registerNormalItem(name, translatedName, item);
    }

    private static DeferredItem<Item> registerNormalItem(String name, String translatedName, Function<Item.Properties, ? extends Item> item) {
        return register(name, translatedName, item, ItemType.ITEM);
    }

    private static DeferredItem<Item> registerToolItem(String name, String translatedName, Function<Item.Properties, ? extends Item> tool, ItemType type) {
        switch(type) {
            case SWORD -> swordName.add(name);
            case PICKAXE -> pickaxeName.add(name);
            case AXE -> axeName.add(name);
            case SHOVEL -> shovelName.add(name);
            case HOE -> hoeName.add(name);
            case MULTITOOL -> {
                pickaxeName.add(name);
                axeName.add(name);
                shovelName.add(name);
                hoeName.add(name);
            }
            case PIERCER -> piercerName.add(name);
        }
        return registerToolItem(name, translatedName, tool);
    }

    private static DeferredItem<Item> registerToolItem(String name, String translatedName, Function<Item.Properties, ? extends Item> tool) {
        return register(name, translatedName, tool, ItemType.TOOL);
    }

    private static DeferredItem<Item> registerBowItem(String name, String translatedName, Function<Item.Properties, ? extends Item> bow) {
        return register(name, translatedName, bow, ItemType.BOW);
    }

    private static DeferredItem<Item> registerShieldItem(String name, String translatedName, Function<Item.Properties, ? extends Item> item) {
        return register(name, translatedName, item, ItemType.SHIELD);
    }

    private static DeferredItem<Item> register(String name, String translatedName) {
        return register(name, translatedName, JItem::new, ItemType.ITEM);
    }

    private static DeferredItem<Item> registerRecord(String name, String descTranslated, DeferredHolder<JukeboxSong, JukeboxSong> sound) {
        recordDescName.add("item.forsaken." + name + ".desc");
        recordDescLangName.add(descTranslated);
        return register(name, "Journey Record", (p) -> new JItem(p.stacksTo(1).jukeboxPlayable(Objects.requireNonNull(sound.getKey()))), ItemType.RECORD);
    }

    private static Function<Item.Properties, Item> createBlockItemWithCustomItemName(Block block) {
        return (b) -> new BlockItem(block, b.useItemDescriptionPrefix());
    }

    public static DeferredItem<Item> register(String name, String translatedName, Function<Item.Properties, ? extends Item> item, ItemType type) {
        if(type == ItemType.TOOL) {
            toolName.add(name);
            toolLangName.add(translatedName);
        }
        if(type == ItemType.GUN) {
            gunName.add(name);
            gunLangName.add(translatedName);
        }
        if(type == ItemType.HAMMER) {
            hammerName.add(name);
            hammerLangName.add(translatedName);
        }
        if(type == ItemType.ITEM) {
            itemName.add(name);
            langName.add(translatedName);
        }
        if(type == ItemType.RECORD) {
            recordName.add(name);
            recordLangName.add(translatedName);
        }
        if(type == ItemType.MODEL) {
            modelName.add(name);
            modelLangName.add(translatedName);
        }
        if(type == ItemType.SPAWN_EGG) {
            spawnName.add(name);
            spawnLangName.add(translatedName);
        }
        if(type == ItemType.BOW) {
            bowName.add(name);
            bowLangName.add(translatedName);
        }
        if(type == ItemType.SHIELD) {
            shieldName.add(name);
            shieldLangName.add(translatedName);
        }
        return register(name, item);
    }

    private static DeferredItem<Item> register(String name, Function<Item.Properties, ? extends Item> item) {
        return ITEMS.registerItem(name, item, itemProps(name));
    }

    public static void registerBlockItem(String name, Supplier<Item> item) {
        BLOCK_ITEMS.register(name, item);
    }

    public static Item.Properties itemProps(String name) {
        return new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Forsaken.rl(name)));
    }

    private static Item.Properties foodProps(String name, FoodProperties props) {
        return new Item.Properties().food(props).setId(ResourceKey.create(Registries.ITEM, Forsaken.rl(name)));
    }

    private static Item.Properties foodProps(String name, FoodProperties props, Consumable con) {
        return new Item.Properties().food(props, con).setId(ResourceKey.create(Registries.ITEM, Forsaken.rl(name)));
    }

    public enum ItemType {
        ITEM,
        RECORD,
        SPAWN_EGG,
        MODEL,
        TOOL,
        BOW,
        SHIELD,
        PIERCER,
        GUN,
        HAMMER,

        SWORD,
        PICKAXE,
        AXE,
        SHOVEL,
        HOE,
        MULTITOOL,

        HELMET,
        CHESTPLATE,
        LEGGINGS,
        BOOTS
    }
}