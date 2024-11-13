
package io.github.errordude42.dreamscape.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class DeepSleepMobEffect extends MobEffect {
	public DeepSleepMobEffect() {
		super(MobEffectCategory.NEUTRAL, -3886645);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
