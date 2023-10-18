
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.spookygame.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.spookygame.fluid.AcidFluidFluid;
import net.mcreator.spookygame.SpookygameMod;

public class SpookygameModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, SpookygameMod.MODID);
	public static final RegistryObject<FlowingFluid> ACID_FLUID = REGISTRY.register("acid_fluid", () -> new AcidFluidFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_ACID_FLUID = REGISTRY.register("flowing_acid_fluid", () -> new AcidFluidFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(ACID_FLUID.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_ACID_FLUID.get(), RenderType.translucent());
		}
	}
}
