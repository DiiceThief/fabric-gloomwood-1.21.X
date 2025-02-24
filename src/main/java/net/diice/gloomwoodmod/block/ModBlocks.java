package net.diice.gloomwoodmod.block;

import com.sun.jna.platform.unix.solaris.Kstat2StatusException;
import net.diice.gloomwoodmod.GloomwoodMod;
import net.diice.gloomwoodmod.block.custom.ResinLamp;
import net.diice.gloomwoodmod.block.custom.ResinLamp;
import net.diice.gloomwoodmod.world.tree.ModSaplingGenerators;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
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
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final Block GLOOMWOOD_WOOD = registerBlock("gloomwood_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_GLOOMWOOD_WOOD = registerBlock("stripped_gloomwood_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block GLOOMWOOD_LEAVES = registerBlock("gloom_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)));
public static final Block GLOOMWOOD_PLANKS = registerBlock("gloomwood_planks",
        new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block GLOOMWOOD_SAPLING = registerBlock("gloomwood_sapling",
            new SaplingBlock(ModSaplingGenerators.GLOOMWOOD, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));

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
    public static final Block GLOOMWOOD_SIGN = registerBlock("gloomwood_sign",
            new SignBlock(WoodType.OAK, AbstractBlock.Settings.create().strength(2f).requiresTool().nonOpaque().noCollision()));

public static final Block RESIN_LAMP = registerBlock("resin_lamp",
        new ResinLamp(AbstractBlock.Settings.create().strength(1f).requiresTool().luminance(state -> state.get(ResinLamp.CLICKED) ? 15 : 0)));

    public static final Block RAW_RUNESTONE_BLOCK = registerBlock("raw_runestone_block",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block GLOOM_STONE = registerBlock("gloom_stone",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block RUNESTONE_ORE = registerBlock("runestone_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block GLOOM_RESIN_BLOCK = registerBlock("gloom_resin_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.BONE)));

    public static final Block GLOOM_RESIN_INGOT_BLOCK = registerBlock("gloom_resin_ingot_block",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.METAL)));

    public static final Block GLOOM_STEEL_BLOCK = registerBlock("gloom_steel_block",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.METAL)));



    public static final Block ERUPTIVE_REEDS = registerBlock(
            "eruptive_reeds",
            new SugarCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN)
                            .noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );



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
