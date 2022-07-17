
package net.mcreator.calubsmaterialsendaddon.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.calubsmaterialsendaddon.init.CalubsMaterialsEndAddonModTabs;

public class StabilizedMatterItem extends Item {
	public StabilizedMatterItem() {
		super(new Item.Properties().tab(CalubsMaterialsEndAddonModTabs.TAB_CALUBS_MATERIALS_END_ADDON).stacksTo(16).rarity(Rarity.EPIC));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
