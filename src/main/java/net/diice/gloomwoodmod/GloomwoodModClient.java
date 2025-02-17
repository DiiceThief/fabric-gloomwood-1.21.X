package net.diice.gloomwoodmod;

import net.diice.gloomwoodmod.block.ModBlocks;
import net.diice.gloomwoodmod.util.ModModelPredicates;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;

public class GloomwoodModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        ModModelPredicates.registerModelPredicates();

    }
}
