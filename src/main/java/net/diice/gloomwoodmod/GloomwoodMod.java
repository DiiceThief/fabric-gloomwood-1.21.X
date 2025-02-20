package net.diice.gloomwoodmod;

import net.diice.gloomwoodmod.block.ModBlocks;
import net.diice.gloomwoodmod.component.ModDataComponentTypes;
import net.diice.gloomwoodmod.effect.ModEffects;
import net.diice.gloomwoodmod.item.ModItemGroups;
import net.diice.gloomwoodmod.item.ModItems;
import net.diice.gloomwoodmod.potion.ModPotions;
import net.diice.gloomwoodmod.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistryBuilder;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
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

		ModWorldGeneration.generateWorldGen();
		FuelRegistry.INSTANCE.add(ModItems.GLOOM_RESIN, 800);
		FuelRegistry.INSTANCE.add(ModBlocks.GLOOM_RESIN_BLOCK, 8000);

		StrippableBlockRegistry.register(ModBlocks.GLOOMWOOD_LOG, ModBlocks.STRIPPED_GLOOMWOOD_LOG);
		StrippableBlockRegistry.register(ModBlocks.GLOOMWOOD_WOOD, ModBlocks.STRIPPED_GLOOMWOOD_WOOD);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GLOOMWOOD_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_GLOOMWOOD_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GLOOMWOOD_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_GLOOMWOOD_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GLOOMWOOD_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GLOOM_LEAVES, 30, 60);

	}
}