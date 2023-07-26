package de.xyndra.thicc_water.fabric;

import de.xyndra.thicc_water.ThiccWater;
import net.fabricmc.api.ModInitializer;

public class ThiccWaterFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        ThiccWater.init();
    }
}