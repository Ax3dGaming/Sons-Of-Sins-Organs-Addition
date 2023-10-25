package com.axed.block.entity;

import com.axed.block.ModBlocks;
import com.axed.sosorgans;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, sosorgans.MODID);

    public static final RegistryObject<BlockEntityType<OrganCreatorBlockEntity>> ORGAN_CREATOR_BE =
            BLOCK_ENTITIES.register("organ_creator_be", () ->
                    BlockEntityType.Builder.of(OrganCreatorBlockEntity::new,
                            ModBlocks.ORGAN_CREATOR.get()).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
