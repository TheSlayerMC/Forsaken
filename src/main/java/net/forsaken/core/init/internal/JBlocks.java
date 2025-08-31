package net.forsaken.core.init.internal;

import net.forsaken.common.block.base.*;
import net.forsaken.common.world.dimension.Dimensions;
import net.forsaken.core.data.block_generation.JBlockCropGenerator;
import net.forsaken.core.data.block_generation.JBlockModeledCropGenerator;
import net.forsaken.core.init.Forsaken;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.FuelValues;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Supplier;

public class JBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Forsaken.MOD_ID);

    public static final ArrayList<String> modelBlockName = new ArrayList<>();
    public static final ArrayList<String> modelLangName = new ArrayList<>();
    public static final ArrayList<String> rotatableBlockName = new ArrayList<>();
    public static final ArrayList<String> rotatableLangName = new ArrayList<>();
    public static final ArrayList<String> furnaceBlockName = new ArrayList<>();
    public static final ArrayList<String> furnaceLangName = new ArrayList<>();
    public static final ArrayList<String> normalBlockName = new ArrayList<>();
    public static final ArrayList<String> normalLangName = new ArrayList<>();
    public static final ArrayList<String> tintedLeavesBlockName = new ArrayList<>();
    public static final ArrayList<String> tintedLeavesLangName = new ArrayList<>();
    public static final ArrayList<String> logBlockName = new ArrayList<>();
    public static final ArrayList<String> logLangName = new ArrayList<>();
    public static final ArrayList<String> doorBlockName = new ArrayList<>();
    public static final ArrayList<String> doorLangName = new ArrayList<>();
    public static final ArrayList<String> trapDoorBlockName = new ArrayList<>();
    public static final ArrayList<String> trapDoorLangName = new ArrayList<>();
    public static final ArrayList<String> stairsBlockName = new ArrayList<>();
    public static final ArrayList<String> stairsLangName = new ArrayList<>();
    public static final ArrayList<String> slabBlockName = new ArrayList<>();
    public static final ArrayList<String> slabLangName = new ArrayList<>();
    public static final ArrayList<String> buttonBlockName = new ArrayList<>();
    public static final ArrayList<String> buttonLangName = new ArrayList<>();
    public static final ArrayList<String> pressurePlateBlockName = new ArrayList<>();
    public static final ArrayList<String> pressurePlateLangName = new ArrayList<>();
    public static final ArrayList<String> gateBlockName = new ArrayList<>();
    public static final ArrayList<String> gateLangName = new ArrayList<>();
    public static final ArrayList<String> fenceBlockName = new ArrayList<>();
    public static final ArrayList<String> fenceLangName = new ArrayList<>();
    public static final ArrayList<String> wallBlockName = new ArrayList<>();
    public static final ArrayList<String> wallLangName = new ArrayList<>();
    public static final ArrayList<String> paneBlockName = new ArrayList<>();
    public static final ArrayList<String> paneLangName = new ArrayList<>();
    public static final ArrayList<String> crossBlockName = new ArrayList<>();
    public static final ArrayList<String> crossLangName = new ArrayList<>();
    public static final ArrayList<String> tintedCrossBlockName = new ArrayList<>();
    public static final ArrayList<String> tintedCrossLangName = new ArrayList<>();
    public static final ArrayList<String> vineBlockName = new ArrayList<>();
    public static final ArrayList<String> vineLangName = new ArrayList<>();
    public static final ArrayList<String> attachedCrossBlockName = new ArrayList<>();
    public static final ArrayList<String> attachedCrossLangName = new ArrayList<>();
    public static final ArrayList<String> doublePlantBlockName = new ArrayList<>();
    public static final ArrayList<String> doublePlantLangName = new ArrayList<>();
    public static final ArrayList<String> lilyPadBlockName = new ArrayList<>();
    public static final ArrayList<String> lilyPadLangName = new ArrayList<>();
    public static final ArrayList<String> grassBlockName = new ArrayList<>();
    public static final ArrayList<String> grassLangName = new ArrayList<>();
    public static final ArrayList<String> terrainBlockName = new ArrayList<>();
    public static final ArrayList<String> terrainLangName = new ArrayList<>();
    public static final ArrayList<String> randomBlockName = new ArrayList<>();
    public static final ArrayList<String> randomLangName = new ArrayList<>();
    public static final ArrayList<String> ladderBlockName = new ArrayList<>();
    public static final ArrayList<String> ladderLangName = new ArrayList<>();
    public static final ArrayList<String> overlayGrassBlockName = new ArrayList<>();
    public static final ArrayList<String> overlayGrassLangName = new ArrayList<>();
    public static final ArrayList<String> portalBlockName = new ArrayList<>();
    public static final ArrayList<String> portalLangName = new ArrayList<>();
    public static final ArrayList<String> chestBlockName = new ArrayList<>();
    public static final ArrayList<String> chestLangName = new ArrayList<>();
    public static final ArrayList<String> campfireBlockName = new ArrayList<>();
    public static final ArrayList<String> campfireLangName = new ArrayList<>();
    public static final ArrayList<String> pathBlockName = new ArrayList<>();
    public static final ArrayList<String> pathLangName = new ArrayList<>();
    public static final ArrayList<String> cropBlockName = new ArrayList<>();
    public static final ArrayList<String> cropLangName = new ArrayList<>();
    public static final ArrayList<String> bushBlockName = new ArrayList<>();
    public static final ArrayList<String> bushLangName = new ArrayList<>();
    public static final ArrayList<String> farmlandBlockName = new ArrayList<>();
    public static final ArrayList<String> farmlandLangName = new ArrayList<>();
    public static final ArrayList<String> basePortalBlockName = new ArrayList<>();
    public static final ArrayList<String> basePortalLangName = new ArrayList<>();
    public static final ArrayList<String> basePortalFrameBlockName = new ArrayList<>();
    public static final ArrayList<String> basePortalFrameLangName = new ArrayList<>();
    public static final ArrayList<String> mushroomBlockName = new ArrayList<>();
    public static final ArrayList<String> mushroomLangName = new ArrayList<>();
    public static final ArrayList<String> topBottomBlockName = new ArrayList<>();
    public static final ArrayList<String> topBottomLangName = new ArrayList<>();
    public static final ArrayList<String> slimeBlockName = new ArrayList<>();
    public static final ArrayList<String> slimeLangName = new ArrayList<>();
    public static final ArrayList<String> trophyBlockName = new ArrayList<>();
    public static final ArrayList<String> trophyLangName = new ArrayList<>();
    public static final ArrayList<String> totemBlockName = new ArrayList<>();
    public static final ArrayList<String> totemLangName = new ArrayList<>();
    public static final ArrayList<String> dripstoneBlockName = new ArrayList<>();
    public static final ArrayList<String> dripstoneLangName = new ArrayList<>();

    public static final ArrayList<String> PICKAXE_BLOCKS = new ArrayList<>();
    public static final ArrayList<String> AXE_BLOCKS = new ArrayList<>();
    public static final ArrayList<String> SHOVEL_BLOCKS = new ArrayList<>();
    public static final ArrayList<String> HOE_BLOCKS = new ArrayList<>();




    private static void checkForPickaxeableBlocks(BlockBehaviour.Properties props, String name) {
        if(props == JBlockProperties.STONE || props == JBlockProperties.GLOW_BLOCK || props == JBlockProperties.BREAKABLE_DUNGEON_LAMP || props == JBlockProperties.CRYSTAL
                || props == JBlockProperties.FIRE_STONE || props == JBlockProperties.FURNACE || props == JBlockProperties.ICE
                || props == JBlockProperties.VOLCANIC_BLOCK || props == JBlockProperties.SPAWNER || props == JBlockProperties.ROCKITE_SPAWNER || props == JBlockProperties.GRINDSTONE
                || props == JBlockProperties.GLASS || props == JBlockProperties.DUNGEON_BLOCK || props == JBlockProperties.CHEST
                || props == JBlockProperties.DUNGEON_LAMP || props == JBlockProperties.CLOUD) {
            addPickaxeableBlocks(name);
        }
    }

    private static void checkForAxeableBlocks(BlockBehaviour.Properties props, String name) {
        if(props == JBlockProperties.WOOD || props == JBlockProperties.CLOUD || props == JBlockProperties.VINE || props == JBlockProperties.CACTUS || props == JBlockProperties.LADDER || props == JBlockProperties.CAMPFIRE || props == JBlockProperties.BUTTON || props == JBlockProperties.DOOR || props == JBlockProperties.MUSHROOM_BLOCK) {
            addAxeableBlocks(name);
        }
    }

    private static void checkForShovelableBlocks(BlockBehaviour.Properties props, String name) {
        if(props == JBlockProperties.SAND || props == JBlockProperties.FIRE_SAND || props == JBlockProperties.PATH || props == JBlockProperties.DIRT || props == JBlockProperties.GRASS || props == JBlockProperties.FARMLAND || props == JBlockProperties.FIRE_DIRT) {
            addShovelableBlocks(name);
        }
    }

    private static void checkForHoeableBlocks(BlockBehaviour.Properties props, String name) {
        if(props == JBlockProperties.LEAVES || props == JBlockProperties.LUMINESCENT_LEAVES) {
            addHoeableBlocks(name);
        }
    }

    private static void addAxeableBlocks(String name) {
        AXE_BLOCKS.add(name);
    }

    private static void addPickaxeableBlocks(String name) {
        PICKAXE_BLOCKS.add(name);
    }

    private static void addHoeableBlocks(String name) {
        HOE_BLOCKS.add(name);
    }

    private static void addShovelableBlocks(String name) {
        SHOVEL_BLOCKS.add(name);
    }

    public static DeferredBlock<Block> register(String name, String translatedName, BlockBehaviour.Properties props) {
        checkForHoeableBlocks(props, name);
        checkForShovelableBlocks(props, name);
        checkForAxeableBlocks(props, name);
        checkForPickaxeableBlocks(props, name);
        normalBlockName.add(name);
        return register(name, translatedName, JBlock::new, props, false);
    }

    public static DeferredBlock<Block> register(String name, String translatedName, Function<BlockBehaviour.Properties, ? extends Block> block, BlockBehaviour.Properties props) {
        checkForHoeableBlocks(props, name);
        checkForShovelableBlocks(props, name);
        checkForAxeableBlocks(props, name);
        checkForPickaxeableBlocks(props, name);
        normalBlockName.add(name);
        return register(name, translatedName, block, props, false);
    }

    public static DeferredBlock<Block> register(String name, String translatedName, Function<BlockBehaviour.Properties, ? extends Block> block, BlockBehaviour.Properties props, boolean addName) {
        normalLangName.add(translatedName);
        if(addName)
            normalBlockName.add(name);
        DeferredBlock<Block> block1 = BLOCKS.registerBlock(name, block, props);
        JItems.registerBlockItem(name, () -> new BlockItem(block1.get(), JItems.itemProps(name).useBlockDescriptionPrefix()));
        return block1;
    }
    public static DeferredBlock<Block> registerCampfire(String name, String translatedName, Function<BlockBehaviour.Properties, ? extends Block> block, BlockBehaviour.Properties props) {
        addAxeableBlocks(name);
        campfireBlockName.add(name);
        campfireLangName.add(translatedName);
        DeferredBlock<Block> block1 = BLOCKS.registerBlock(name, block, props);
        JItems.registerBlockItem(name, () -> new BlockItem(block1.get(), JItems.itemProps(name).useBlockDescriptionPrefix()));
        return block1;
    }

    public static DeferredBlock<Block> registerDoublePlant(String name, String translatedName, Function<BlockBehaviour.Properties, ? extends Block> block, BlockBehaviour.Properties props) {
        doublePlantBlockName.add(name);
        doublePlantLangName.add(translatedName);
        DeferredBlock<Block> block1 = BLOCKS.registerBlock(name, block, props);
        JItems.registerBlockItem(name, () -> new BlockItem(block1.get(), JItems.itemProps(name).useBlockDescriptionPrefix()));
        return block1;
    }

    public static DeferredBlock<Block> registerLilyPad(String name, String translatedName, Function<BlockBehaviour.Properties, ? extends Block> block, BlockBehaviour.Properties props) {
        lilyPadBlockName.add(name);
        lilyPadLangName.add(translatedName);
        DeferredBlock<Block> block1 = BLOCKS.registerBlock(name, block, props);
        JItems.registerBlockItem(name, () -> new BlockItem(block1.get(), JItems.itemProps(name).useBlockDescriptionPrefix()));
        return block1;
    }

    public static DeferredBlock<Block> registerChestBlock(String name, String translatedName, Function<BlockBehaviour.Properties, ? extends Block> block, BlockBehaviour.Properties props) {
        addPickaxeableBlocks(name);
        chestBlockName.add(name);
        chestLangName.add(translatedName);
        DeferredBlock<Block> block1 = BLOCKS.registerBlock(name, block, props);
        JItems.registerBlockItem(name, () -> new BlockItem(block1.get(), JItems.itemProps(name).useBlockDescriptionPrefix()));
        return block1;
    }

    public static DeferredBlock<Block> registerLadder(String name, String translatedName, Function<BlockBehaviour.Properties, ? extends Block> block, BlockBehaviour.Properties props) {
        addAxeableBlocks(name);
        ladderLangName.add(translatedName);
        ladderBlockName.add(name);
        DeferredBlock<Block> block1 = BLOCKS.registerBlock(name, block, props);
        JItems.registerBlockItem(name, () -> new BlockItem(block1.get(), JItems.itemProps(name).useBlockDescriptionPrefix()));
        return block1;
    }

    public static DeferredBlock<Block> registerAltTexBlock(String name, String translatedName,  Function<BlockBehaviour.Properties, ? extends Block> block, BlockBehaviour.Properties props) {
        checkForShovelableBlocks(props, name);
        checkForAxeableBlocks(props, name);
        checkForPickaxeableBlocks(props, name);
        checkForHoeableBlocks(props, name);
        randomLangName.add(translatedName);
        randomBlockName.add(name);
        DeferredBlock<Block> block1 = BLOCKS.registerBlock(name, block, props);
        JItems.registerBlockItem(name, () -> new BlockItem(block1.get(), JItems.itemProps(name).useBlockDescriptionPrefix()));
        return block1;
    }

    public static DeferredBlock<Block> registerAltTexBlock(String name, String translatedName, BlockBehaviour.Properties props) {
        checkForShovelableBlocks(props, name);
        checkForAxeableBlocks(props, name);
        checkForPickaxeableBlocks(props, name);
        checkForHoeableBlocks(props, name);
        randomLangName.add(translatedName);
        randomBlockName.add(name);
        DeferredBlock<Block> block1 = BLOCKS.registerBlock(name, Block::new, props);
        JItems.registerBlockItem(name, () -> new BlockItem(block1.get(), JItems.itemProps(name).useBlockDescriptionPrefix()));
        return block1;
    }

    public static DeferredBlock<Block> registerTintedLeavesBlock(String name, String translatedName, Function<BlockBehaviour.Properties, ? extends Block> block, BlockBehaviour.Properties props) {
        checkForShovelableBlocks(props, name);
        checkForAxeableBlocks(props, name);
        checkForPickaxeableBlocks(props, name);
        checkForHoeableBlocks(props, name);
        tintedLeavesLangName.add(translatedName);
        tintedLeavesBlockName.add(name);
        DeferredBlock<Block> block1 = BLOCKS.registerBlock(name, block, props);
        JItems.registerBlockItem(name, () -> new BlockItem(block1.get(), JItems.itemProps(name).useBlockDescriptionPrefix()));
        return block1;
    }

    public static DeferredBlock<Block> registerMushroomBlock(String name, String translatedName, Function<BlockBehaviour.Properties, ? extends Block> block, BlockBehaviour.Properties props) {
        addAxeableBlocks(name);
        mushroomLangName.add(translatedName);
        mushroomBlockName.add(name);
        DeferredBlock<Block> block1 = BLOCKS.registerBlock(name, block, props);
        JItems.registerBlockItem(name, () -> new BlockItem(block1.get(), JItems.itemProps(name).useBlockDescriptionPrefix()));
        return block1;
    }

    public static DeferredBlock<Block> registerEndPortalFrameStyleBlock(String name, String translatedName, Function<BlockBehaviour.Properties, ? extends Block> block, BlockBehaviour.Properties props) {
        addPickaxeableBlocks(name);
        basePortalFrameLangName.add(translatedName);
        basePortalFrameBlockName.add(name);
        DeferredBlock<Block> block1 = BLOCKS.registerBlock(name, block, props);
        JItems.registerBlockItem(name, () -> new BlockItem(block1.get(), JItems.itemProps(name).useBlockDescriptionPrefix()));
        return block1;
    }

    public static DeferredBlock<Block> registerSlimeStyleBlock(String name, String translatedName, Function<BlockBehaviour.Properties, ? extends Block> block, BlockBehaviour.Properties props) {
        addShovelableBlocks(name);
        slimeLangName.add(translatedName);
        slimeBlockName.add(name);
        DeferredBlock<Block> block1 = BLOCKS.registerBlock(name, block, props);
        JItems.registerBlockItem(name, () -> new BlockItem(block1.get(), JItems.itemProps(name).useBlockDescriptionPrefix()));
        return block1;
    }

    public static DeferredBlock<Block> registerEndPortalStyleBlock(String name, String translatedName, Function<BlockBehaviour.Properties, ? extends Block> block, BlockBehaviour.Properties props) {
        basePortalLangName.add(translatedName);
        basePortalBlockName.add(name);
        DeferredBlock<Block> block1 = BLOCKS.registerBlock(name, block, props);
        JItems.registerBlockItem(name, () -> new BlockItem(block1.get(), JItems.itemProps(name).useBlockDescriptionPrefix()));
        return block1;
    }

    public static DeferredBlock<Block> registerTerrainBlock(String name, String translatedName, Function<BlockBehaviour.Properties, ? extends Block> block, BlockBehaviour.Properties props) {
        if(!name.contains("stone"))
            addShovelableBlocks(name);
        terrainLangName.add(translatedName);
        terrainBlockName.add(name);
        DeferredBlock<Block> block1 = BLOCKS.registerBlock(name, block, props);
        JItems.registerBlockItem(name, () -> new BlockItem(block1.get(), JItems.itemProps(name).useBlockDescriptionPrefix()));
        return block1;
    }

    public static DeferredBlock<Block> registerTerrainBlock(String name, String translatedName, BlockBehaviour.Properties props) {
        checkForAxeableBlocks(props, name);
        checkForPickaxeableBlocks(props, name);
        checkForHoeableBlocks(props, name);
        return registerTerrainBlock(name, translatedName, Block::new, props);
    }

    public static DeferredBlock<Block> registerRotatableBlock(String name, String translatedName, Function<BlockBehaviour.Properties, ? extends Block> block, BlockBehaviour.Properties props, boolean wood) {
        if(wood) {
            addAxeableBlocks(name);
        } else {
            addPickaxeableBlocks(name);
        }
        rotatableBlockName.add(name);
        rotatableLangName.add(translatedName);
        DeferredBlock<Block> block1 = BLOCKS.registerBlock(name, block, props);
        JItems.registerBlockItem(name, () -> new BlockItem(block1.get(), JItems.itemProps(name).useBlockDescriptionPrefix()));
        return block1;
    }

    public static DeferredBlock<Block> registerVineBlock(String name, String translatedName, Function<BlockBehaviour.Properties, ? extends Block> block, BlockBehaviour.Properties props) {
        addHoeableBlocks(name);
        vineBlockName.add(name);
        vineLangName.add(translatedName);
        DeferredBlock<Block> block1 = BLOCKS.registerBlock(name, block, props);
        JItems.registerBlockItem(name, () -> new BlockItem(block1.get(), JItems.itemProps(name).useBlockDescriptionPrefix()));
        return block1;
    }

    public static DeferredBlock<Block> registerModeledBlock(String name, String translatedName, Function<BlockBehaviour.Properties, ? extends Block> block, BlockBehaviour.Properties props) {
        addPickaxeableBlocks(name);
        modelBlockName.add(name);
        modelLangName.add(translatedName);
        DeferredBlock<Block> block1 = BLOCKS.registerBlock(name, block, props);
        JItems.registerBlockItem(name, () -> new BlockItem(block1.get(), JItems.itemProps(name).useBlockDescriptionPrefix()));
        return block1;
    }

    public static DeferredBlock<Block> registerDripstoneBlock(String name, String translatedName, Function<BlockBehaviour.Properties, ? extends Block> block, BlockBehaviour.Properties props) {
        addPickaxeableBlocks(name);
        dripstoneBlockName.add(name);
        dripstoneLangName.add(translatedName);
        DeferredBlock<Block> block1 = BLOCKS.registerBlock(name, block, props);
        JItems.registerBlockItem(name, () -> new BlockItem(block1.get(), JItems.itemProps(name).useBlockDescriptionPrefix()));
        return block1;
    }

    public static DeferredBlock<Block> registerGrassBlock(String name, String translatedName, Function<BlockBehaviour.Properties, ? extends Block> block, BlockBehaviour.Properties props) {
        checkForShovelableBlocks(props, name);
        checkForAxeableBlocks(props, name);
        checkForPickaxeableBlocks(props, name);
        checkForHoeableBlocks(props, name);
        grassBlockName.add(name);
        grassLangName.add(translatedName);
        DeferredBlock<Block> block1 = BLOCKS.registerBlock(name, block, props);
        JItems.registerBlockItem(name, () -> new BlockItem(block1.get(), JItems.itemProps(name).useBlockDescriptionPrefix()));
        return block1;
    }

    public static DeferredBlock<Block> registerGrassBlock(String name, String translatedName, Function<BlockBehaviour.Properties, ? extends Block> block) {
        return registerGrassBlock(name, translatedName, block, JBlockProperties.GRASS);
    }

    public static DeferredBlock<Block> registerOverlayGrassBlock(String name, String translatedName, Function<BlockBehaviour.Properties, ? extends Block> block) {
        addShovelableBlocks(name);
        overlayGrassBlockName.add(name);
        overlayGrassLangName.add(translatedName);
        DeferredBlock<Block> block1 = BLOCKS.registerBlock(name, block, JBlockProperties.GRASS);
        JItems.registerBlockItem(name, () -> new BlockItem(block1.get(), JItems.itemProps(name).useBlockDescriptionPrefix()));
        return block1;
    }

    public static DeferredBlock<Block> registerGrowingBushBlock(String name, String translatedName, Function<BlockBehaviour.Properties, ? extends Block> block) {
        bushBlockName.add(name);
        bushLangName.add(translatedName);
        DeferredBlock<Block> block1 = BLOCKS.registerBlock(name, block, JBlockProperties.GROWING_BUSH);
        JItems.registerBlockItem(name, () -> new BlockItem(block1.get(), JItems.itemProps(name).useBlockDescriptionPrefix()));
        return block1;
    }

    public static DeferredBlock<Block> registerFarmlandBlock(String name, String translatedName, Function<BlockBehaviour.Properties, ? extends Block> block, BlockBehaviour.Properties props) {
        addShovelableBlocks(name);
        farmlandBlockName.add(name);
        farmlandLangName.add(translatedName);
        DeferredBlock<Block> block1 = BLOCKS.registerBlock(name, block, props);
        JItems.registerBlockItem(name, () -> new BlockItem(block1.get(), JItems.itemProps(name).useBlockDescriptionPrefix()));
        return block1;
    }

    public static DeferredBlock<Block> registerCropBlock(String name, String translatedName, int maxStages, Function<BlockBehaviour.Properties, ? extends Block> block, BlockBehaviour.Properties props) {
        cropBlockName.add(name);
        cropLangName.add(translatedName);
        DeferredBlock<Block> block1 = BLOCKS.registerBlock(name, block, props);
        JItems.registerBlockItem(name, () -> new BlockItem(block1.get(), JItems.itemProps(name).useBlockDescriptionPrefix()));
        if(Forsaken.DEV_MODE)
            new JBlockCropGenerator().generate(name, maxStages);
        return block1;
    }

    public static DeferredBlock<Block> registerModeledCropBlock(String name, String translatedName, int maxStages, Function<BlockBehaviour.Properties, ? extends Block> block, BlockBehaviour.Properties props) {
        cropBlockName.add(name);
        cropLangName.add(translatedName);
        DeferredBlock<Block> block1 = BLOCKS.registerBlock(name, block, props);
        JItems.registerBlockItem(name, () -> new BlockItem(block1.get(), JItems.itemProps(name).useBlockDescriptionPrefix()));
        if(Forsaken.DEV_MODE)
            new JBlockModeledCropGenerator().generate(name, maxStages);
        return block1;
    }


    public static DeferredBlock<RotatedPillarBlock> registerPillar(String name, String translatedName, boolean wood, BlockBehaviour.Properties props) {
        if(wood) {
            addAxeableBlocks(name);
        } else {
            addPickaxeableBlocks(name);
        }
        logBlockName.add(name);
        logLangName.add(translatedName);
        DeferredBlock<RotatedPillarBlock> block1 = BLOCKS.register(name, () -> new RotatedPillarBlock(props.setId(ResourceKey.create(Registries.BLOCK, Forsaken.rl(name)))));
        JItems.registerBlockItem(name, () -> new BlockItem(block1.get(), JItems.itemProps(name).useBlockDescriptionPrefix()) {
            @Override
            public int getBurnTime(@NotNull ItemStack itemStack, @Nullable RecipeType<?> recipeType, @NotNull FuelValues fuelValues) {
                return wood ? 300 : 0;
            }
        });
        return block1;
    }

    public static DeferredBlock<DoorBlock> registerDoor(String name, String translatedName, boolean wood, BlockBehaviour.Properties p) {
        if(wood) {
            addAxeableBlocks(name);
        } else {
            addPickaxeableBlocks(name);
        }
        doorBlockName.add(name);
        doorLangName.add(translatedName);
        DeferredBlock<DoorBlock> block1 = BLOCKS.register(name, () -> new DoorBlock(BlockSetType.OAK, p.setId(ResourceKey.create(Registries.BLOCK, Forsaken.rl(name)))));
        JItems.registerBlockItem(name, () -> new BlockItem(block1.get(), JItems.itemProps(name).useBlockDescriptionPrefix()) {
            @Override
            public int getBurnTime(@NotNull ItemStack itemStack, @Nullable RecipeType<?> recipeType, @NotNull FuelValues fuelValues) {
                return wood ? 300 : 0;
            }
        });
        return block1;
    }

    public static DeferredBlock<TrapDoorBlock> registerTrapDoor(String name, String translatedName, boolean wood, BlockBehaviour.Properties p) {
        if(wood) {
            addAxeableBlocks(name);
        } else {
            addPickaxeableBlocks(name);
        }
        trapDoorBlockName.add(name);
        trapDoorLangName.add(translatedName);
        DeferredBlock<TrapDoorBlock> block1 = BLOCKS.register(name, () -> new TrapDoorBlock(BlockSetType.OAK, p.setId(ResourceKey.create(Registries.BLOCK, Forsaken.rl(name)))));
        JItems.registerBlockItem(name, () -> new BlockItem(block1.get(), JItems.itemProps(name).useBlockDescriptionPrefix()) {
            @Override
            public int getBurnTime(@NotNull ItemStack itemStack, @Nullable RecipeType<?> recipeType, @NotNull FuelValues fuelValues) {
                return wood ? 300 : 0;
            }
        });
        return block1;
    }

    public static DeferredBlock<StairBlock> registerStairs(String name, String translatedName, DeferredBlock<Block> plank, boolean wood, BlockBehaviour.Properties p) {
        if(wood) {
            addAxeableBlocks(name);
        } else {
            addPickaxeableBlocks(name);
        }
        stairsBlockName.add(name);
        stairsLangName.add(translatedName);
        DeferredBlock<StairBlock> block1 = BLOCKS.register(name, () -> new StairBlock(plank.get().defaultBlockState(), p.setId(ResourceKey.create(Registries.BLOCK, Forsaken.rl(name)))));
        JItems.registerBlockItem(name, () -> new BlockItem(block1.get(), JItems.itemProps(name).useBlockDescriptionPrefix()) {
            @Override
            public int getBurnTime(@NotNull ItemStack itemStack, @Nullable RecipeType<?> recipeType, @NotNull FuelValues fuelValues) {
                return wood ? 300 : 0;
            }
        });
        return block1;
    }

    public static DeferredBlock<SlabBlock> registerSlab(String name, String translatedName, boolean wood, BlockBehaviour.Properties p) {
        if(wood) {
            addAxeableBlocks(name);
        } else {
            addPickaxeableBlocks(name);
        }
        slabBlockName.add(name);
        slabLangName.add(translatedName);
        DeferredBlock<SlabBlock> block1 = BLOCKS.register(name, () -> new SlabBlock(p.setId(ResourceKey.create(Registries.BLOCK, Forsaken.rl(name)))));
        JItems.registerBlockItem(name, () -> new BlockItem(block1.get(), JItems.itemProps(name).useBlockDescriptionPrefix()) {
            @Override
            public int getBurnTime(@NotNull ItemStack itemStack, @Nullable RecipeType<?> recipeType, @NotNull FuelValues fuelValues) {
                return wood ? 300 : 0;
            }
        });
        return block1;
    }

    public static DeferredBlock<ButtonBlock> registerButton(String name, String translatedName, boolean sensitive, boolean wood, BlockBehaviour.Properties p) {
        if(wood) {
            addAxeableBlocks(name);
        } else {
            addPickaxeableBlocks(name);
        }
        buttonBlockName.add(name);
        buttonLangName.add(translatedName);
        DeferredBlock<ButtonBlock> block1 = BLOCKS.register(name, () -> new ButtonBlock(BlockSetType.OAK, sensitive ? 20 : 30, p.setId(ResourceKey.create(Registries.BLOCK, Forsaken.rl(name)))) {
            @Override
            protected @NotNull SoundEvent getSound(boolean pIsOn) {
                return SoundEvents.WOODEN_BUTTON_CLICK_ON;
            }
        });
        JItems.registerBlockItem(name, () -> new BlockItem(block1.get(), JItems.itemProps(name).useBlockDescriptionPrefix()) {
            @Override
            public int getBurnTime(@NotNull ItemStack itemStack, @Nullable RecipeType<?> recipeType, @NotNull FuelValues fuelValues) {
                return wood ? 300 : 0;
            }
        });
        return block1;
    }

    public static DeferredBlock<PressurePlateBlock> registerPressurePlate(String name, String translatedName, boolean wood, BlockBehaviour.Properties p) {
        if(wood) {
            addAxeableBlocks(name);
        } else {
            addPickaxeableBlocks(name);
        }
        pressurePlateBlockName.add(name);
        pressurePlateLangName.add(translatedName);
        DeferredBlock<PressurePlateBlock> block1 = BLOCKS.register(name, () -> new PressurePlateBlock(BlockSetType.OAK, p.setId(ResourceKey.create(Registries.BLOCK, Forsaken.rl(name)))));
        JItems.registerBlockItem(name, () -> new BlockItem(block1.get(), JItems.itemProps(name).useBlockDescriptionPrefix()) {
            @Override
            public int getBurnTime(@NotNull ItemStack itemStack, @Nullable RecipeType<?> recipeType, @NotNull FuelValues fuelValues) {
                return wood ? 300 : 0;
            }
        });
        return block1;
    }

    public static DeferredBlock<FenceGateBlock> registerFenceGate(String name, String translatedName, boolean wood, BlockBehaviour.Properties p) {
        if(wood) {
            addAxeableBlocks(name);
        } else {
            addPickaxeableBlocks(name);
        }
        gateBlockName.add(name);
        gateLangName.add(translatedName);
        DeferredBlock<FenceGateBlock> block1 = BLOCKS.register(name, () -> new FenceGateBlock(WoodType.OAK, p.setId(ResourceKey.create(Registries.BLOCK, Forsaken.rl(name)))));
        JItems.registerBlockItem(name, () -> new BlockItem(block1.get(), JItems.itemProps(name).useBlockDescriptionPrefix()) {
            @Override
            public int getBurnTime(@NotNull ItemStack itemStack, @Nullable RecipeType<?> recipeType, @NotNull FuelValues fuelValues) {
                return wood ? 300 : 0;
            }
        });
        return block1;
    }

    public static DeferredBlock<IronBarsBlock> registerPaneBlock(String name, String translatedName, BlockBehaviour.Properties props) {
        checkForShovelableBlocks(props, name);
        checkForAxeableBlocks(props, name);
        checkForPickaxeableBlocks(props, name);
        checkForHoeableBlocks(props, name);
        paneBlockName.add(name);
        paneLangName.add(translatedName);
        DeferredBlock<IronBarsBlock> block1 = BLOCKS.register(name, () -> new IronBarsBlock(props.setId(ResourceKey.create(Registries.BLOCK, Forsaken.rl(name)))));
        JItems.registerBlockItem(name, () -> new BlockItem(block1.get(), JItems.itemProps(name).useBlockDescriptionPrefix()));
        return block1;
    }

    public static DeferredBlock<Block> registerCrossBlock(String name, String translatedName, Function<BlockBehaviour.Properties, ? extends Block> block, BlockBehaviour.Properties props) {
        crossBlockName.add(name);
        crossLangName.add(translatedName);
        DeferredBlock<Block> block1 = BLOCKS.registerBlock(name, block, props);
        JItems.registerBlockItem(name, () -> new BlockItem(block1.get(), JItems.itemProps(name).useBlockDescriptionPrefix()));
        return block1;
    }

    public static DeferredBlock<GrowingPlantHeadBlock> registerGrowingPlantHeadBlock(String name, String translatedName, Function<BlockBehaviour.Properties, ? extends GrowingPlantHeadBlock> block, BlockBehaviour.Properties props) {
        crossBlockName.add(name);
        crossLangName.add(translatedName);
        DeferredBlock<GrowingPlantHeadBlock> block1 = BLOCKS.registerBlock(name, block, props);
        JItems.registerBlockItem(name, () -> new BlockItem(block1.get(), JItems.itemProps(name).useBlockDescriptionPrefix()));
        return block1;
    }

    public static DeferredBlock<Block> registerTopBottomBlock(String name, String translatedName, Function<BlockBehaviour.Properties, ? extends Block> block, BlockBehaviour.Properties props) {
        addHoeableBlocks(name);//only for terranian leaves
        topBottomBlockName.add(name);
        topBottomLangName.add(translatedName);
        DeferredBlock<Block> block1 = BLOCKS.registerBlock(name, block, props);
        JItems.registerBlockItem(name, () -> new BlockItem(block1.get(), JItems.itemProps(name).useBlockDescriptionPrefix()));
        return block1;
    }

    public static DeferredBlock<Block> registerTintedCrossBlock(String name, String translatedName, Function<BlockBehaviour.Properties, ? extends Block> block, BlockBehaviour.Properties props) {
        tintedCrossBlockName.add(name);
        tintedCrossLangName.add(translatedName);
        DeferredBlock<Block> block1 = BLOCKS.registerBlock(name, block, props);
        JItems.registerBlockItem(name, () -> new BlockItem(block1.get(), JItems.itemProps(name).useBlockDescriptionPrefix()));
        return block1;
    }

    public static DeferredBlock<Block> registerAttachedCrossBlock(String name, String translatedName, Function<BlockBehaviour.Properties, ? extends Block> block, BlockBehaviour.Properties props) {
        attachedCrossBlockName.add(name);
        attachedCrossLangName.add(translatedName);
        DeferredBlock<Block> block1 = BLOCKS.registerBlock(name, block, props);
        JItems.registerBlockItem(name, () -> new BlockItem(block1.get(), JItems.itemProps(name).useBlockDescriptionPrefix()));
        return block1;
    }

    public static <T extends Block>DeferredBlock<T> registerFuelBlock(String name, String translatedName, Function<BlockBehaviour.Properties, ? extends T> block, BlockBehaviour.Properties props, int burnTime) {
        addPickaxeableBlocks(name);
        normalLangName.add(translatedName);
        normalBlockName.add(name);
        DeferredBlock<T> block1 = BLOCKS.registerBlock(name, block, props);
        JItems.registerBlockItem(name, () -> new BlockItem(block1.get(), JItems.itemProps(name).useBlockDescriptionPrefix()) {
            @Override
            public int getBurnTime(@NotNull ItemStack itemStack, @Nullable RecipeType<?> recipeType, @NotNull FuelValues fuelValues) {
                return burnTime;
            }
        });
        return block1;
    }

    public static DeferredBlock<Block> registerFuelBlock(String name, String translatedName, BlockBehaviour.Properties props, int burnTime) {
        checkForShovelableBlocks(props, name);
        checkForAxeableBlocks(props, name);
        checkForPickaxeableBlocks(props, name);
        checkForHoeableBlocks(props, name);
        normalLangName.add(translatedName);
        normalBlockName.add(name);
        DeferredBlock<Block> block1 = BLOCKS.registerBlock(name, Block::new, props);
        JItems.registerBlockItem(name, () -> new BlockItem(block1.get(), JItems.itemProps(name).useBlockDescriptionPrefix()) {
            @Override
            public int getBurnTime(@NotNull ItemStack itemStack, @Nullable RecipeType<?> recipeType, @NotNull FuelValues fuelValues) {
                return burnTime;
            }
        });
        return block1;
    }
}