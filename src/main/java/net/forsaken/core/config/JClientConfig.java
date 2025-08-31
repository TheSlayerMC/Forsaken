package net.forsaken.core.config;

import net.neoforged.neoforge.common.ModConfigSpec;

public class JClientConfig {

	public static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
	public static final ModConfigSpec SPEC;


	static {
		BUILDER.push("Client configs for Forsaken");


		BUILDER.pop();
		SPEC = BUILDER.build();
	}
}
