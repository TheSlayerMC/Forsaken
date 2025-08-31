package net.forsaken.core.init;

import net.forsaken.client.ClientEventHandler;
import net.forsaken.common.world.dimension.Dimensions;
import net.forsaken.common.world.dimension.JCarver;
import net.forsaken.common.world.gen.JFeatures;
import net.forsaken.core.config.JClientConfig;
import net.forsaken.core.config.JCommonConfig;
import net.forsaken.core.data.*;
import net.forsaken.core.data.block_generation.*;
import net.forsaken.core.init.internal.*;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.event.lifecycle.InterModEnqueueEvent;
import net.neoforged.neoforge.common.NeoForge;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Forsaken.MOD_ID)
public class Forsaken {
    public static final String MOD_ID = "forsaken", PREFIX = MOD_ID + ":", MOD_VERSION = "0.0.1", MOD_NAME = "Forsaken";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);
    public static final boolean DEV_MODE = true;

    public Forsaken(IEventBus modEventBus, ModContainer container) {
        modEventBus.addListener(JTabs::registerTabs);
        JItems.ITEMS.register(modEventBus);
        JBlocks.BLOCKS.register(modEventBus);
        JItems.BLOCK_ITEMS.register(modEventBus);
        JEntities.REGISTRY.register(modEventBus);
        JFeatures.REGISTRY.register(modEventBus);
        JContainers.REGISTRY.register(modEventBus);
        JBlockEntities.REGISTRY.register(modEventBus);
        Dimensions.REGISTRY.register(modEventBus);
        JCarver.REGISTRY.register(modEventBus);
        StructureRegistry.REGISTRY.register(modEventBus);
        JParticleManager.REGISTRY.register(modEventBus);
        JSounds.REGISTRY.register(modEventBus);
        JSounds.JUKEBOX_SONG.register(modEventBus);
        JTabs.REGISTRY.register(modEventBus);
        JDataAttachments.REGISTRY.register(modEventBus);
        JDataComponents.REGISTRY.register(modEventBus);
        JNetworkRegistry.init(modEventBus);

        if(DEV_MODE) {
            new BlockBreakingGenerator().generate();
            new ItemTypeGenerator().generate();
            new JItemGenerator().generate();
            new JBowItemGenerator().generate();
            new JShieldItemGenerator().generate();
            new JBlockGenerator().generate();
            new JTerrainBlockGenerator().generate();
            new JBlockChestGenerator().generate();
            new JBlockRotatableGenerator().generate();
            new JBlockTrophyGenerator().generate();
            new JBlockFurnaceGenerator().generate();
            new JBlockCrossGenerator().generate();
            new JBlockLilyGenerator().generate();
            new JBlockDoublePlantGenerator().generate();
            new JBlockBushGenerator().generate();
            new JBlockAttachedCrossGenerator().generate();
            new JBlockPillarGenerator().generate();
            new JBlockBottomTopGenerator().generate();
            new JBlockWallGenerator().generate();
            new JBlockDoorGenerator().generate();
            new JBlockTrapDoorGenerator().generate();
            new JBlockPaneGenerator().generate();
            new JBlockSlimeGenerator().generate();
            new JBlockStairsGenerator().generate();
            new JBlockSlabGenerator().generate();
            new JBlockPressurePlateGenerator().generate();
            new JBlockVineGenerator().generate();
            new JBlockButtonGenerator().generate();
            new JBlockGateGenerator().generate();
            new JBlockFenceGenerator().generate();
            new JBlockGrassGenerator().generate();
            new JBlockOverlayGrassGenerator().generate();
            new JBlockTintedCrossGenerator().generate();
            new JBlockTintedLeavesGenerator().generate();
            new JBlockPortalGenerator().generate();
            new JBlockCampfireGenerator().generate();
            new JBlockPathGenerator().generate();
            new JBlockLadderGenerator().generate();
            new JRandomizedBlockGenerator().generate();
            new JBlockFarmGenerator().generate();
            new JBlockEndPortalGenerator().generate();
            new JBlockEndFrameGenerator().generate();
            new JBlockMushroomGenerator().generate();
            new BlockTotemGenerator().generate();
            new JBlockDripstoneGenerator().generate();
            new ArmorGenerator().generate();
            new LangRegistry().generate();
        }

        modEventBus.addListener(this::commonInit);
        modEventBus.addListener(this::clientSetup);
        modEventBus.addListener(this::enqueue);

        container.registerConfig(ModConfig.Type.CLIENT, JClientConfig.SPEC, "forsaken-client.toml");
        container.registerConfig(ModConfig.Type.COMMON, JCommonConfig.SPEC, "forsaken-common.toml");
    }

    private void commonInit(final FMLCommonSetupEvent event) {

    }

    private void clientSetup(final FMLClientSetupEvent event) {
        IEventBus forgeEventBus = NeoForge.EVENT_BUS;
        ClientEventHandler.regToBus(forgeEventBus);
    }

    private void enqueue(InterModEnqueueEvent event) { }

    public static ResourceLocation rl(String r) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, r);
    }

    public static ResourceLocation tl(String r) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, "textures/" + r);
    }

    public static ResourceLocation getRegistryName(Item item) {
        return BuiltInRegistries.ITEM.getKey(item);
    }

    public static ResourceLocation getRegistryName(Block block) {
        return BuiltInRegistries.BLOCK.getKey(block);
    }

    public static ResourceLocation getRegistryName(EntityType<?> entity) {
        return BuiltInRegistries.ENTITY_TYPE.getKey(entity);
    }
}
