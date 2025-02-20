package net.diice.gloomwoodmod.world.tree;

import net.diice.gloomwoodmod.GloomwoodMod;
import net.diice.gloomwoodmod.world.ModConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;
import net.minecraft.entity.attribute.EntityAttributeModifier;

import java.util.Optional;

public class ModSaplingGenerators {
    public static final SaplingGenerator GLOOMWOOD = new SaplingGenerator(GloomwoodMod.MOD_ID + ":gloomwood",
            Optional.empty(), Optional.of(ModConfiguredFeatures.GLOOMWOOD_KEY), Optional.empty());
}
