package com.axed.compat;

import com.axed.recipe.OrganCreatorRecipe;
import com.axed.screen.OrganCreatorScreen;
import com.axed.sosorgans;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IGuiHandlerRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;

import java.util.List;

@JeiPlugin
public class JEISosorgansPlugin implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(sosorgans.MODID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new OrganCreationCategory(registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager recipeManager = Minecraft.getInstance().level.getRecipeManager();

        List<OrganCreatorRecipe> polishingRecipes = recipeManager.getAllRecipesFor(OrganCreatorRecipe.Type.INSTANCE);
        registration.addRecipes(OrganCreationCategory.ORGAN_CREATION_TYPE, polishingRecipes);
    }

    @Override
    public void registerGuiHandlers(IGuiHandlerRegistration registration) {
        registration.addRecipeClickArea(OrganCreatorScreen.class, 60, 30, 20, 30,
                OrganCreationCategory.ORGAN_CREATION_TYPE);
    }
}
