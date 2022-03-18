package net.mcreator.samuraiswords.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.world.Difficulty;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.samuraiswords.SamuraiswordsMod;

import java.util.Map;

public class DaimyoKiyokolightningProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SamuraiswordsMod.LOGGER.warn("Failed to load dependency world for procedure DaimyoKiyokolightning!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SamuraiswordsMod.LOGGER.warn("Failed to load dependency entity for procedure DaimyoKiyokolightning!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		if (world.getDifficulty() == Difficulty.PEACEFUL) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 0);
		} else if (world.getDifficulty() == Difficulty.EASY) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		} else if (world.getDifficulty() == Difficulty.NORMAL) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 6);
		} else if (world.getDifficulty() == Difficulty.HARD) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 8);
		}
	}
}
