
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.spookygame.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.spookygame.item.JelloSwordItem;
import net.mcreator.spookygame.item.GummySwordItem;
import net.mcreator.spookygame.item.AcidFluidItem;
import net.mcreator.spookygame.SpookygameMod;

public class SpookygameModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SpookygameMod.MODID);
	public static final RegistryObject<Item> ACID_FLUID_BUCKET = REGISTRY.register("acid_fluid_bucket", () -> new AcidFluidItem());
	public static final RegistryObject<Item> JELLO_SWORD = REGISTRY.register("jello_sword", () -> new JelloSwordItem());
	public static final RegistryObject<Item> GUMMY_SWORD = REGISTRY.register("gummy_sword", () -> new GummySwordItem());
}
