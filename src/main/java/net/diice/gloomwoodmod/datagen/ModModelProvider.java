package net.diice.gloomwoodmod.datagen;

import net.diice.gloomwoodmod.block.ModBlocks;
import net.diice.gloomwoodmod.block.custom.ResinLamp;
import net.diice.gloomwoodmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.MossBlock;
import net.minecraft.data.client.*;
import net.minecraft.item.ArmorItem;
import net.minecraft.network.packet.CustomPayload;
import net.minecraft.util.Identifier;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUNESTONE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GLOOM_RESIN_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_RUNESTONE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GLOOM_STEEL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GLOOM_RESIN_INGOT_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GLOOM_STONE);
        blockStateModelGenerator.registerSingleton(ModBlocks.GLOOM_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.GLOOMWOOD_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        BlockStateModelGenerator.BlockTexturePool gloomwoodplanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GLOOMWOOD_PLANKS);
        gloomwoodplanksPool.stairs(ModBlocks.GLOOMWOOD_STAIRS);
        gloomwoodplanksPool.slab(ModBlocks.GLOOMWOOD_SLAB);
        gloomwoodplanksPool.button(ModBlocks.GLOOMWOOD_BUTTON);
        gloomwoodplanksPool.fence(ModBlocks.GLOOMWOOD_FENCE);
        gloomwoodplanksPool.fenceGate(ModBlocks.GLOOMWOOD_FENCE_GATE);
        gloomwoodplanksPool.pressurePlate(ModBlocks.GLOOMWOOD_PRESSURE_PLATE);

        blockStateModelGenerator.registerDoor(ModBlocks.GLOOMWOOD_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.GLOOMWOOD_TRAPDOOR);

        blockStateModelGenerator.registerLog(ModBlocks.GLOOMWOOD_LOG).log(ModBlocks.GLOOMWOOD_LOG).wood(ModBlocks.GLOOMWOOD_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_GLOOMWOOD_LOG).log(ModBlocks.STRIPPED_GLOOMWOOD_LOG).wood(ModBlocks.STRIPPED_GLOOMWOOD_WOOD);

        Identifier lampOffIdentifier = TexturedModel.CUBE_ALL.upload(ModBlocks.RESIN_LAMP, blockStateModelGenerator.modelCollector);
        Identifier lampOnIdentifier = blockStateModelGenerator.createSubModel(ModBlocks.RESIN_LAMP, "_on", Models.CUBE_ALL, TextureMap::all);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(ModBlocks.RESIN_LAMP)
                .coordinate(BlockStateModelGenerator.createBooleanModelMap(ResinLamp.CLICKED, lampOnIdentifier, lampOffIdentifier)));
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RAW_RUNESTONE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GLOOM_RESIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.GLOOM_RESIN_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.GLOOM_STEEL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.GLOOM_ALLOY, Models.GENERATED);
        itemModelGenerator.register(ModItems.GLOOM_MIXTURE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ERUPTIVE_REEDS, Models.GENERATED);

        itemModelGenerator.register(ModItems.GLOOM_DIAL, Models.GENERATED);

        itemModelGenerator.register(ModItems.GLOOM_RESIN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GLOOM_RESIN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GLOOM_RESIN_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GLOOM_RESIN_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GLOOM_RESIN_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.GLOOM_STEEL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GLOOM_STEEL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GLOOM_STEEL_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GLOOM_STEEL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GLOOM_STEEL_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.GLOOM_RESIN_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.GLOOM_RESIN_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.GLOOM_RESIN_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.GLOOM_RESIN_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.GLOOM_STEEL_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.GLOOM_STEEL_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.GLOOM_STEEL_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.GLOOM_STEEL_BOOTS));

    }
}
