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

        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.BUILDING_BLOCKS,
                ModItems.GLOOM_RESIN, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GLOOM_RESIN_BLOCK);
        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.BUILDING_BLOCKS,
                ModItems.RAW_RUNESTONE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_RUNESTONE_BLOCK);
        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.BUILDING_BLOCKS,
                ModItems.GLOOM_STEEL_INGOT, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GLOOM_STEEL_BLOCK);

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

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GLOOM_MIXTURE)
                .pattern("$#")
                .input('$', ModItems.GLOOM_RESIN)
                .input('#', ModItems.RAW_RUNESTONE)
                .criterion(hasItem(ModItems.GLOOM_RESIN), conditionsFromItem(ModItems.GLOOM_RESIN))
                .offerTo(recipeExporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GLOOMWOOD_PLANKS, 4)
                .input(ModBlocks.GLOOMWOOD_LOG)
                .criterion(hasItem(ModBlocks.GLOOMWOOD_LOG), conditionsFromItem(ModBlocks.GLOOMWOOD_LOG))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GLOOMWOOD_WOOD, 3)
                .pattern("##")
                .pattern("##")
                .input('#', ModBlocks.GLOOMWOOD_LOG)
                .criterion(hasItem(ModBlocks.GLOOMWOOD_LOG), conditionsFromItem(ModBlocks.GLOOMWOOD_LOG))
                .offerTo(recipeExporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.GLOOMWOOD_BUTTON, 1)
                .input(ModBlocks.GLOOMWOOD_PLANKS)
                .criterion(hasItem(ModBlocks.GLOOMWOOD_PLANKS), conditionsFromItem(ModBlocks.GLOOMWOOD_PLANKS))
                .offerTo(recipeExporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.GLOOMWOOD_PRESSURE_PLATE, 1)
                .pattern("##")
                .input('#', ModBlocks.GLOOMWOOD_PLANKS)
                .criterion(hasItem(ModBlocks.GLOOMWOOD_PLANKS), conditionsFromItem(ModBlocks.GLOOMWOOD_PLANKS))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.GLOOMWOOD_TRAPDOOR, 2)
                .pattern("###")
                .pattern("###")
                .input('#', ModBlocks.GLOOMWOOD_PLANKS)
                .criterion(hasItem(ModBlocks.GLOOMWOOD_PLANKS), conditionsFromItem(ModBlocks.GLOOMWOOD_PLANKS))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_GLOOMWOOD_WOOD, 3)
                .pattern("##")
                .pattern("##")
                .input('#', ModBlocks.STRIPPED_GLOOMWOOD_LOG)
                .criterion(hasItem(ModBlocks.STRIPPED_GLOOMWOOD_LOG), conditionsFromItem(ModBlocks.STRIPPED_GLOOMWOOD_LOG))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.GLOOM_RESIN_SWORD, 1)
                .pattern("#")
                .pattern("#")
                .pattern("S")
                .input('#', ModItems.GLOOM_RESIN_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.GLOOM_RESIN_INGOT), conditionsFromItem(ModItems.GLOOM_RESIN_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.GLOOM_STEEL_SWORD, 1)
                .pattern("#")
                .pattern("#")
                .pattern("S")
                .input('#', ModItems.GLOOM_STEEL_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.GLOOM_STEEL_INGOT), conditionsFromItem(ModItems.GLOOM_STEEL_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.GLOOM_RESIN_PICKAXE, 1)
                .pattern("###")
                .pattern(" S ")
                .pattern(" S ")
                .input('#', ModItems.GLOOM_RESIN_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.GLOOM_RESIN_INGOT), conditionsFromItem(ModItems.GLOOM_RESIN_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.GLOOM_STEEL_PICKAXE, 1)
                .pattern("###")
                .pattern(" S ")
                .pattern(" S ")
                .input('#', ModItems.GLOOM_STEEL_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.GLOOM_STEEL_INGOT), conditionsFromItem(ModItems.GLOOM_STEEL_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.GLOOM_RESIN_AXE, 1)
                .pattern("##")
                .pattern("#S")
                .pattern(" S")
                .input('#', ModItems.GLOOM_RESIN_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.GLOOM_RESIN_INGOT), conditionsFromItem(ModItems.GLOOM_RESIN_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.GLOOM_STEEL_AXE, 1)
                .pattern("##")
                .pattern("#S")
                .pattern(" S")
                .input('#', ModItems.GLOOM_STEEL_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.GLOOM_STEEL_INGOT), conditionsFromItem(ModItems.GLOOM_STEEL_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.GLOOM_RESIN_SHOVEL, 1)
                .pattern("#")
                .pattern("S")
                .pattern("S")
                .input('#', ModItems.GLOOM_RESIN_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.GLOOM_RESIN_INGOT), conditionsFromItem(ModItems.GLOOM_RESIN_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.GLOOM_STEEL_SHOVEL, 1)
                .pattern("#")
                .pattern("S")
                .pattern("S")
                .input('#', ModItems.GLOOM_STEEL_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.GLOOM_STEEL_INGOT), conditionsFromItem(ModItems.GLOOM_STEEL_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.GLOOM_RESIN_HOE, 1)
                .pattern("##")
                .pattern(" S")
                .pattern(" S")
                .input('#', ModItems.GLOOM_RESIN_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.GLOOM_RESIN_INGOT), conditionsFromItem(ModItems.GLOOM_RESIN_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.GLOOM_STEEL_HOE, 1)
                .pattern("##")
                .pattern(" S")
                .pattern(" S")
                .input('#', ModItems.GLOOM_STEEL_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.GLOOM_STEEL_INGOT), conditionsFromItem(ModItems.GLOOM_STEEL_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.GLOOM_RESIN_HELMET, 1)
                .pattern("###")
                .pattern("# #")
                .input('#', ModItems.GLOOM_RESIN_INGOT)
                .criterion(hasItem(ModItems.GLOOM_RESIN_INGOT), conditionsFromItem(ModItems.GLOOM_RESIN_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.GLOOM_RESIN_BOOTS, 1)
                .pattern("# #")
                .pattern("# #")
                .input('#', ModItems.GLOOM_RESIN_INGOT)
                .criterion(hasItem(ModItems.GLOOM_RESIN_INGOT), conditionsFromItem(ModItems.GLOOM_RESIN_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.GLOOM_RESIN_LEGGINGS, 1)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .input('#', ModItems.GLOOM_RESIN_INGOT)
                .criterion(hasItem(ModItems.GLOOM_RESIN_INGOT), conditionsFromItem(ModItems.GLOOM_RESIN_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.GLOOM_RESIN_CHESTPLATE, 1)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.GLOOM_RESIN_INGOT)
                .criterion(hasItem(ModItems.GLOOM_RESIN_INGOT), conditionsFromItem(ModItems.GLOOM_RESIN_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.GLOOM_STEEL_HELMET, 1)
                .pattern("###")
                .pattern("# #")
                .input('#', ModItems.GLOOM_STEEL_INGOT)
                .criterion(hasItem(ModItems.GLOOM_STEEL_INGOT), conditionsFromItem(ModItems.GLOOM_STEEL_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.GLOOM_STEEL_BOOTS, 1)
                .pattern("# #")
                .pattern("# #")
                .input('#', ModItems.GLOOM_STEEL_INGOT)
                .criterion(hasItem(ModItems.GLOOM_STEEL_INGOT), conditionsFromItem(ModItems.GLOOM_STEEL_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.GLOOM_STEEL_LEGGINGS, 1)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .input('#', ModItems.GLOOM_STEEL_INGOT)
                .criterion(hasItem(ModItems.GLOOM_STEEL_INGOT), conditionsFromItem(ModItems.GLOOM_STEEL_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.GLOOM_STEEL_CHESTPLATE, 1)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.GLOOM_STEEL_INGOT)
                .criterion(hasItem(ModItems.GLOOM_STEEL_INGOT), conditionsFromItem(ModItems.GLOOM_STEEL_INGOT))
                .offerTo(recipeExporter);
    }
}