
package net.mcreator.samuraiswords.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.samuraiswords.itemgroup.SamuraiSwordsItemGroup;
import net.mcreator.samuraiswords.SamuraiswordsModElements;

@SamuraiswordsModElements.ModElement.Tag
public class BokkenItem extends SamuraiswordsModElements.ModElement {
	@ObjectHolder("samuraiswords:bokken")
	public static final Item block = null;

	public BokkenItem(SamuraiswordsModElements instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 1000;
			}

			public float getEfficiency() {
				return 0f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 0;
			}

			public int getEnchantability() {
				return 13;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(TamahaganeIngotItem.block));
			}
		}, 3, -2f, new Item.Properties().group(SamuraiSwordsItemGroup.tab)) {
		}.setRegistryName("bokken"));
	}
}
