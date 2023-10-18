
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.spookygame.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.spookygame.fluid.types.AcidFluidFluidType;
import net.mcreator.spookygame.SpookygameMod;

public class SpookygameModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, SpookygameMod.MODID);
	public static final RegistryObject<FluidType> ACID_FLUID_TYPE = REGISTRY.register("acid_fluid", () -> new AcidFluidFluidType());
}
