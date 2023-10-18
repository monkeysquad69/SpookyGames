
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.spookygame.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.spookygame.block.AcidFluidBlock;
import net.mcreator.spookygame.SpookygameMod;

public class SpookygameModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SpookygameMod.MODID);
	public static final RegistryObject<Block> ACID_FLUID = REGISTRY.register("acid_fluid", () -> new AcidFluidBlock());
}
