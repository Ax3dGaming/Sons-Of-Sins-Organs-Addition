package com.axed.custom.wither;

import com.axed.items.ModItems;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.Difficulty;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;


import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class WitherHeartTickEventProcedure {
    @SubscribeEvent
    public static void onEntityDeath(LivingDeathEvent event) {
        if (event != null && event.getEntity() != null) {
            execute(event, event.getEntity().level(), event.getEntity());
        }
    }

    public static void execute(LevelAccessor world, Entity entity) {
        execute(null, world, entity);
    }

    private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
        if (entity == null)
            return;
        double nb = 0;
        if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("sons_of_sins:is_a_flesh_creature")))) {
            nb = 0;
            for (int index0 = 0; index0 < 4; index0++) {
                if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.byTypeAndIndex(EquipmentSlot.Type.ARMOR, (int) nb)) : ItemStack.EMPTY).getItem() == ModItems.WITHER_SKELETON_HEART.get()) {
                    if (world.getDifficulty() == Difficulty.EASY) {
                        if (world instanceof ServerLevel _level) {
                            Entity entityToSpawn = EntityType.WITHER_SKELETON.spawn(_level, BlockPos.containing(entity.getX(), entity.getY() + 2, entity.getZ()), MobSpawnType.MOB_SUMMONED);
                            if (entityToSpawn != null) {
                                entityToSpawn.setDeltaMovement(0, 0, 0);
                            }
                        }
                        if (world instanceof ServerLevel _level) {
                            Entity entityToSpawn = EntityType.WITHER_SKELETON.spawn(_level, BlockPos.containing(entity.getX(), entity.getY() + 2, entity.getZ()), MobSpawnType.MOB_SUMMONED);
                            if (entityToSpawn != null) {
                                entityToSpawn.setDeltaMovement(0, 0, 0);
                            }
                        }
                    } else if (world.getDifficulty() == Difficulty.NORMAL) {
                        if (world instanceof ServerLevel _level) {
                            Entity entityToSpawn = EntityType.WITHER_SKELETON.spawn(_level, BlockPos.containing(entity.getX(), entity.getY() + 2, entity.getZ()), MobSpawnType.MOB_SUMMONED);
                            if (entityToSpawn != null) {
                                entityToSpawn.setDeltaMovement(0, 0, 0);
                            }
                        }
                        if (world instanceof ServerLevel _level) {
                            Entity entityToSpawn = EntityType.WITHER_SKELETON.spawn(_level, BlockPos.containing(entity.getX(), entity.getY() + 2, entity.getZ()), MobSpawnType.MOB_SUMMONED);
                            if (entityToSpawn != null) {
                                entityToSpawn.setDeltaMovement(0, 0, 0);
                            }
                        }
                        if (world instanceof ServerLevel _level) {
                            Entity entityToSpawn = EntityType.WITHER_SKELETON.spawn(_level, BlockPos.containing(entity.getX(), entity.getY() + 2, entity.getZ()), MobSpawnType.MOB_SUMMONED);
                            if (entityToSpawn != null) {
                                entityToSpawn.setDeltaMovement(0, 0, 0);
                            }
                        }
                    } else {
                        if (world instanceof ServerLevel _level) {
                            Entity entityToSpawn = EntityType.WITHER_SKELETON.spawn(_level, BlockPos.containing(entity.getX(), entity.getY() + 2, entity.getZ()), MobSpawnType.MOB_SUMMONED);
                            if (entityToSpawn != null) {
                                entityToSpawn.setDeltaMovement(0, 0, 0);
                            }
                        }
                        if (world instanceof ServerLevel _level) {
                            Entity entityToSpawn = EntityType.WITHER_SKELETON.spawn(_level, BlockPos.containing(entity.getX(), entity.getY() + 2, entity.getZ()), MobSpawnType.MOB_SUMMONED);
                            if (entityToSpawn != null) {
                                entityToSpawn.setDeltaMovement(0, 0, 0);
                            }
                        }
                        if (world instanceof ServerLevel _level) {
                            Entity entityToSpawn = EntityType.WITHER_SKELETON.spawn(_level, BlockPos.containing(entity.getX(), entity.getY() + 2, entity.getZ()), MobSpawnType.MOB_SUMMONED);
                            if (entityToSpawn != null) {
                                entityToSpawn.setDeltaMovement(0, 0, 0);
                            }
                        }
                        if (world instanceof ServerLevel _level) {
                            Entity entityToSpawn = EntityType.WITHER_SKELETON.spawn(_level, BlockPos.containing(entity.getX(), entity.getY() + 2, entity.getZ()), MobSpawnType.MOB_SUMMONED);
                            if (entityToSpawn != null) {
                                entityToSpawn.setDeltaMovement(0, 0, 0);
                            }
                        }
                        if (world instanceof ServerLevel _level) {
                            Entity entityToSpawn = EntityType.WITHER_SKELETON.spawn(_level, BlockPos.containing(entity.getX(), entity.getY() + 2, entity.getZ()), MobSpawnType.MOB_SUMMONED);
                            if (entityToSpawn != null) {
                                entityToSpawn.setDeltaMovement(0, 0, 0);
                            }
                        }
                    }
                }
                nb = nb + 1;
            }
        }
    }
}
