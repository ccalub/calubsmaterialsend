
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.calubsmaterialsendaddon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.calubsmaterialsendaddon.item.StabilizedMatterItem;
import net.mcreator.calubsmaterialsendaddon.item.ChorusPowderItem;
import net.mcreator.calubsmaterialsendaddon.CalubsMaterialsEndAddonMod;

public class CalubsMaterialsEndAddonModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CalubsMaterialsEndAddonMod.MODID);
	public static final RegistryObject<Item> UNSTABLE_MATTER = block(CalubsMaterialsEndAddonModBlocks.UNSTABLE_MATTER,
			CalubsMaterialsEndAddonModTabs.TAB_CALUBS_MATERIALS_END_ADDON);
	public static final RegistryObject<Item> STABILIZER = block(CalubsMaterialsEndAddonModBlocks.STABILIZER,
			CalubsMaterialsEndAddonModTabs.TAB_CALUBS_MATERIALS_END_ADDON);
	public static final RegistryObject<Item> CHORUS_POWDER = REGISTRY.register("chorus_powder", () -> new ChorusPowderItem());
	public static final RegistryObject<Item> STABILIZED_MATTER = REGISTRY.register("stabilized_matter", () -> new StabilizedMatterItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
