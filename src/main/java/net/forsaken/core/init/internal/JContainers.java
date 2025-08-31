package net.forsaken.core.init.internal;

import net.forsaken.core.helper.internal.EmptyContainer;
import net.forsaken.core.init.Forsaken;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;
import net.neoforged.neoforge.network.IContainerFactory;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

@EventBusSubscriber(modid = Forsaken.MOD_ID)
public class JContainers {
    public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, Forsaken.MOD_ID);

    public static DeferredHolder<MenuType<?>, MenuType<EmptyContainer>> EMPTY_CONTAINER = registerContainer("empty", (s, in, buf) -> new EmptyContainer().create(s, in, buf));


    private static <T extends AbstractContainerMenu> DeferredHolder<MenuType<?>, MenuType<T>> registerContainer(String id, IContainerFactory<T> factory) {
        return JContainers.REGISTRY.register(id, () -> IMenuTypeExtension.create(factory));
    }

    @SubscribeEvent
    public static void register(RegisterMenuScreensEvent event) {

    }
}