package de.vepexlegit.betterkeybindhandling;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = BetterKeyBindHandling.MODID, version = BetterKeyBindHandling.VERSION)
public class BetterKeyBindHandling {
    public static final String MODID = "betterkeybindhandling";
    public static final String VERSION = "1.0";

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("DIRT BLOCK >> " + Blocks.dirt.getUnlocalizedName());
    }
}
