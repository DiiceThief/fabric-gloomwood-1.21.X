package net.diice.gloomwoodmod;

import net.diice.gloomwoodmod.block.ModBlocks;
import net.diice.gloomwoodmod.item.ModItemGroups;
import net.diice.gloomwoodmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

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

	}

}