
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

import io.github.errordude42.dreamscape.DreamscapeMod;

public class DreamscapeModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DreamscapeMod.MODID);
	public static final RegistryObject<CreativeModeTab> DREAM_SCAPE = REGISTRY.register("dream_scape",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.dreamscape.dream_scape")).icon(() -> new ItemStack(DreamscapeModBlocks.QUAKING_ASPEN_LOG.get())).displayItems((parameters, tabData) -> {
				tabData.accept(DreamscapeModBlocks.QUAKING_ASPEN_WOOD.get().asItem());
				tabData.accept(DreamscapeModBlocks.QUAKING_ASPEN_LOG.get().asItem());
				tabData.accept(DreamscapeModBlocks.QUAKING_ASPEN_PLANKS.get().asItem());
				tabData.accept(DreamscapeModBlocks.QUAKING_ASPEN_LEAVES.get().asItem());
				tabData.accept(DreamscapeModBlocks.QUAKING_ASPEN_STAIRS.get().asItem());
				tabData.accept(DreamscapeModBlocks.QUAKING_ASPEN_SLAB.get().asItem());
				tabData.accept(DreamscapeModBlocks.QUAKING_ASPEN_FENCE.get().asItem());
				tabData.accept(DreamscapeModBlocks.QUAKING_ASPEN_FENCE_GATE.get().asItem());
				tabData.accept(DreamscapeModBlocks.QUAKING_ASPEN_PRESSURE_PLATE.get().asItem());
				tabData.accept(DreamscapeModBlocks.QUAKING_ASPEN_BUTTON.get().asItem());
				tabData.accept(DreamscapeModBlocks.FADED_OAK_WOOD.get().asItem());
				tabData.accept(DreamscapeModBlocks.FADED_OAK_LOG.get().asItem());
				tabData.accept(DreamscapeModBlocks.FADED_OAK_PLANKS.get().asItem());
				tabData.accept(DreamscapeModBlocks.FADED_OAK_LEAVES.get().asItem());
				tabData.accept(DreamscapeModBlocks.FADED_OAK_STAIRS.get().asItem());
				tabData.accept(DreamscapeModBlocks.FADED_OAK_SLAB.get().asItem());
				tabData.accept(DreamscapeModBlocks.FADED_OAK_FENCE.get().asItem());
				tabData.accept(DreamscapeModBlocks.FADED_OAK_FENCE_GATE.get().asItem());
				tabData.accept(DreamscapeModBlocks.FADED_OAK_PRESSURE_PLATE.get().asItem());
				tabData.accept(DreamscapeModBlocks.FADED_OAK_BUTTON.get().asItem());
				tabData.accept(DreamscapeModBlocks.FADED_GRASS.get().asItem());
				tabData.accept(DreamscapeModBlocks.FADED_DIRT.get().asItem());
				tabData.accept(DreamscapeModBlocks.FADED_STONE.get().asItem());
				tabData.accept(DreamscapeModBlocks.FADED_SAPLING.get().asItem());
				tabData.accept(DreamscapeModBlocks.LAVENDAR.get().asItem());
				tabData.accept(DreamscapeModItems.LAVENDAR_ITEM.get());
				tabData.accept(DreamscapeModItems.TEA_CUP.get());
				tabData.accept(DreamscapeModItems.LAVENDAR_TEA_ITEM.get());
			})

					.build());
}
