
package net.mcreator.samuraiswords.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.samuraiswords.block.SakuraPlanksBlock;
import net.mcreator.samuraiswords.SamuraiswordsModElements;

@SamuraiswordsModElements.ModElement.Tag
public class SakuraSwordItem extends SamuraiswordsModElements.ModElement {
	@ObjectHolder("samuraiswords:sakura_sword")
	public static final Item block = null;

	public SakuraSwordItem(SamuraiswordsModElements instance) {
		super(instance, 61);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 250;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(SakuraPlanksBlock.block));
			}
		}, 3, -2.4f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("sakura_sword"));
	}
}
