package net.forsaken.core.init.internal;

import net.forsaken.core.init.Forsaken;
import net.minecraft.Util;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.JukeboxSong;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class JSounds {

    public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, Forsaken.MOD_ID);
    public static final DeferredRegister<JukeboxSong> JUKEBOX_SONG = DeferredRegister.create(Registries.JUKEBOX_SONG, Forsaken.MOD_ID);



    private static DeferredHolder<SoundEvent, SoundEvent> registerSound(String name) {
        return REGISTRY.register(name, () -> createSoundEvent(name));
    }

    private static SoundEvent createSoundEvent(String soundPath) {
        return SoundEvent.createVariableRangeEvent(Forsaken.rl(soundPath));
    }

    private static DeferredHolder<JukeboxSong, JukeboxSong> registerJukeboxSound(String name, DeferredHolder<SoundEvent, SoundEvent> song, int seconds) {
        int output = 13;
        return JUKEBOX_SONG.register(name, () -> new JukeboxSong(song, Component.translatable(Util.makeDescriptionId("jukebox_song", song.getKey().location())), seconds, output));
    }
}