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
public static final Item GLOOM_STEEL_INGOT = registerItem("gloom_steel_ingot", new Item(new Item.Settings()));

public static final Item ERUPTIVE_REEDS = registerItem("eruptive_reeds", new Item(new Item.Settings()));

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

    public static final Item GLOOM_STEEL_SWORD = registerItem("gloom_steel_sword", new SwordItem(ModToolMaterials.GLOOM_STEEL,
            new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.GLOOM_STEEL, 3, -2.4f))));

    public static final Item GLOOM_STEEL_PICKAXE = registerItem("gloom_steel_pickaxe", new PickaxeItem(ModToolMaterials.GLOOM_STEEL,
            new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.GLOOM_STEEL, 3, -2.4f))));

    public static final Item GLOOM_STEEL_AXE = registerItem("gloom_steel_axe", new AxeItem(ModToolMaterials.GLOOM_STEEL,
            new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.GLOOM_STEEL, 6, -3.0f))));

    public static final Item GLOOM_STEEL_SHOVEL = registerItem("gloom_steel_shovel", new ShovelItem(ModToolMaterials.GLOOM_STEEL,
            new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.GLOOM_STEEL, 1.5f, -3.0f))));

    public static final Item GLOOM_STEEL_HOE = registerItem("gloom_steel_hoe", new HoeItem(ModToolMaterials.GLOOM_STEEL,
            new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.GLOOM_STEEL, 0, -3.0f))));

    public static final Item GLOOM_RESIN_HELMET = registerItem("gloom_resin_helmet",
            new ArmorItem(ModArmorMaterials.GLOOM_RESIN_ARMOR_MATERIAL,
                    ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(35))));
    public static final Item GLOOM_RESIN_CHESTPLATE = registerItem("gloom_resin_chestplate",
            new ArmorItem(ModArmorMaterials.GLOOM_RESIN_ARMOR_MATERIAL,
                    ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(35))));
    public static final Item GLOOM_RESIN_LEGGINGS = registerItem("gloom_resin_leggings",
            new ArmorItem(ModArmorMaterials.GLOOM_RESIN_ARMOR_MATERIAL,
                    ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(35))));
    public static final Item GLOOM_RESIN_BOOTS = registerItem("gloom_resin_boots",
            new ArmorItem(ModArmorMaterials.GLOOM_RESIN_ARMOR_MATERIAL,
                    ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(35))));

    public static final Item GLOOM_STEEL_BOOTS = registerItem("gloom_steel_boots",
            new ArmorItem(ModArmorMaterials.GLOOM_STEEL_ARMOR_MATERIAL,
                    ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(40))));
    public static final Item GLOOM_STEEL_LEGGINGS = registerItem("gloom_steel_leggings",
            new ArmorItem(ModArmorMaterials.GLOOM_STEEL_ARMOR_MATERIAL,
                    ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(40))));
    public static final Item GLOOM_STEEL_CHESTPLATE = registerItem("gloom_steel_chestplate",
            new ArmorItem(ModArmorMaterials.GLOOM_STEEL_ARMOR_MATERIAL,
                    ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(40))));
    public static final Item GLOOM_STEEL_HELMET = registerItem("gloom_steel_helmet",
            new ArmorItem(ModArmorMaterials.GLOOM_STEEL_ARMOR_MATERIAL,
                    ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(40))));

    public static final Item RESIN_BOW = registerItem("resin_bow",
            new BowItem(new Item.Settings().maxDamage(770)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(GloomwoodMod.MOD_ID, name), item);
    }
    public static void registerModItems(){
        GloomwoodMod.LOGGER.info("Registering Mod Items for" + GloomwoodMod.MOD_ID);
    }
}
