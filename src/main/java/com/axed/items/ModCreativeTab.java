package com.axed.items;

import net.mcreator.sonsofsins.init.SonsOfSinsModTabs;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static com.axed.block.ModBlocks.ORGAN_CREATOR;
import static com.axed.items.ModItems.*;
import static com.axed.sosorgans.MODID;

public class ModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    public static final RegistryObject<CreativeModeTab> MOD_TAB = CREATIVE_MODE_TABS.register("sosorgans", () -> CreativeModeTab.builder()
            .withTabsBefore(SonsOfSinsModTabs.SONS_OF_SINS_TAB.getId()).title(Component.translatable("itemGroup.sosorgans"))
            .icon(() -> ORGAN_CREATOR.get().asItem().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(ORGAN_CREATOR.get());
                output.accept(SOULIUM_INGOT.get());
                output.accept(SOULIUM_DAGGER.get());
                output.accept(BOTTLE.get());
                output.accept(WITHER_SKELETON_SOUL.get());
                output.accept(WITHER_SKELETON_HEART.get());
                output.accept(WITHER_SKELETON_MUSCLE.get());
                output.accept(WITHER_SKELETON_RIBS.get());
                output.accept(BLAZE_SOUL.get());
                output.accept(BLAZE_HEART.get());
                output.accept(BLAZE_MUSCLE.get());
                output.accept(BLAZE_RIBS.get());
                output.accept(OCELOT_SOUL.get());
                output.accept(OCELOT_HEART.get());
                output.accept(OCELOT_MUSCLE.get());
                output.accept(OCELOT_RIBS.get());
            }).build());

    public static void register(IEventBus eventBus) {CREATIVE_MODE_TABS.register(eventBus);}
}
