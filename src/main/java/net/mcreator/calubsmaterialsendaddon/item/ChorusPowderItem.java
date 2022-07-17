
package net.mcreator.calubsmaterialsendaddon.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.calubsmaterialsendaddon.init.CalubsMaterialsEndAddonModTabs;

public class ChorusPowderItem extends Item {
	public ChorusPowderItem() {
		super(new Item.Properties().tab(CalubsMaterialsEndAddonModTabs.TAB_CALUBS_MATERIALS_END_ADDON).stacksTo(64).rarity(Rarity.UNCOMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
