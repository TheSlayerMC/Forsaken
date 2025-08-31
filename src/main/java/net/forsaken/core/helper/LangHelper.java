package net.forsaken.core.helper;

import net.forsaken.core.init.Forsaken;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;

public class LangHelper {

	public static MutableComponent getFormattedText(String format) {
		return i18n(format);
	}

	public static MutableComponent i18n(String text, Object... args) {
		MutableComponent result = Component.translatable(text, args);
		result.withStyle(ChatFormatting.GRAY);
		return result;
	}

	public static MutableComponent getEfficiency() {
		return getFormattedText("forsaken.efficiency");
	}

	public static MutableComponent getUsesRemaining() {
		return getFormattedText("forsaken.uses_remaining");
	}

	public static MutableComponent getInfiniteUses() {
		return getFormattedText("forsaken.infinite");
	}

	public static MutableComponent useEssence(int amount) {
		return Component.translatable(getFormattedText("journey.uses") + " " + amount + " " + getFormattedText("forsaken.essence"));
	}

	public static MutableComponent rangedDamage(int damage) {
		return Component.translatable(damage + " " + getFormattedText("forsaken.ranged_damage"));
	}

	public static MutableComponent unbreakable() {
		return getFormattedText("forsaken.unbreakable");
	}

	public static MutableComponent setWitherSword(int time) {
		return Component.translatable(getFormattedText("forsaken.hit") + " " + getFormattedText("forsaken.wither") + " " + time + " " + getFormattedText("forsaken.seconds"));
	}

	public static MutableComponent setBossSpawner(String boss) {
		return Component.translatable("forsaken.boss.spawn", boss);
	}

	public static MutableComponent setPetSpawner(String pet) {
		return Component.translatable("forsaken.pet.spawn", pet);
	}

	public static MutableComponent nameToKey(String name) {
		return Component.translatable(name.trim().replace(" ", "_").toLowerCase());
	}

	public static MutableComponent withModPrefix(String str) {
		return Component.translatable(Forsaken.MOD_ID + "." + str);
	}
}