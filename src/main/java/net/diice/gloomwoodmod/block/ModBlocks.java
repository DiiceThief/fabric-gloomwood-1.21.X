package net.diice.gloomwoodmod.block;

import com.jcraft.jorbis.Block;
import net.diice.gloomwoodmod.GloomwoodMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block STANDING_RUNE = registerBlock(name: "standing_rune",
        new net.minecraft.block.Block(AbstractBlock.Settings.create().strength(4f);
    .requiresTool(PickaxeItem).sounds(BlockSoundGroup.STONE))

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(GloomwoodMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(GloomwoodMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        GloomwoodMod.LOGGER.info("Registering Mod Blocks for" + GloomwoodMod.MOD_ID);
    }
ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {entries.add(ModBlocks.STANDING_RUNE);

}
