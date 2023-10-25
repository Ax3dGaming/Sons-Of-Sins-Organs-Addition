package com.axed.recipe;

import com.axed.sosorgans;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, sosorgans.MODID);

    public static final RegistryObject<RecipeSerializer<OrganCreatorRecipe>> ORGAN_CREATION_SERIALIZER =
            SERIALIZERS.register("gem_polishing", () -> OrganCreatorRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}