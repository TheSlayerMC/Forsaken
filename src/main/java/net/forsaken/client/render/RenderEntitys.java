package net.forsaken.client.render;

import net.forsaken.core.init.Forsaken;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.client.event.RegisterSpecialModelRendererEvent;

import java.util.function.BiConsumer;

@EventBusSubscriber(modid = Forsaken.MOD_ID, value = Dist.CLIENT)
public class RenderEntitys {

    @SubscribeEvent
    public static void registerEntityRenders(EntityRenderersEvent.RegisterRenderers event) {

        registerAnimationRenderers(event::registerEntityRenderer);
    }

    @SubscribeEvent
    public static void registerEntityLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {

    }

    @SubscribeEvent
    public static void registerSpecialRenderers(RegisterSpecialModelRendererEvent event) {

    }

    public static void registerAnimationRenderers(BiConsumer<EntityType<? extends Entity>, EntityRendererProvider> entityRenderers) {

    }
}