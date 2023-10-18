
package net.mcreator.spookygame.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.spookygame.init.SpookygameModFluids;

public class AcidFluidBlock extends LiquidBlock {
	public AcidFluidBlock() {
		super(() -> SpookygameModFluids.ACID_FLUID.get(), BlockBehaviour.Properties.of().mapColor(MapColor.FIRE).strength(100f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}
}
