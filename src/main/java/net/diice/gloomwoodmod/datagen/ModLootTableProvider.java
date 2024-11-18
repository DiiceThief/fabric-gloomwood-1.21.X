package net.diice.gloomwoodmod.datagen;

import net.diice.gloomwoodmod.block.ModBlocks;
import net.diice.gloomwoodmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.RAW_RUNESTONE_BLOCK);
        addDrop(ModBlocks.GLOOM_RESIN_BLOCK);
        addDrop(ModBlocks.GLOOMWOOD_LOG);
        addDrop(ModBlocks.GLOOMWOOD_WOOD);
        addDrop(ModBlocks.STRIPPED_GLOOMWOOD_LOG);
        addDrop(ModBlocks.STRIPPED_GLOOMWOOD_WOOD);
        addDrop(ModBlocks.GLOOMWOOD_PLANKS);
        addDrop(ModBlocks.GLOOMWOOD_STAIRS);
        addDrop(ModBlocks.GLOOMWOOD_SLAB);
        addDrop(ModBlocks.GLOOMWOOD_DOOR);
        addDrop(ModBlocks.GLOOMWOOD_FENCE);
        addDrop(ModBlocks.GLOOMWOOD_FENCE_GATE);
        addDrop(ModBlocks.GLOOMWOOD_BUTTON);
        addDrop(ModBlocks.GLOOMWOOD_TRAPDOOR);




    }
}
