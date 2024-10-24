package de.tomalbrc.tsaconcrete;

import com.mojang.logging.LogUtils;
import de.tomalbrc.filament.api.FilamentLoader;
import eu.pb4.polymer.resourcepack.api.PolymerResourcePackUtils;
import net.fabricmc.api.ModInitializer;
import net.minecraft.world.level.block.Blocks;
import org.slf4j.Logger;

public class TSAConcrete implements ModInitializer {
    private static Logger LOGGER = LogUtils.getLogger();

    @Override
    public void onInitialize() {
        try {
            FilamentLoader.loadBlocks("tsa-concrete");
            PolymerResourcePackUtils.addModAssets("tsa-concrete");
            PolymerResourcePackUtils.markAsRequired();
        } catch (Exception e) {
            LOGGER.error("Could not load some files!");
            e.printStackTrace();
        }
    }
}
