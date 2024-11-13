
package io.github.errordude42.dreamscape.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TeaCupItem extends Item {
	public TeaCupItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
