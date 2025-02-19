package net.diice.gloomwoodmod;

import net.diice.gloomwoodmod.block.ModBlocks;
import net.diice.gloomwoodmod.component.ModDataComponentTypes;
import net.diice.gloomwoodmod.effect.ModEffects;
import net.diice.gloomwoodmod.item.ModItemGroups;
import net.diice.gloomwoodmod.item.ModItems;
import net.diice.gloomwoodmod.potion.ModPotions;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistryBuilder;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.potion.Potions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GloomwoodMod implements ModInitializer {
	public static final String MOD_ID = "gloomwood-mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModEffects.registerEffects();
		ModPotions.registerPotions();

		ModDataComponentTypes.registerDataComponentTypes();

		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(Potions.AWKWARD, ModItems.ERUPTIVE_REEDS, ModPotions.DETONATION_POTION);
		});

		FuelRegistry.INSTANCE.add(ModItems.GLOOM_RESIN, 800);
		FuelRegistry.INSTANCE.add(ModBlocks.GLOOM_RESIN_BLOCK, 8000);

	}
}