package io.github.errordude42.dreamscape.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import io.github.errordude42.dreamscape.entity.FlyingEyeEntity;

public class FlyingEyeModel extends GeoModel<FlyingEyeEntity> {
	@Override
	public ResourceLocation getAnimationResource(FlyingEyeEntity entity) {
		return new ResourceLocation("dreamscape", "animations/dreamscape_flyingeye.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FlyingEyeEntity entity) {
		return new ResourceLocation("dreamscape", "geo/dreamscape_flyingeye.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FlyingEyeEntity entity) {
		return new ResourceLocation("dreamscape", "textures/entities/" + entity.getTexture() + ".png");
	}

}
