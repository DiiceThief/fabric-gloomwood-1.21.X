package net.diice.gloomwoodmod.datagen;

import net.diice.gloomwoodmod.GloomwoodMod;
import net.diice.gloomwoodmod.block.ModBlocks;
import net.diice.gloomwoodmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.server.recipe.CraftingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.ShapedRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {

        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModItems.GLOOM_RESIN, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GLOOM_RESIN_BLOCK);
        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_RUNESTONE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_RUNESTONE_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GLOOM_DIAL)
                .pattern("GRG")
                .pattern("LEL")
                .pattern("GRG")
                .input('G', Items.GOLD_INGOT)
                .input('R', Items.REDSTONE)
                .input('L', Items.LAPIS_LAZULI)
                .input('E', Items.EMERALD)
                .criterion(hasItem(ModItems.GLOOM_DIAL), conditionsFromItem(ModItems.GLOOM_DIAL))
                .offerTo(recipeExporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GLOOM_RESIN, 9)
                .input(ModBlocks.GLOOM_RESIN_BLOCK)
                .criterion(hasItem(ModBlocks.GLOOM_RESIN_BLOCK), conditionsFromItem(ModBlocks.GLOOM_RESIN_BLOCK))
                .offerTo(recipeExporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_RUNESTONE, 9)
                .input(ModBlocks.RAW_RUNESTONE_BLOCK)
                .criterion(hasItem(ModBlocks.RAW_RUNESTONE_BLOCK), conditionsFromItem(ModBlocks.RAW_RUNESTONE_BLOCK))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.GLOOMWOOD_DOOR, 3)
                .input('P', ModBlocks.GLOOMWOOD_PLANKS)
                .pattern("PP")
                .pattern("PP")
                .pattern("PP")
                .criterion(hasItem(ModBlocks.GLOOMWOOD_PLANKS), conditionsFromItem(ModBlocks.GLOOMWOOD_PLANKS))
                .offerTo(recipeExporter);
        }
    }

