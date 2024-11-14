
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.errordude42.dreamscape.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;

import io.github.errordude42.dreamscape.item.TeaCupItem;
import io.github.errordude42.dreamscape.item.LavendarTeaItemItem;
import io.github.errordude42.dreamscape.item.LavendarItemItem;
import io.github.errordude42.dreamscape.DreamscapeMod;

public class DreamscapeModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DreamscapeMod.MODID);
	public static final RegistryObject<Item> QUAKING_ASPEN_WOOD = block(DreamscapeModBlocks.QUAKING_ASPEN_WOOD);
	public static final RegistryObject<Item> QUAKING_ASPEN_LOG = block(DreamscapeModBlocks.QUAKING_ASPEN_LOG);
	public static final RegistryObject<Item> QUAKING_ASPEN_PLANKS = block(DreamscapeModBlocks.QUAKING_ASPEN_PLANKS);
	public static final RegistryObject<Item> QUAKING_ASPEN_LEAVES = block(DreamscapeModBlocks.QUAKING_ASPEN_LEAVES);
	public static final RegistryObject<Item> QUAKING_ASPEN_STAIRS = block(DreamscapeModBlocks.QUAKING_ASPEN_STAIRS);
	public static final RegistryObject<Item> QUAKING_ASPEN_SLAB = block(DreamscapeModBlocks.QUAKING_ASPEN_SLAB);
	public static final RegistryObject<Item> QUAKING_ASPEN_FENCE = block(DreamscapeModBlocks.QUAKING_ASPEN_FENCE);
	public static final RegistryObject<Item> QUAKING_ASPEN_FENCE_GATE = block(DreamscapeModBlocks.QUAKING_ASPEN_FENCE_GATE);
	public static final RegistryObject<Item> QUAKING_ASPEN_PRESSURE_PLATE = block(DreamscapeModBlocks.QUAKING_ASPEN_PRESSURE_PLATE);
	public static final RegistryObject<Item> QUAKING_ASPEN_BUTTON = block(DreamscapeModBlocks.QUAKING_ASPEN_BUTTON);
	public static final RegistryObject<Item> FADED_OAK_WOOD = block(DreamscapeModBlocks.FADED_OAK_WOOD);
	public static final RegistryObject<Item> FADED_OAK_LOG = block(DreamscapeModBlocks.FADED_OAK_LOG);
	public static final RegistryObject<Item> FADED_OAK_PLANKS = block(DreamscapeModBlocks.FADED_OAK_PLANKS);
	public static final RegistryObject<Item> FADED_OAK_LEAVES = block(DreamscapeModBlocks.FADED_OAK_LEAVES);
	public static final RegistryObject<Item> FADED_OAK_STAIRS = block(DreamscapeModBlocks.FADED_OAK_STAIRS);
	public static final RegistryObject<Item> FADED_OAK_SLAB = block(DreamscapeModBlocks.FADED_OAK_SLAB);
	public static final RegistryObject<Item> FADED_OAK_FENCE = block(DreamscapeModBlocks.FADED_OAK_FENCE);
	public static final RegistryObject<Item> FADED_OAK_FENCE_GATE = block(DreamscapeModBlocks.FADED_OAK_FENCE_GATE);
	public static final RegistryObject<Item> FADED_OAK_PRESSURE_PLATE = block(DreamscapeModBlocks.FADED_OAK_PRESSURE_PLATE);
	public static final RegistryObject<Item> FADED_OAK_BUTTON = block(DreamscapeModBlocks.FADED_OAK_BUTTON);
	public static final RegistryObject<Item> FADED_GRASS = block(DreamscapeModBlocks.FADED_GRASS);
	public static final RegistryObject<Item> FADED_DIRT = block(DreamscapeModBlocks.FADED_DIRT);
	public static final RegistryObject<Item> FADED_STONE = block(DreamscapeModBlocks.FADED_STONE);
	public static final RegistryObject<Item> FADED_SAPLING = block(DreamscapeModBlocks.FADED_SAPLING);
	public static final RegistryObject<Item> LAVENDAR = block(DreamscapeModBlocks.LAVENDAR);
	public static final RegistryObject<Item> LAVENDAR_ITEM = REGISTRY.register("lavendar_item", () -> new LavendarItemItem());
	public static final RegistryObject<Item> TEA_CUP = REGISTRY.register("tea_cup", () -> new TeaCupItem());
	public static final RegistryObject<Item> LAVENDAR_TEA_ITEM = REGISTRY.register("lavendar_tea_item", () -> new LavendarTeaItemItem());
	public static final RegistryObject<Item> FLYING_EYE_SPAWN_EGG = REGISTRY.register("flying_eye_spawn_egg", () -> new ForgeSpawnEggItem(DreamscapeModEntities.FLYING_EYE, -6750208, -13421773, new Item.Properties()));
	public static final RegistryObject<Item> FADED_OAK_DOOR = doubleBlock(DreamscapeModBlocks.FADED_OAK_DOOR);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties()));
	}
}
