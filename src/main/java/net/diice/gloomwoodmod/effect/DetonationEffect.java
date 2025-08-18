package net.diice.gloomwoodmod.effect;

import io.netty.util.AttributeMap;
import net.diice.gloomwoodmod.GloomwoodMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageSources;
import net.minecraft.entity.damage.DamageTypes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.particle.SimpleParticleType;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.Position;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;
import org.jetbrains.annotations.Nullable;

import java.util.Vector;
import java.util.logging.Level;

public class DetonationEffect extends StatusEffect{

    protected DetonationEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }
    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return super.canApplyUpdateEffect(duration, amplifier);
    }
    public void onRemoved(LivingEntity entity, AttributeContainer attributes, int amplifier) {
        if (!entity.getWorld().isClient()) {
            explode(entity);
        }
        super.onRemoved(entity, attributes, amplifier);
    }
    private void explode(LivingEntity entity) {
        World world = entity.getWorld();
        Vec3d pos = entity.getPos();

        entity.damage(entity.getDamageSources().explosion(null),8.0f);

        world.createExplosion(
                entity, pos.getX(),pos.getY(),pos.getZ(), 3.0f, World.ExplosionSourceType.TNT);
    }
}

