package net.diice.gloomwoodmod.datagen;

import net.diice.gloomwoodmod.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
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

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.RAW_RUNESTONE_BLOCK)
                .add(ModBlocks.RUNESTONE_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.RAW_RUNESTONE_BLOCK)
                .add(ModBlocks.RUNESTONE_ORE);
    }
}
