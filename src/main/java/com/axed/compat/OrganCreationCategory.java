package com.axed.compat;


import com.axed.block.ModBlocks;
import com.axed.recipe.OrganCreatorRecipe;
import com.axed.sosorgans;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

public class OrganCreationCategory implements IRecipeCategory<OrganCreatorRecipe> {
    public static final ResourceLocation UID = new ResourceLocation(sosorgans.MODID, "gem_polishing");
    public static final ResourceLocation TEXTURE = new ResourceLocation(sosorgans.MODID,
            "textures/gui/gem_polishing_station_gui.png");

    public static final RecipeType<OrganCreatorRecipe> ORGAN_CREATION_TYPE =
            new RecipeType<>(UID, OrganCreatorRecipe.class);

    private final IDrawable background;
    private final IDrawable icon;

    public OrganCreationCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 85);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(ModBlocks.ORGAN_CREATOR.get()));
    }

    @Override
    public RecipeType<OrganCreatorRecipe> getRecipeType() {
        return ORGAN_CREATION_TYPE;
    }

    @Override
    public Component getTitle() {
        return Component.translatable("block.sosorgans.organ_creator");
    }

    @Override
    public IDrawable getBackground() {
        return this.background;
    }

    @Override
    public IDrawable getIcon() {
        return this.icon;
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, OrganCreatorRecipe recipe, IFocusGroup focuses) {
        builder.addSlot(RecipeIngredientRole.INPUT, 80, 11).addIngredients(recipe.getIngredients().get(0));

        builder.addSlot(RecipeIngredientRole.OUTPUT, 80, 59).addItemStack(recipe.getResultItem(null));
    }
}
