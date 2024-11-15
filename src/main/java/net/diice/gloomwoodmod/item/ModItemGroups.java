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
                      entries.add(ModBlocks.RAW_RUNESTONE_BLOCK);
                      entries.add(ModBlocks.GLOOMWOOD_PLANKS);
                      entries.add(ModBlocks.GLOOMWOOD_LOG);
                      entries.add(ModBlocks.STRIPPED_GLOOMWOOD_LOG);
                      entries.add(ModBlocks.GLOOMWOOD_WOOD);
                      entries.add(ModBlocks.STRIPPED_GLOOMWOOD_WOOD);

                    }).build());
    public static void registerItemGroups() {
        GloomwoodMod.LOGGER.info("Registering Item Groups for" + GloomwoodMod.MOD_ID);
    }
}
