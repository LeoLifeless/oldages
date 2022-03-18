
package net.mcreator.samuraiswords.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.samuraiswords.block.SakuraPlanksBlock;
import net.mcreator.samuraiswords.SamuraiswordsModElements;

@SamuraiswordsModElements.ModElement.Tag
public class SakuraPickaxeItem extends SamuraiswordsModElements.ModElement {
	@ObjectHolder("samuraiswords:sakura_pickaxe")
	public static final Item block = null;

	public SakuraPickaxeItem(SamuraiswordsModElements instance) {
		super(instance, 59);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 59;
			}

			public float getEfficiency() {
				return 2f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 0;
			}

			public int getEnchantability() {
				return 15;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(SakuraPlanksBlock.block));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("sakura_pickaxe"));
	}
}
