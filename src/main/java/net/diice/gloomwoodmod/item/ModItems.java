package net.diice.gloomwoodmod.item;

import net.diice.gloomwoodmod.GloomwoodMod;
import net.diice.gloomwoodmod.item.custom.GloomDialItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RAW_RUNESTONE = registerItem("raw_runestone", new Item(new Item.Settings()));
    public static final Item GLOOM_RESIN = registerItem("gloom_resin", new Item(new Item.Settings()));

    public static final Item GLOOM_DIAL = registerItem("gloom_dial", new GloomDialItem(new Item.Settings().maxDamage(64)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(GloomwoodMod.MOD_ID, name), item);
    }
    public static void registerModItems(){
        GloomwoodMod.LOGGER.info("Registering Mod Items for" + GloomwoodMod.MOD_ID);
    }
}
