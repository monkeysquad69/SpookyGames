
package net.mcreator.spookygame.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.spookygame.init.SpookygameModFluids;

public class AcidFluidItem extends BucketItem {
	public AcidFluidItem() {
		super(SpookygameModFluids.ACID_FLUID, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
