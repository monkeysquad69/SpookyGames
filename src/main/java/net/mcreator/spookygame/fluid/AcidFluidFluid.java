
package net.mcreator.spookygame.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.spookygame.init.SpookygameModItems;
import net.mcreator.spookygame.init.SpookygameModFluids;
import net.mcreator.spookygame.init.SpookygameModFluidTypes;
import net.mcreator.spookygame.init.SpookygameModBlocks;

public abstract class AcidFluidFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> SpookygameModFluidTypes.ACID_FLUID_TYPE.get(), () -> SpookygameModFluids.ACID_FLUID.get(), () -> SpookygameModFluids.FLOWING_ACID_FLUID.get())
			.explosionResistance(100f).bucket(() -> SpookygameModItems.ACID_FLUID_BUCKET.get()).block(() -> (LiquidBlock) SpookygameModBlocks.ACID_FLUID.get());

	private AcidFluidFluid() {
		super(PROPERTIES);
	}

	public static class Source extends AcidFluidFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends AcidFluidFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
