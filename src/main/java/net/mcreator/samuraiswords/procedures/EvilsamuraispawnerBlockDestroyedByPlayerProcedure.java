package net.mcreator.samuraiswords.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.entity.item.ExperienceOrbEntity;

import net.mcreator.samuraiswords.SamuraiswordsMod;

import java.util.Map;

public class EvilsamuraispawnerBlockDestroyedByPlayerProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SamuraiswordsMod.LOGGER.warn("Failed to load dependency world for procedure EvilsamuraispawnerBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				SamuraiswordsMod.LOGGER.warn("Failed to load dependency x for procedure EvilsamuraispawnerBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				SamuraiswordsMod.LOGGER.warn("Failed to load dependency y for procedure EvilsamuraispawnerBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				SamuraiswordsMod.LOGGER.warn("Failed to load dependency z for procedure EvilsamuraispawnerBlockDestroyedByPlayer!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (Math.random() >= 0.5) {
			if (world instanceof World && !world.isRemote()) {
				((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, y, z, (int) 16));
			}
		} else {
			if (Math.random() >= 0.5) {
				if (world instanceof World && !world.isRemote()) {
					((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, y, z, (int) 20));
				}
			} else {
				if (Math.random() >= 0.5) {
					if (world instanceof World && !world.isRemote()) {
						((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, y, z, (int) 25));
					}
				} else {
					if (Math.random() >= 0.5) {
						if (world instanceof World && !world.isRemote()) {
							((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, y, z, (int) 30));
						}
					} else {
						if (Math.random() >= 0.5) {
							if (world instanceof World && !world.isRemote()) {
								((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, y, z, (int) 35));
							}
						} else {
							if (world instanceof World && !world.isRemote()) {
								((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, y, z, (int) 43));
							}
						}
					}
				}
			}
		}
	}
}
