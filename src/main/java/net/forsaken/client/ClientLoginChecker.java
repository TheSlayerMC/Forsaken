package net.forsaken.client;

import net.forsaken.client.util.ChatUtils;
import net.forsaken.core.config.JClientConfig;
import net.forsaken.core.helper.InternetHandler;
import net.forsaken.core.init.Forsaken;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.entity.player.Player;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;

import java.io.IOException;
import java.net.SocketException;

@EventBusSubscriber(modid = Forsaken.MOD_ID, value = Dist.CLIENT)
public class ClientLoginChecker {

    @SubscribeEvent
    public static void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event) {
        Player player = event.getEntity();
            if(!player.level().isClientSide) {
                ChatUtils.sendColouredMessage(player, ChatFormatting.GOLD, "[|---------------------------------------------------|]");
                ChatUtils.sendColouredMessage(player, ChatFormatting.GOLD, "[" + Forsaken.MOD_NAME + "]");
                ChatUtils.sendColouredTranslatedMessage(player, ChatFormatting.LIGHT_PURPLE, "forsaken.message.thank_you", player.getDisplayName());
                ChatUtils.sendColouredTranslatedMessage(player, ChatFormatting.BLUE, "forsaken.message.current_version", Forsaken.MOD_VERSION);

                try {
                    if(!InternetHandler.isOnline()) {
                        MutableComponent msg = Component.translatable("forsaken.message.no_internet");
                        msg.withStyle(ChatFormatting.RED);
                        player.displayClientMessage(msg, false);
                    }
                    try {
                        if(InternetHandler.isUpdateAvailable() && InternetHandler.isOnline()) {
                            ChatUtils.sendColouredTranslatedMessage(player, ChatFormatting.GREEN, "forsaken.message.update_available", InternetHandler.getUpdateVersion());
                        }
                        if(!InternetHandler.isUpdateAvailable() && InternetHandler.isOnline()) {
                            ChatUtils.sendColouredTranslatedMessage(player, ChatFormatting.AQUA, "forsaken.message.up_to_date");
                        }
                    } catch(IOException e) {
                        throw new RuntimeException(e);
                    }
                } catch(SocketException e) {
                    throw new RuntimeException(e);
                }
                ChatUtils.sendColouredMessage(player, ChatFormatting.GOLD, "[|---------------------------------------------------|]");
        }
    }
}