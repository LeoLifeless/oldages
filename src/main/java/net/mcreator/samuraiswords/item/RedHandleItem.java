
package net.mcreator.samuraiswords.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.samuraiswords.itemgroup.SamuraiSwordsItemGroup;
import net.mcreator.samuraiswords.SamuraiswordsModElements;

@SamuraiswordsModElements.ModElement.Tag
public class RedHandleItem extends SamuraiswordsModElements.ModElement {
	@ObjectHolder("samuraiswords:red_handle")
	public static final Item block = null;

	public RedHandleItem(SamuraiswordsModElements instance) {
		super(instance, 18);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(SamuraiSwordsItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("red_handle");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
