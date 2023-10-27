package com.axed.custom.blaze;

import com.axed.items.ModItems;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;


import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class BlazeRibsTickEventProcedure {
    @SubscribeEvent
    public static void onEntityTick(LivingEvent.LivingTickEvent event) {
        execute(event, event.getEntity());
    }

    public static void execute(Entity entity) {
        execute(null, entity);
    }

    private static void execute(@Nullable Event event, Entity entity) {
        if (entity == null)
            return;
        double nb = 0;
        if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("sons_of_sins:is_a_flesh_creature")))) {
            nb = 0;
            for (int index0 = 0; index0 < 4; index0++) {
                if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.byTypeAndIndex(EquipmentSlot.Type.ARMOR, (int) nb)) : ItemStack.EMPTY).getItem() == ModItems.BLAZE_RIBS.get()) {
                    entity.clearFire();
                }
                nb = nb + 1;
            }
        }
    }
}

