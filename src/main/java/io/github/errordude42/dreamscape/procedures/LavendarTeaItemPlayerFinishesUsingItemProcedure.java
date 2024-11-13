package io.github.errordude42.dreamscape.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import io.github.errordude42.dreamscape.init.DreamscapeModMobEffects;
import io.github.errordude42.dreamscape.init.DreamscapeModItems;

public class LavendarTeaItemPlayerFinishesUsingItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(DreamscapeModMobEffects.DEEP_SLEEP.get(), 7200, 0));
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(DreamscapeModItems.LAVENDAR_TEA_ITEM.get());
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
		if (entity instanceof Player _player) {
			ItemStack _setstack = new ItemStack(DreamscapeModItems.TEA_CUP.get()).copy();
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
		}
	}
}
