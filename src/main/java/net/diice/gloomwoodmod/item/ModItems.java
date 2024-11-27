package net.diice.gloomwoodmod.item;

import net.diice.gloomwoodmod.GloomwoodMod;
import net.diice.gloomwoodmod.item.custom.GloomDialItem;
import net.diice.gloomwoodmod.item.custom.ModToolMaterials;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RAW_RUNESTONE = registerItem("raw_runestone", new Item(new Item.Settings()));
    public static final Item GLOOM_RESIN = registerItem("gloom_resin", new Item(new Item.Settings()));

    public static final Item GLOOM_RESIN_INGOT = registerItem("gloom_resin_ingot", new Item(new Item.Settings()));
    public static final Item GLOOM_MIXTURE = registerItem("gloom_mixture", new Item(new Item.Settings()));
    public static final Item GLOOM_ALLOY = registerItem("gloom_alloy", new Item(new Item.Settings()));

    public static final Item GLOOM_DIAL = registerItem("gloom_dial", new GloomDialItem(new Item.Settings().maxDamage(64)));

    public static final Item GLOOM_RESIN_SWORD = registerItem("gloom_resin_sword", new SwordItem(ModToolMaterials.GLOOM_RESIN,
            new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.GLOOM_RESIN, 3, -2.4f))));
    public static final Item GLOOM_RESIN_PICKAXE = registerItem("gloom_resin_pickaxe", new PickaxeItem(ModToolMaterials.GLOOM_RESIN,
            new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.GLOOM_RESIN, 3, -2.4f))));
    public static final Item GLOOM_RESIN_AXE = registerItem("gloom_resin_axe", new AxeItem(ModToolMaterials.GLOOM_RESIN,
            new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.GLOOM_RESIN, 6, -3.0f))));
    public static final Item GLOOM_RESIN_SHOVEL = registerItem("gloom_resin_shovel", new ShovelItem(ModToolMaterials.GLOOM_RESIN,
            new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.GLOOM_RESIN, 1.5f, -3.0f))));
    public static final Item GLOOM_RESIN_HOE = registerItem("gloom_resin_hoe", new HoeItem(ModToolMaterials.GLOOM_RESIN,
            new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.GLOOM_RESIN, 0, -3.0f))));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(GloomwoodMod.MOD_ID, name), item);
    }
    public static void registerModItems(){
        GloomwoodMod.LOGGER.info("Registering Mod Items for" + GloomwoodMod.MOD_ID);
    }
}
