package net.diice.gloomwoodmod.datagen;

import net.diice.gloomwoodmod.block.ModBlocks;
import net.diice.gloomwoodmod.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

import static net.minecraft.registry.tag.BlockTags.*;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(AXE_MINEABLE)
                .add(ModBlocks.GLOOMWOOD_LOG)
                .add(ModBlocks.STRIPPED_GLOOMWOOD_LOG)
                .add(ModBlocks.GLOOMWOOD_WOOD)
                .add(ModBlocks.STRIPPED_GLOOMWOOD_WOOD)
                .add(ModBlocks.GLOOMWOOD_PLANKS)
                .add(ModBlocks.GLOOMWOOD_SLAB)
                .add(ModBlocks.GLOOMWOOD_STAIRS)
                .add(ModBlocks.GLOOMWOOD_BUTTON)
                .add(ModBlocks.GLOOMWOOD_DOOR)
                .add(ModBlocks.GLOOMWOOD_TRAPDOOR)
                .add(ModBlocks.GLOOMWOOD_FENCE)
                .add(ModBlocks.GLOOMWOOD_FENCE_GATE)
                .add(ModBlocks.GLOOMWOOD_PRESSURE_PLATE);

        getOrCreateTagBuilder(PICKAXE_MINEABLE)
                .add(ModBlocks.RAW_RUNESTONE_BLOCK)
                .add(ModBlocks.RUNESTONE_ORE)
                .add(ModBlocks.GLOOM_RESIN_INGOT_BLOCK);

        getOrCreateTagBuilder(NEEDS_IRON_TOOL)
                .add(ModBlocks.RAW_RUNESTONE_BLOCK)
                .add(ModBlocks.RUNESTONE_ORE)
                .add(ModBlocks.GLOOM_RESIN_INGOT_BLOCK);

        getOrCreateTagBuilder(WOODEN_FENCES).add(ModBlocks.GLOOMWOOD_FENCE);
        getOrCreateTagBuilder(FENCE_GATES).add(ModBlocks.GLOOMWOOD_FENCE_GATE);

        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_GLOOM_RESIN_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);

        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_GLOOM_STEEL_TOOL)
                .addTag(NEEDS_DIAMOND_TOOL);

    }
}
