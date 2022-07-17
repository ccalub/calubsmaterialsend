
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.calubsmaterialsendaddon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.calubsmaterialsendaddon.block.UnstableMatterBlock;
import net.mcreator.calubsmaterialsendaddon.block.StabilizerBlock;
import net.mcreator.calubsmaterialsendaddon.CalubsMaterialsEndAddonMod;

public class CalubsMaterialsEndAddonModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CalubsMaterialsEndAddonMod.MODID);
	public static final RegistryObject<Block> UNSTABLE_MATTER = REGISTRY.register("unstable_matter", () -> new UnstableMatterBlock());
	public static final RegistryObject<Block> STABILIZER = REGISTRY.register("stabilizer", () -> new StabilizerBlock());
}
