package net.diice.gloomwoodmod.datagen;

import net.diice.gloomwoodmod.item.ModItems;
import net.diice.gloomwoodmod.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.Items.TRANSFORMABLE_ITEMS)
                .add(Items.ACACIA_LOG)
                .add(Items.BIRCH_LOG)
                .add(Items.SPRUCE_LOG)
                .add(Items.OAK_LOG)
                .add(Items.DARK_OAK_LOG)
                .add(Items.MANGROVE_LOG)
                .add(Items.JUNGLE_LOG)
                .add(Items.CHERRY_LOG)
                .add(Items.COAL_BLOCK)
                .add(Items.IRON_ORE);

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.GLOOM_RESIN_SWORD);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.GLOOM_RESIN_PICKAXE);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.GLOOM_RESIN_AXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.GLOOM_RESIN_SHOVEL);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.GLOOM_RESIN_HOE);

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.GLOOM_RESIN_HELMET)
                .add(ModItems.GLOOM_RESIN_CHESTPLATE)
                .add(ModItems.GLOOM_RESIN_LEGGINGS)
                .add(ModItems.GLOOM_RESIN_BOOTS);
    }
}
