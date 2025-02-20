package net.diice.gloomwoodmod.item;

import net.diice.gloomwoodmod.GloomwoodMod;
import net.diice.gloomwoodmod.block.ModBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup GLOOMWOOD_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(GloomwoodMod.MOD_ID, "gloomwood_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.RAW_RUNESTONE))
                    .displayName(Text.translatable("itemgroup.gloomwood-mod.gloomwood_items"))
                    .entries((displayContext, entries) -> {
                      entries.add(ModItems.RAW_RUNESTONE);
                      entries.add(ModItems.GLOOM_RESIN);
                      entries.add(ModItems.GLOOM_RESIN_INGOT);
                      entries.add(ModItems.GLOOM_DIAL);
                      entries.add(ModItems.GLOOM_ALLOY);
                      entries.add(ModItems.GLOOM_MIXTURE);
                      entries.add(ModItems.GLOOM_STEEL_INGOT);
                      entries.add(ModItems.ERUPTIVE_REEDS);

                      entries.add(ModItems.GLOOM_RESIN_SWORD);
                        entries.add(ModItems.GLOOM_RESIN_PICKAXE);
                        entries.add(ModItems.GLOOM_RESIN_AXE);
                        entries.add(ModItems.GLOOM_RESIN_SHOVEL);
                        entries.add(ModItems.GLOOM_RESIN_HOE);

                        entries.add(ModItems.GLOOM_STEEL_SWORD);
                        entries.add(ModItems.GLOOM_STEEL_PICKAXE);
                        entries.add(ModItems.GLOOM_STEEL_AXE);
                        entries.add(ModItems.GLOOM_STEEL_SHOVEL);
                        entries.add(ModItems.GLOOM_STEEL_HOE);

                        entries.add(ModItems.GLOOM_RESIN_HELMET);
                        entries.add(ModItems.GLOOM_RESIN_CHESTPLATE);
                        entries.add(ModItems.GLOOM_RESIN_LEGGINGS);
                        entries.add(ModItems.GLOOM_RESIN_BOOTS);

                        entries.add(ModItems.GLOOM_STEEL_HELMET);
                        entries.add(ModItems.GLOOM_STEEL_CHESTPLATE);
                        entries.add(ModItems.GLOOM_STEEL_LEGGINGS);
                        entries.add(ModItems.GLOOM_STEEL_BOOTS);

                        entries.add(ModItems.RESIN_BOW);

                      entries.add(ModBlocks.RAW_RUNESTONE_BLOCK);
                      entries.add(ModBlocks.RUNESTONE_ORE);
                      entries.add(ModBlocks.GLOOM_STONE);

                      entries.add(ModBlocks.GLOOMWOOD_PLANKS);
                      entries.add(ModBlocks.GLOOMWOOD_LOG);
                      entries.add(ModBlocks.STRIPPED_GLOOMWOOD_LOG);
                      entries.add(ModBlocks.GLOOMWOOD_WOOD);
                      entries.add(ModBlocks.STRIPPED_GLOOMWOOD_WOOD);
                      entries.add(ModBlocks.GLOOMWOOD_STAIRS);
                      entries.add(ModBlocks.GLOOMWOOD_BUTTON);
                      entries.add(ModBlocks.GLOOMWOOD_DOOR);
                      entries.add(ModBlocks.GLOOMWOOD_FENCE);
                      entries.add(ModBlocks.GLOOMWOOD_SLAB);
                      entries.add(ModBlocks.GLOOMWOOD_FENCE_GATE);
                      entries.add(ModBlocks.GLOOMWOOD_PRESSURE_PLATE);
                      entries.add(ModBlocks.GLOOMWOOD_TRAPDOOR);
                      entries.add(ModBlocks.GLOOM_LEAVES);
                      entries.add(ModBlocks.GLOOMWOOD_SIGN);

                      entries.add(ModBlocks.GLOOM_RESIN_BLOCK);
                      entries.add(ModBlocks.GLOOM_RESIN_INGOT_BLOCK);
                      entries.add(ModBlocks.GLOOM_STEEL_BLOCK);

                     entries.add(ModBlocks.RESIN_LAMP);
                      entries.add(ModBlocks.GLOOMWOOD_SAPLING);

                    }).build());
    public static void registerItemGroups() {
        GloomwoodMod.LOGGER.info("Registering Item Groups for" + GloomwoodMod.MOD_ID);
    }
}
