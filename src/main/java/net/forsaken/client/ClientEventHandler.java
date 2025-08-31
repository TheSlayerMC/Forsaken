package net.forsaken.client;

import net.forsaken.client.util.ClientGetter;
import net.forsaken.common.world.dimension.Dimensions;
import net.forsaken.core.init.Forsaken;
import net.minecraft.world.entity.player.Player;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.AddClientReloadListenersEvent;
import net.neoforged.neoforge.client.event.RegisterDimensionSpecialEffectsEvent;
import net.neoforged.neoforge.client.event.ViewportEvent;

@EventBusSubscriber(modid = Forsaken.MOD_ID, value = Dist.CLIENT)
public class ClientEventHandler {

    public static void regToBus(IEventBus forgeBus) {
        forgeBus.addListener(ClientEventHandler::onFogDensityEvent);
    }

    public static void onFogDensityEvent(ViewportEvent.RenderFog event) {
        float farPlaneDistance = event.getFarPlaneDistance();
        Player player = ClientGetter.player();
//        if (ClientGetter.level().dimension() == Dimensions.FROZEN_LANDS) {
//            float density;
//            ICuriosItemHandler curios = CuriosApi.getCuriosInventory(player).get();
//            if(player.getData(JDataAttachments.PLAYER_STATS).hasBlizzard() || curios.findFirstCurio(JItems.EYE_OF_THE_BLIZZARD.get()).isPresent()) {
//                density = 0.55F;
//            } else {
//                density = 0.1F;
//            }
//            event.setNearPlaneDistance(density);
//            event.setFarPlaneDistance(density * farPlaneDistance);
//        }todo

//        if(ClientGetter.level().dimension() == Dimensions.EUCA) {
//            float density = 2.5F;
//            event.setNearPlaneDistance(density);
//            event.setFarPlaneDistance(density * farPlaneDistance);
//        }
    }
}