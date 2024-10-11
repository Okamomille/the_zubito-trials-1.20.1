package net.okamiz.thezubitotrials.entity.custom;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.mob.PiglinBruteEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.World;
import net.okamiz.thezubitotrials.item.TZTItems;

public class PiglinExecutionnerEntity extends PiglinBruteEntity {
    public PiglinExecutionnerEntity(EntityType<? extends PiglinBruteEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void initEquipment(Random random, LocalDifficulty localDifficulty) {
        this.equipStack(EquipmentSlot.MAINHAND, new ItemStack(TZTItems.EXECUTIONNER_AXE));
        this.setEquipmentDropChance(EquipmentSlot.MAINHAND, 100f);
    }

    public static DefaultAttributeContainer.Builder createPiglinExecutionnerAttributes(){
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 16)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 3)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.3f);
    }


    @Override
    public boolean tryAttack(Entity target) {
        boolean isAttackSuccessful = super.tryAttack(target);
        if (isAttackSuccessful && target instanceof PlayerEntity) {
            // Set the player on fire for 5 seconds
            target.setOnFireFor(5);
        }
        return isAttackSuccessful;
    }
}
