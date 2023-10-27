package com.axed.items;

import com.axed.sosorgans;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, sosorgans.MODID);

    public static final RegistryObject<Item> SOULIUM_INGOT = ITEMS.register("soulium_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BOTTLE = ITEMS.register("bottle", () -> (new Item(new Item.Properties().stacksTo(1))));
    public static final RegistryObject<Item> SOULIUM_DAGGER = ITEMS.register("soulium_dagger",
            () -> new SwordItem(Tiers.IRON, 4, 2, new Item.Properties()));
    //WIWI
    public static final RegistryObject<Item> WITHER_SKELETON_SOUL = ITEMS.register("wither_skeleton_soul", () -> (new Item(new Item.Properties())));
    public static final RegistryObject<Item> WITHER_SKELETON_RIBS = ITEMS.register("wither_skeleton_ribs", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WITHER_SKELETON_HEART = ITEMS.register("wither_skeleton_heart", () -> (new Item(new Item.Properties())));
    public static final RegistryObject<Item> WITHER_SKELETON_MUSCLE = ITEMS.register("wither_skeleton_muscle", () -> (new Item(new Item.Properties())));
    //BLAZE
    public static final RegistryObject<Item> BLAZE_SOUL = ITEMS.register("blaze_soul", () -> (new Item(new Item.Properties())));
    public static final RegistryObject<Item> BLAZE_RIBS = ITEMS.register("blaze_ribs", () -> (new Item(new Item.Properties())));
    public static final RegistryObject<Item> BLAZE_HEART = ITEMS.register("blaze_heart", () -> (new Item(new Item.Properties())));
    public static final RegistryObject<Item> BLAZE_MUSCLE = ITEMS.register("blaze_muscle", () -> (new Item(new Item.Properties())));
    //OCELOT
    public static final RegistryObject<Item> OCELOT_SOUL = ITEMS.register("ocelot_soul", () -> (new Item(new Item.Properties())));
    public static final RegistryObject<Item> OCELOT_RIBS = ITEMS.register("ocelot_ribs", () -> (new Item(new Item.Properties())));
    public static final RegistryObject<Item> OCELOT_HEART = ITEMS.register("ocelot_heart", () -> (new Item(new Item.Properties())));
    public static final RegistryObject<Item> OCELOT_MUSCLE = ITEMS.register("ocelot_muscle", () -> (new Item(new Item.Properties())));


}
