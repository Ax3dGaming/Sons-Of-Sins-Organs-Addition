package com.axed.compat;

import com.axed.block.ModBlocks;
import com.axed.block.entity.ModBlockEntities;
import com.axed.recipe.ModRecipes;
import com.axed.recipe.OrganCreatorRecipe;
import com.axed.screen.ModMenuTypes;
import com.axed.screen.OrganCreatorMenu;
import com.axed.screen.OrganCreatorScreen;
import com.axed.sosorgans;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.*;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
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

    public void registerRecipeTransferHandlers(IRecipeTransferRegistration registration) {
        registration.addRecipeTransferHandler(OrganCreatorMenu.class, ModMenuTypes.ORGAN_CREATOR_MENU.get(), OrganCreationCategory.ORGAN_CREATION_TYPE, 36, 2, 0, 36);
    }

    @Override
    public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
        registration.addRecipeCatalyst(new ItemStack(ModBlocks.ORGAN_CREATOR.get()), OrganCreationCategory.ORGAN_CREATION_TYPE);
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager recipeManager = Minecraft.getInstance().level.getRecipeManager();

        List<OrganCreatorRecipe> organRecipes = recipeManager.getAllRecipesFor(OrganCreatorRecipe.Type.INSTANCE);
        registration.addRecipes(OrganCreationCategory.ORGAN_CREATION_TYPE, organRecipes);
    }

    @Override
    public void registerGuiHandlers(IGuiHandlerRegistration registration) {
        registration.addRecipeClickArea(OrganCreatorScreen.class, 84, 30, 8, 26,
                OrganCreationCategory.ORGAN_CREATION_TYPE);
    }
}
