
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.calubsmaterialsendaddon.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class CalubsMaterialsEndAddonModTabs {
	public static CreativeModeTab TAB_CALUBS_MATERIALS_END_ADDON;

	public static void load() {
		TAB_CALUBS_MATERIALS_END_ADDON = new CreativeModeTab("tabcalubs_materials_end_addon") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CalubsMaterialsEndAddonModBlocks.UNSTABLE_MATTER.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
