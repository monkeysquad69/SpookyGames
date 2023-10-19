
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.spookygame.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.spookygame.potion.JelloEffectMobEffect;
import net.mcreator.spookygame.SpookygameMod;

public class SpookygameModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, SpookygameMod.MODID);
	public static final RegistryObject<MobEffect> JELLO_EFFECT = REGISTRY.register("jello_effect", () -> new JelloEffectMobEffect());
}
