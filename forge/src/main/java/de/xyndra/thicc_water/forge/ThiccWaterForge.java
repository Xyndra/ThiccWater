package de.xyndra.thicc_water.forge;

import dev.architectury.platform.forge.EventBuses;
import de.xyndra.thicc_water.ThiccWater;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ThiccWater.MOD_ID)
public class ThiccWaterForge {
    public ThiccWaterForge() {
		// Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(ThiccWater.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        ThiccWater.init();
    }
}