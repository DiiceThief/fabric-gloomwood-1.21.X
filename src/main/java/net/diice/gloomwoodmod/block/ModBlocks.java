package net.diice.gloomwoodmod.block;

import net.diice.gloomwoodmod.GloomwoodMod;
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



    public static final Block RAW_RUNESTONE_BLOCK = registerBlock("raw_runestone_block",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block RUNESTONE_ORE = registerBlock("runestone_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3f).requiresTool().sounds(BlockSoundGroup.STONE)));

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
