/*
Mod entrypoint

DISCLAIMER:
This file is part of The Bronze Age.

The Bronze Age is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.

The Bronze Age is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.

You should have received a copy of the GNU General Public License along with The Bronze Age. If not, see <https://www.gnu.org/licenses/>.
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
