
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.errordude42.dreamscape.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import io.github.errordude42.dreamscape.DreamScapeMod;

public class DreamScapeModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DreamScapeMod.MODID);
	public static final RegistryObject<Item> QUAKING_ASPEN_WOOD = block(DreamScapeModBlocks.QUAKING_ASPEN_WOOD);
	public static final RegistryObject<Item> QUAKING_ASPEN_LOG = block(DreamScapeModBlocks.QUAKING_ASPEN_LOG);
	public static final RegistryObject<Item> QUAKING_ASPEN_PLANKS = block(DreamScapeModBlocks.QUAKING_ASPEN_PLANKS);
	public static final RegistryObject<Item> QUAKING_ASPEN_LEAVES = block(DreamScapeModBlocks.QUAKING_ASPEN_LEAVES);
	public static final RegistryObject<Item> QUAKING_ASPEN_STAIRS = block(DreamScapeModBlocks.QUAKING_ASPEN_STAIRS);
	public static final RegistryObject<Item> QUAKING_ASPEN_SLAB = block(DreamScapeModBlocks.QUAKING_ASPEN_SLAB);
	public static final RegistryObject<Item> QUAKING_ASPEN_FENCE = block(DreamScapeModBlocks.QUAKING_ASPEN_FENCE);
	public static final RegistryObject<Item> QUAKING_ASPEN_FENCE_GATE = block(DreamScapeModBlocks.QUAKING_ASPEN_FENCE_GATE);
	public static final RegistryObject<Item> QUAKING_ASPEN_PRESSURE_PLATE = block(DreamScapeModBlocks.QUAKING_ASPEN_PRESSURE_PLATE);
	public static final RegistryObject<Item> QUAKING_ASPEN_BUTTON = block(DreamScapeModBlocks.QUAKING_ASPEN_BUTTON);
	public static final RegistryObject<Item> FADED_OAK_WOOD = block(DreamScapeModBlocks.FADED_OAK_WOOD);
	public static final RegistryObject<Item> FADED_OAK_LOG = block(DreamScapeModBlocks.FADED_OAK_LOG);
	public static final RegistryObject<Item> FADED_OAK_PLANKS = block(DreamScapeModBlocks.FADED_OAK_PLANKS);
	public static final RegistryObject<Item> FADED_OAK_LEAVES = block(DreamScapeModBlocks.FADED_OAK_LEAVES);
	public static final RegistryObject<Item> FADED_OAK_STAIRS = block(DreamScapeModBlocks.FADED_OAK_STAIRS);
	public static final RegistryObject<Item> FADED_OAK_SLAB = block(DreamScapeModBlocks.FADED_OAK_SLAB);
	public static final RegistryObject<Item> FADED_OAK_FENCE = block(DreamScapeModBlocks.FADED_OAK_FENCE);
	public static final RegistryObject<Item> FADED_OAK_FENCE_GATE = block(DreamScapeModBlocks.FADED_OAK_FENCE_GATE);
	public static final RegistryObject<Item> FADED_OAK_PRESSURE_PLATE = block(DreamScapeModBlocks.FADED_OAK_PRESSURE_PLATE);
	public static final RegistryObject<Item> FADED_OAK_BUTTON = block(DreamScapeModBlocks.FADED_OAK_BUTTON);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
