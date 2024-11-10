
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.errordude42.dreamscape.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import io.github.errordude42.dreamscape.DreamScapeMod;

public class DreamScapeModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DreamScapeMod.MODID);
	public static final RegistryObject<CreativeModeTab> DREAM_SCAPE = REGISTRY.register("dream_scape",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.dream_scape.dream_scape")).icon(() -> new ItemStack(DreamScapeModBlocks.QUAKING_ASPEN_LOG.get())).displayItems((parameters, tabData) -> {
				tabData.accept(DreamScapeModBlocks.QUAKING_ASPEN_WOOD.get().asItem());
				tabData.accept(DreamScapeModBlocks.QUAKING_ASPEN_LOG.get().asItem());
				tabData.accept(DreamScapeModBlocks.QUAKING_ASPEN_PLANKS.get().asItem());
				tabData.accept(DreamScapeModBlocks.QUAKING_ASPEN_LEAVES.get().asItem());
				tabData.accept(DreamScapeModBlocks.QUAKING_ASPEN_STAIRS.get().asItem());
				tabData.accept(DreamScapeModBlocks.QUAKING_ASPEN_SLAB.get().asItem());
				tabData.accept(DreamScapeModBlocks.QUAKING_ASPEN_FENCE.get().asItem());
				tabData.accept(DreamScapeModBlocks.QUAKING_ASPEN_FENCE_GATE.get().asItem());
				tabData.accept(DreamScapeModBlocks.QUAKING_ASPEN_PRESSURE_PLATE.get().asItem());
				tabData.accept(DreamScapeModBlocks.QUAKING_ASPEN_BUTTON.get().asItem());
				tabData.accept(DreamScapeModBlocks.FADED_OAK_WOOD.get().asItem());
				tabData.accept(DreamScapeModBlocks.FADED_OAK_LOG.get().asItem());
				tabData.accept(DreamScapeModBlocks.FADED_OAK_PLANKS.get().asItem());
				tabData.accept(DreamScapeModBlocks.FADED_OAK_LEAVES.get().asItem());
				tabData.accept(DreamScapeModBlocks.FADED_OAK_STAIRS.get().asItem());
				tabData.accept(DreamScapeModBlocks.FADED_OAK_SLAB.get().asItem());
				tabData.accept(DreamScapeModBlocks.FADED_OAK_FENCE.get().asItem());
				tabData.accept(DreamScapeModBlocks.FADED_OAK_FENCE_GATE.get().asItem());
				tabData.accept(DreamScapeModBlocks.FADED_OAK_PRESSURE_PLATE.get().asItem());
				tabData.accept(DreamScapeModBlocks.FADED_OAK_BUTTON.get().asItem());
			})

					.build());
}
