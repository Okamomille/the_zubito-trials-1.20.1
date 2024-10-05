package net.okamiz.thezubitotrials.entity.custom;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.mob.SpiderEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class DarkForestSpiderEntity extends SpiderEntity {
    public DarkForestSpiderEntity(EntityType<? extends SpiderEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public boolean tryAttack(Entity target) {
        boolean isAttackSuccessful = super.tryAttack(target);
        if (isAttackSuccessful && target instanceof PlayerEntity) {
            // Set the player on fire for 5 seconds
            ((PlayerEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.DARKNESS, 100, 0));
            ((PlayerEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 160, 0));
        }
        return isAttackSuccessful;
    }

    public static DefaultAttributeContainer.Builder createDarkForestSpiderAttributes(){
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 16)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 3)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.3f);
    }
}
