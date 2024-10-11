package net.okamiz.thezubitotrials.entity.client;

import net.minecraft.client.render.entity.BipedEntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.entity.mob.AbstractPiglinEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.util.Identifier;
import net.okamiz.thezubitotrials.TheZubitoTrials;
import net.okamiz.thezubitotrials.entity.custom.PiglinExecutionnerEntity;
import net.okamiz.thezubitotrials.entity.layer.TZTModelLayers;

public class PiglinExecutionnerRenderer<T extends PiglinExecutionnerEntity> extends BipedEntityRenderer<T, PiglinExecutionnerModel<T>> {
    private static final Identifier TEXTURE = new Identifier(TheZubitoTrials.MOD_ID,"textures/entity/piglin_executionner.png");

    public PiglinExecutionnerRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new PiglinExecutionnerModel<>(ctx.getPart(TZTModelLayers.PIGLIN_EXECUTIONNER)), 0.3f);
    }

    protected boolean isShaking(PiglinExecutionnerEntity mobEntity) {
        return super.isShaking((T) mobEntity) || mobEntity != null && ((AbstractPiglinEntity)mobEntity).shouldZombify();
    }
    @Override
    public Identifier getTexture(T entity) {
        return TEXTURE;
    }
}
