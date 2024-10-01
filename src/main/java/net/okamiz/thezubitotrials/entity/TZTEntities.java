package net.okamiz.thezubitotrials.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.okamiz.thezubitotrials.TheZubitoTrials;
import net.okamiz.thezubitotrials.entity.custom.MagmaSkeletonEntity;

public class TZTEntities {

    public static final EntityType<MagmaSkeletonEntity> MAGMA_SKELETON = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(TheZubitoTrials.MOD_ID, "magma_skeleton"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, MagmaSkeletonEntity::new)
                    .dimensions(EntityDimensions.fixed(0.75f, 1.9f)).build());



    public static void registerTZTEntities(){
        TheZubitoTrials.LOGGER.info("Registering Entites for " + TheZubitoTrials.MOD_ID);
    }
}
