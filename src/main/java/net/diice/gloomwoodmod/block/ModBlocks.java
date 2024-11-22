package net.diice.gloomwoodmod.block;

import net.diice.gloomwoodmod.GloomwoodMod;
import net.diice.gloomwoodmod.block.custom.GloomFruit;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Block GLOOMWOOD_LOG = registerBlock("gloomwood_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG).strength(2f)
                    .sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block STRIPPED_GLOOMWOOD_LOG = registerBlock("stripped_gloomwood_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG).strength(2f)
                    .sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block GLOOMWOOD_WOOD = registerBlock("gloomwood_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD).strength(2f)
                    .sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block STRIPPED_GLOOMWOOD_WOOD = registerBlock("stripped_gloomwood_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD).strength(2f)
                    .sounds(BlockSoundGroup.WOOD).burnable()));
public static final Block GLOOMWOOD_PLANKS = registerBlock("gloomwood_planks",
        new Block(AbstractBlock.Settings.create().strength(2f).burnable()));

public static final Block GLOOMWOOD_STAIRS = registerBlock("gloomwood_stairs",
        new StairsBlock(ModBlocks.GLOOMWOOD_PLANKS.getDefaultState(),
                AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block GLOOMWOOD_SLAB = registerBlock("gloomwood_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));

    public static final Block GLOOMWOOD_BUTTON = registerBlock("gloomwood_button",
            new ButtonBlock(BlockSetType.OAK, 15,
                    AbstractBlock.Settings.create().strength(2f).requiresTool().noCollision()));
    public static final Block GLOOMWOOD_PRESSURE_PLATE = registerBlock("gloomwood_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, AbstractBlock.Settings.create().strength(2f).requiresTool()));

    public static final Block GLOOMWOOD_FENCE = registerBlock("gloomwood_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block GLOOMWOOD_FENCE_GATE = registerBlock("gloomwood_fence_gate",
            new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block GLOOMWOOD_DOOR = registerBlock("gloomwood_door",
            new DoorBlock(BlockSetType.OAK, AbstractBlock.Settings.create().strength(2f).requiresTool().nonOpaque()));
    public static final Block GLOOMWOOD_TRAPDOOR = registerBlock("gloomwood_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK, AbstractBlock.Settings.create().strength(2f).requiresTool().nonOpaque()));



    public static final Block RAW_RUNESTONE_BLOCK = registerBlock("raw_runestone_block",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block RUNESTONE_ORE = registerBlock("runestone_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block GLOOM_RESIN_BLOCK = registerBlock("gloom_resin_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.BONE)));

    public static final Block GLOOM_FRUIT = registerBlock("gloom_fruit",
            new GloomFruit(AbstractBlock.Settings.create()
                    .strength(3f).requiresTool().luminance(state -> state.get(GloomFruit.CLICKED) ? 15 : 0)));



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(GloomwoodMod.MOD_ID, name), block);
    }


    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(GloomwoodMod.MOD_ID, name),
        new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        GloomwoodMod.LOGGER.info("Registering Mod Blocks for " + GloomwoodMod.MOD_ID);

    }
}
