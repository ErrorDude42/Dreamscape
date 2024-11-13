
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package io.github.errordude42.dreamscape.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import io.github.errordude42.dreamscape.potion.DeepSleepMobEffect;
import io.github.errordude42.dreamscape.DreamscapeMod;

public class DreamscapeModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, DreamscapeMod.MODID);
	public static final RegistryObject<MobEffect> DEEP_SLEEP = REGISTRY.register("deep_sleep", () -> new DeepSleepMobEffect());
}
