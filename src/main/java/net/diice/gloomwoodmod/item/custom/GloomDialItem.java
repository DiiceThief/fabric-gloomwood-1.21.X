package net.diice.gloomwoodmod.item.custom;

import net.diice.gloomwoodmod.GloomwoodMod;
import net.diice.gloomwoodmod.block.ModBlocks;
import net.diice.gloomwoodmod.component.ModDataComponentTypes;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;

import java.util.List;
import java.util.Map;

public class GloomDialItem extends Item {
    private static final Map<Block, Block> DIAL_MAP =
            Map.of(
                    Blocks.IRON_ORE, ModBlocks.RUNESTONE_ORE,
                    Blocks.OAK_LOG, ModBlocks.GLOOMWOOD_LOG,
                    Blocks.BIRCH_LOG, ModBlocks.GLOOMWOOD_LOG,
                    Blocks.SPRUCE_LOG, ModBlocks.GLOOMWOOD_LOG,
                    Blocks.DARK_OAK_LOG, ModBlocks.GLOOMWOOD_LOG,
                    Blocks.ACACIA_LOG, ModBlocks.GLOOMWOOD_LOG,
                    Blocks.JUNGLE_LOG, ModBlocks.GLOOMWOOD_LOG,
                    Blocks.CHERRY_LOG, ModBlocks.GLOOMWOOD_LOG,
                    Blocks.MANGROVE_LOG, ModBlocks.GLOOMWOOD_LOG,
                    Blocks.COAL_BLOCK, ModBlocks.GLOOM_RESIN_BLOCK
            );
    public GloomDialItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        Block clickedBlock = world.getBlockState(context.getBlockPos()).getBlock();

        if(DIAL_MAP.containsKey(clickedBlock)) {
            if (!world.isClient()) {
                world.setBlockState(context.getBlockPos(), DIAL_MAP.get(clickedBlock).getDefaultState());

                context.getStack().damage(1, ((ServerWorld) world), ((ServerPlayerEntity) context.getPlayer()),
                        item -> context.getPlayer().sendEquipmentBreakStatus(item, EquipmentSlot.MAINHAND));

                world.playSound(null, context.getBlockPos(), SoundEvents.BLOCK_AMETHYST_BLOCK_CHIME, SoundCategory.BLOCKS);

                context.getStack().set(ModDataComponentTypes.COORDINATES, context.getBlockPos());

            }
        }

        return ActionResult.SUCCESS;
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        if (Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("tooltip.gloomwood-mod.gloom_dial.shift_down"));
        } else {
            tooltip.add(Text.translatable("tooltip.gloomwood-mod.gloom_dial"));
        }
        if (stack.get(ModDataComponentTypes.COORDINATES) !=null) {
            tooltip.add(Text.literal("Last Block Changed at" + stack.get(ModDataComponentTypes.COORDINATES)));
        }

        super.appendTooltip(stack, context, tooltip, type);
    }
}
