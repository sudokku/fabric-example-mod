package dev.sudokku.minecraft.vanillaatlas;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VanillaAtlas implements ModInitializer {
    public static final String MOD_ID = "vanilla-atlas";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Vanilla Atlas Mod");
    }
}