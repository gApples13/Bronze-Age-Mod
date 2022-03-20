package io.github.gapples13.bronzeage;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class Registrant
{
    public static final DeferredRegister<Block> BLOCKS_ALL = DeferredRegister.create(ForgeRegistries.BLOCKS, BronzeAge.MOD_ID);
    public static final DeferredRegister<Item> ITEMS_ALL = DeferredRegister.create(ForgeRegistries.ITEMS, BronzeAge.MOD_ID);


    public static <T extends Block> RegistryObject<T> simpleBlockRegister(String blockName, final Supplier<? extends T> block)
    {
        return BLOCKS_ALL.register(blockName, block);
    }



    // Begin block registration

    // End block registration


    // Begin item registration

    // End item registration
}
