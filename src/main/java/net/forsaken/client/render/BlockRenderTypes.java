package net.forsaken.client.render;

import net.forsaken.core.init.Forsaken;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.minecraft.world.level.block.Block;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

import java.util.ArrayList;

@EventBusSubscriber(modid = Forsaken.MOD_ID, value = Dist.CLIENT)
public class BlockRenderTypes {

    @SubscribeEvent
    public static void registerRenderTypes(FMLClientSetupEvent event) {
        ArrayList<Block> cutout = new ArrayList<>();
        ArrayList<Block> translucent = new ArrayList<>();

        for(Block b : cutout) {
            ItemBlockRenderTypes.setRenderLayer(b, ChunkSectionLayer.CUTOUT);
        }

        for(Block b : translucent) {
            ItemBlockRenderTypes.setRenderLayer(b, ChunkSectionLayer.TRANSLUCENT);
        }
    }
}