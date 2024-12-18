package net.diice.gloomwoodmod.datagen;

import net.diice.gloomwoodmod.block.ModBlocks;
import net.diice.gloomwoodmod.block.custom.GloomFruit;
import net.diice.gloomwoodmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.minecraft.network.packet.CustomPayload;
import net.minecraft.util.Identifier;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool gloomwoodplanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GLOOMWOOD_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUNESTONE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GLOOM_RESIN_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_RUNESTONE_BLOCK);

        gloomwoodplanksPool.stairs(ModBlocks.GLOOMWOOD_STAIRS);
        gloomwoodplanksPool.slab(ModBlocks.GLOOMWOOD_SLAB);
        gloomwoodplanksPool.button(ModBlocks.GLOOMWOOD_BUTTON);
        gloomwoodplanksPool.fence(ModBlocks.GLOOMWOOD_FENCE);
        gloomwoodplanksPool.fenceGate(ModBlocks.GLOOMWOOD_FENCE_GATE);
        gloomwoodplanksPool.pressurePlate(ModBlocks.GLOOMWOOD_PRESSURE_PLATE);

        blockStateModelGenerator.registerDoor(ModBlocks.GLOOMWOOD_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.GLOOMWOOD_TRAPDOOR);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RAW_RUNESTONE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GLOOM_RESIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.GLOOM_RESIN_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.GLOOM_DIAL, Models.GENERATED);

        itemModelGenerator.register(ModItems.GLOOM_RESIN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GLOOM_RESIN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GLOOM_RESIN_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GLOOM_RESIN_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GLOOM_RESIN_HOE, Models.HANDHELD);
    }
}
