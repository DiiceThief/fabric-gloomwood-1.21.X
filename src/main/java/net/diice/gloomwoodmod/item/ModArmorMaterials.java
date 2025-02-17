package net.diice.gloomwoodmod.item;

import net.diice.gloomwoodmod.GloomwoodMod;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Arm;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;
public class ModArmorMaterials {

    public static final RegistryEntry<ArmorMaterial> GLOOM_RESIN_ARMOR_MATERIAL = registerArmorMaterial("gloom_resin",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.LEGGINGS,6);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.BODY, 11);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_IRON, () -> Ingredient.ofItems(ModItems.GLOOM_RESIN_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(GloomwoodMod.MOD_ID, "gloom_resin"))), 0, 0));

        public static final RegistryEntry<ArmorMaterial> GLOOM_STEEL_ARMOR_MATERIAL = registerArmorMaterial("gloom_steel",
                () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                    map.put(ArmorItem.Type.BOOTS, 4);
                    map.put(ArmorItem.Type.LEGGINGS,7);
                    map.put(ArmorItem.Type.CHESTPLATE, 9);
                    map.put(ArmorItem.Type.HELMET, 4);
                    map.put(ArmorItem.Type.BODY, 12);
                }), 20, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ModItems.GLOOM_STEEL_INGOT),
                        List.of(new ArmorMaterial.Layer(Identifier.of(GloomwoodMod.MOD_ID, "gloom_steel"))), 0, 0));

        public static RegistryEntry<ArmorMaterial> registerArmorMaterial(String name, Supplier<ArmorMaterial> material) {
            return Registry.registerReference(Registries.ARMOR_MATERIAL, Identifier.of(GloomwoodMod.MOD_ID, name), material.get());
    }
}
