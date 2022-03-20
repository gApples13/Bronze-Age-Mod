/*
Mod entrypoint

GPL Disclaimer Here.
 */
package io.github.gapples13.bronzeage;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod("bronzeage")
public class BronzeAge
{
    public static final String MOD_ID = "bronzeage";

    public static final CreativeModeTab CM_TAB = new CreativeModeTab(MOD_ID) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Registrant.DRAB_BRONZE.get().asItem());
        }
    };



    public BronzeAge()
    {
        Registrant.BLOCKS_ALL.register(FMLJavaModLoadingContext.get().getModEventBus());
        Registrant.ITEMS_ALL.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

}
