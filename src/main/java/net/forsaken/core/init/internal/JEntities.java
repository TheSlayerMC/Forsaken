package net.forsaken.core.init.internal;

import net.forsaken.common.entity.base.JMonsterEntity;
import net.forsaken.core.init.Forsaken;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.level.levelgen.Heightmap;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.ArrayList;
import java.util.function.Supplier;

@EventBusSubscriber(modid = Forsaken.MOD_ID)
public class JEntities {

    public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, Forsaken.MOD_ID);
    public static final ArrayList<String> entityName = new ArrayList<>();
    public static final ArrayList<String> entityLangName = new ArrayList<>();



    private static <T extends Mob> DeferredHolder<EntityType<?>, EntityType<T>> registerEntity(EntityType.EntityFactory<T> factory, String name, String lang, float width, float height, float passengerAttachment, MobCategory category) {
        ResourceKey<EntityType<?>> resource = ResourceKey.create(Registries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(Forsaken.MOD_ID, name));
        DeferredHolder<EntityType<?>, EntityType<T>> entity = REGISTRY.register(name, () -> EntityType.Builder.of(factory, category).sized(width, height).passengerAttachments(passengerAttachment).clientTrackingRange(10).build(resource));
        JItems.register(name + "_spawn_egg" , lang + " Spawn Egg", (p) -> new SpawnEggItem(entity.get(), p), JItems.ItemType.SPAWN_EGG);
        entityName.add(name);
        entityLangName.add(lang);
        return entity;
    }

    private static <T extends Mob> DeferredHolder<EntityType<?>, EntityType<T>> registerEntity(EntityType.EntityFactory<T> factory, String name, String lang, float width, float height, MobCategory category) {
        ResourceKey<EntityType<?>> resource = ResourceKey.create(Registries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(Forsaken.MOD_ID, name));
        DeferredHolder<EntityType<?>, EntityType<T>> entity = REGISTRY.register(name, () -> EntityType.Builder.of(factory, category).sized(width, height).build(resource));
        JItems.register(name + "_spawn_egg" , lang + " Spawn Egg", (p) -> new SpawnEggItem(entity.get(), p), JItems.ItemType.SPAWN_EGG);
        entityName.add(name);
        entityLangName.add(lang);
        return entity;
    }

    private static <T extends Mob> DeferredHolder<EntityType<?>, EntityType<T>> registerEntity(EntityType.EntityFactory<T> factory, String name, String lang, float width, float height) {
        return registerEntity(factory, name, lang, width, height, MobCategory.MONSTER);
    }

    private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> registerRawEntity(EntityType.EntityFactory<T> factory, String name, String lang, float width, float height) {
        ResourceKey<EntityType<?>> resource = ResourceKey.create(Registries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(Forsaken.MOD_ID, name));
        return REGISTRY.register(name, () -> EntityType.Builder.of(factory, MobCategory.MISC).sized(width, height).setShouldReceiveVelocityUpdates(true).setTrackingRange(80).build(resource));
    }

    private static <T extends Projectile> DeferredHolder<EntityType<?>, EntityType<T>> registerProjectile(EntityType.EntityFactory<T> factory, String name, String lang, float width, float height) {
        ResourceKey<EntityType<?>> resource = ResourceKey.create(Registries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(Forsaken.MOD_ID, name));
        return REGISTRY.register(name, () -> EntityType.Builder.of(factory, MobCategory.MISC).sized(width, height).setShouldReceiveVelocityUpdates(true).setTrackingRange(120).setUpdateInterval(20).build(resource));
    }

    @SubscribeEvent
    public static void registerAttributes(final EntityAttributeCreationEvent event) {

    }

    @SubscribeEvent
    public static void registerSpawnPlacement(RegisterSpawnPlacementsEvent event) {

    }

    public static <T extends Entity> void setCustomSpawn(RegisterSpawnPlacementsEvent event, DeferredHolder<EntityType<?>, EntityType<T>> entity, SpawnPlacements.SpawnPredicate<T> spawn) {
        event.register(entity.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, spawn, RegisterSpawnPlacementsEvent.Operation.REPLACE);
    }

    //For normal mob spawns (animals / NPC's)
    public static <T extends Mob> void setDefaultSpawn(RegisterSpawnPlacementsEvent event, DeferredHolder<EntityType<?>, EntityType<T>> entity) {
        event.register(entity.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Mob::checkMobSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
    }

    //For monsters to spawn anywhere
    public static <T extends JMonsterEntity> void setDefaultMonsterSpawn(RegisterSpawnPlacementsEvent event, DeferredHolder<EntityType<?>, EntityType<T>> entity) {
        event.register(entity.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, JMonsterEntity::checkAnyLightMonsterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
    }

    //For monsters in only dark spots
    public static <T extends Monster> void setDarkMonsterSpawn(RegisterSpawnPlacementsEvent event, DeferredHolder<EntityType<?>, EntityType<T>> entity) {
        event.register(entity.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
    }
}