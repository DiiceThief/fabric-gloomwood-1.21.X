package net.diice.gloomwoodmod;

import net.diice.gloomwoodmod.block.ModBlocks;
import net.diice.gloomwoodmod.util.ModModelPredicates;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.data.client.BlockStateModelGenerator;

public class GloomwoodModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLOOMWOOD_SAPLING, RenderLayer.getCutout());

        ModModelPredicates.registerModelPredicates();

    }
}
