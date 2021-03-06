package net.mcreator.samuraiswords.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.samuraiswords.entity.CorruptedsamuraiArcherEntity;
import net.mcreator.samuraiswords.entity.CorruptedSamuraiEntity;
import net.mcreator.samuraiswords.SamuraiswordsMod;

import java.util.Map;

public class EvilsamuraispawnerUpdateTickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SamuraiswordsMod.LOGGER.warn("Failed to load dependency world for procedure EvilsamuraispawnerUpdateTick!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				SamuraiswordsMod.LOGGER.warn("Failed to load dependency x for procedure EvilsamuraispawnerUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				SamuraiswordsMod.LOGGER.warn("Failed to load dependency y for procedure EvilsamuraispawnerUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				SamuraiswordsMod.LOGGER.warn("Failed to load dependency z for procedure EvilsamuraispawnerUpdateTick!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		ItemStack pickaxe = ItemStack.EMPTY;
		double EnchtSize = 0;
		double i = 0;
		double j = 0;
		double k = 0;
		if (world instanceof ServerWorld) {
			((ServerWorld) world).spawnParticle(ParticleTypes.FLAME, x, y, z, (int) 25, 0.5, 0.5, 0.5, 0.1);
		}
		if (world.getLight(new BlockPos((int) (x + 1), (int) y, (int) z)) <= 7 && world.getLight(new BlockPos((int) (x - 1), (int) y, (int) z)) <= 7
				&& world.getLight(new BlockPos((int) x, (int) y, (int) (z + 1))) <= 7
				&& world.getLight(new BlockPos((int) x, (int) y, (int) (z - 1))) <= 7
				&& world.getLight(new BlockPos((int) (x + 2), (int) y, (int) z)) <= 7
				&& world.getLight(new BlockPos((int) (x - 2), (int) y, (int) z)) <= 7
				&& world.getLight(new BlockPos((int) x, (int) y, (int) (z + 2))) <= 7
				&& world.getLight(new BlockPos((int) x, (int) y, (int) (z - 2))) <= 7) {
			if ((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) z))).getBlock() == Blocks.AIR
					&& (world.getBlockState(new BlockPos((int) (x + 2), (int) (y + 1), (int) z))).getBlock() == Blocks.AIR) {
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new CorruptedSamuraiEntity.CustomEntity(CorruptedSamuraiEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles((x + 2), y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(new BlockPos((int) (x - 2), (int) y, (int) z))).getBlock() == Blocks.AIR
					&& (world.getBlockState(new BlockPos((int) (x - 2), (int) (y + 1), (int) z))).getBlock() == Blocks.AIR) {
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new CorruptedsamuraiArcherEntity.CustomEntity(CorruptedsamuraiArcherEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles((x - 2), y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 2)))).getBlock() == Blocks.AIR
					&& (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 2)))).getBlock() == Blocks.AIR) {
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new CorruptedsamuraiArcherEntity.CustomEntity(CorruptedsamuraiArcherEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles(x, y, (z + 2), world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 2)))).getBlock() == Blocks.AIR
					&& (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 2)))).getBlock() == Blocks.AIR) {
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new CorruptedSamuraiEntity.CustomEntity(CorruptedSamuraiEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles(x, y, (z - 2), world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
			}
		}
	}
}
