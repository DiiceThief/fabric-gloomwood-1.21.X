package net.diice.gloomwoodmod.datagen;

import net.diice.gloomwoodmod.block.ModBlocks;
import net.diice.gloomwoodmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUNESTONE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GLOOM_RESIN_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GLOOMWOOD_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_RUNESTONE_BLOCK);



    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RAW_RUNESTONE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GLOOM_RESIN, Models.GENERATED);

        itemModelGenerator.register(ModItems.GLOOM_DIAL, Models.GENERATED);

    }
}
