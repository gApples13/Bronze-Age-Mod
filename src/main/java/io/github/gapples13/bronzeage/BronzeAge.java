/*
Mod entrypoint

GPL Disclaimer Here.
 */
package io.github.gapples13.bronzeage;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.EventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


@Mod("bronzeage")
public class BronzeAge
{
    public static final String MOD_ID = "bronzeage";

    public static final CreativeModeTab CM_TAB = new CreativeModeTab(MOD_ID) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(DRAB_BRONZE.get().asItem());
        }
    }

    public static final DeferredRegister<Block> BLOCKS_ALL = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);

    //Begin block registration
    public static final RegistryObject<Block> DRAB_BRONZE = BLOCKS_ALL.register("drab_bronze", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL)),
            object -> () -> new Item(new Item.Properties().tab(CM_TAB)));
    public static final RegistryObject<Block> POLISHED_BRONZE = BLOCKS_ALL.register("polished_bronze", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL)),
            object -> () -> new Item(new Item.Properties().tab(CM_TAB)));
    // End block registration

    public BronzeAge()
    {
        BLOCKS_ALL.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

}
