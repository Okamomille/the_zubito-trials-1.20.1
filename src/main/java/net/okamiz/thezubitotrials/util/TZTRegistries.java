package net.okamiz.thezubitotrials.util;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.okamiz.thezubitotrials.entity.TZTEntities;
import net.okamiz.thezubitotrials.entity.custom.DarkForestSpiderEntity;
import net.okamiz.thezubitotrials.entity.custom.MagmaSkeletonEntity;

public class TZTRegistries {

    public static void registerTZTStuffs(){
        registerAttributes();
    }


    private static void registerAttributes(){
        FabricDefaultAttributeRegistry.register(TZTEntities.MAGMA_SKELETON, MagmaSkeletonEntity.createMagmaSkeletonAttributes());
        FabricDefaultAttributeRegistry.register(TZTEntities.DARK_FOREST_SPIDER, DarkForestSpiderEntity.createDarkForestSpiderAttributes());
    }
}
