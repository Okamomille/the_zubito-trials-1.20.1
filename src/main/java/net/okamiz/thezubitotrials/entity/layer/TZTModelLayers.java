package net.okamiz.thezubitotrials.entity.layer;

import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;
import net.okamiz.thezubitotrials.TheZubitoTrials;

public class TZTModelLayers {
    public static final EntityModelLayer MAGMA_SKELETON =
            new EntityModelLayer(new Identifier(TheZubitoTrials.MOD_ID, "magma_skeleton"), "main");
    public static final EntityModelLayer DARK_FOREST_SPIDER =
            new EntityModelLayer(new Identifier(TheZubitoTrials.MOD_ID, "dark_forest_spider"), "main");

    public static final EntityModelLayer PIGLIN_EXECUTIONNER =
            new EntityModelLayer(new Identifier(TheZubitoTrials.MOD_ID, "piglin_executionner"), "main");
}
