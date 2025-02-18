package net.diice.gloomwoodmod.effect;

import net.diice.gloomwoodmod.GloomwoodMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModEffects {
    public static final RegistryEntry<StatusEffect> DETONATION = registerStatusEffect("detonation",
            new DetonationEffect(StatusEffectCategory.NEUTRAL, 0xff004f)
                    .addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED,
                            Identifier.of(GloomwoodMod.MOD_ID, "detonation"), +0.25f,
            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));

    private static RegistryEntry<StatusEffect> registerStatusEffect(String name, StatusEffect statusEffect) {
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(GloomwoodMod.MOD_ID, name), statusEffect);
    }
    public static void  registerEffects() {
        GloomwoodMod.LOGGER.info("Registering Mod Effects for " + GloomwoodMod.MOD_ID);
    }
}
