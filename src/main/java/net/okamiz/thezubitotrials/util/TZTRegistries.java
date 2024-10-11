package net.okamiz.thezubitotrials.util;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.okamiz.thezubitotrials.entity.TZTEntities;
import net.okamiz.thezubitotrials.entity.custom.DarkForestSpiderEntity;
import net.okamiz.thezubitotrials.entity.custom.MagmaSkeletonEntity;
import net.okamiz.thezubitotrials.entity.custom.PiglinExecutionnerEntity;

public class TZTRegistries {

    public static void registerTZTStuffs(){
        registerAttributes();
    }


    private static void registerAttributes(){
        FabricDefaultAttributeRegistry.register(TZTEntities.MAGMA_SKELETON, MagmaSkeletonEntity.createMagmaSkeletonAttributes());
        FabricDefaultAttributeRegistry.register(TZTEntities.DARK_FOREST_SPIDER, DarkForestSpiderEntity.createDarkForestSpiderAttributes());
        FabricDefaultAttributeRegistry.register(TZTEntities.PIGLIN_EXECUTIONNER, PiglinExecutionnerEntity.createPiglinExecutionnerAttributes());
    }
}
