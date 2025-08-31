package net.forsaken.core.init.internal;

import net.minecraft.core.Registry;
import net.minecraft.core.RegistryAccess;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageType;

public class JDamageSources {

    private final Registry<DamageType> damageTypes;


    private JDamageSources(RegistryAccess r) {
        this.damageTypes = r.lookupOrThrow(Registries.DAMAGE_TYPE);

    }

    private ResourceKey<DamageType> makeSource(String name) {
        return ResourceKey.create(Registries.DAMAGE_TYPE, ResourceLocation.withDefaultNamespace(name));
    }

    private DamageSource source(ResourceKey<DamageType> r) {
        return new DamageSource(this.damageTypes.getOrThrow(r));
    }
}