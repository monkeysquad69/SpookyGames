
package net.mcreator.spookygame.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.spookygame.procedures.JelloEffectOnEffectActiveTickProcedure;

public class JelloEffectMobEffect extends MobEffect {
	public JelloEffectMobEffect() {
		super(MobEffectCategory.HARMFUL, -13369549);
	}

	@Override
	public String getDescriptionId() {
		return "effect.spookygame.jello_effect";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		JelloEffectOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
