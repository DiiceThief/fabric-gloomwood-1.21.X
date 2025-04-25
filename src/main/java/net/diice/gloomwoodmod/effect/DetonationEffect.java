package net.diice.gloomwoodmod.effect;

import net.diice.gloomwoodmod.GloomwoodMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
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
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;
import org.jetbrains.annotations.Nullable;

public class DetonationEffect extends StatusEffect {
    public DetonationEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public boolean applyUpdateEffect(LivingEntity entity, int amplifier) {


        if (entity.isOnFire()) {
            World world = entity.getWorld();
            if (!world.isClient()) {
                world.createExplosion(entity, entity.getX(), entity.getY()+1, entity.getZ(),
                        (float) 1, entity.removeStatusEffect(ModEffects.DETONATION),
                        World.ExplosionSourceType.TNT);
                return true;
            }
        }
        return super.applyUpdateEffect(entity, amplifier);
    }
        @Override
        public boolean canApplyUpdateEffect ( int duration, int amplifier){
            return true;
        }
    }


