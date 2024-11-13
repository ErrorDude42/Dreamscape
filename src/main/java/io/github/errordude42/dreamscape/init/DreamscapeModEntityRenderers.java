
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.errordude42.dreamscape.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import io.github.errordude42.dreamscape.client.renderer.FlyingEyeRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DreamscapeModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(DreamscapeModEntities.FLYING_EYE.get(), FlyingEyeRenderer::new);
	}
}
