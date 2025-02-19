package net.diice.gloomwoodmod.potion;

import net.diice.gloomwoodmod.GloomwoodMod;
import net.diice.gloomwoodmod.effect.ModEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.network.packet.CustomPayload;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModPotions {
    public static final RegistryEntry<Potion> DETONATION_POTION = registerPotion("detonation potion",
            new Potion(new StatusEffectInstance(ModEffects.DETONATION, 1200, 0)));
    private static RegistryEntry<Potion> registerPotion(String name, Potion potion) {
        return Registry.registerReference(Registries.POTION, Identifier.of(GloomwoodMod.MOD_ID, name), potion);
    }
    public static void registerPotions() {
        GloomwoodMod.LOGGER.info("Registering Potions for " + GloomwoodMod.MOD_ID);
    }
}
