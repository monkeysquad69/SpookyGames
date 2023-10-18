
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.spookygame.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.spookygame.item.AcidFluidItem;
import net.mcreator.spookygame.SpookygameMod;

public class SpookygameModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SpookygameMod.MODID);
	public static final RegistryObject<Item> ACID_FLUID_BUCKET = REGISTRY.register("acid_fluid_bucket", () -> new AcidFluidItem());
}
