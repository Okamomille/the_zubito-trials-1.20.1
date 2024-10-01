package net.okamiz.thezubitotrials.entity.client;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.BipedEntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import net.okamiz.thezubitotrials.TheZubitoTrials;
import net.okamiz.thezubitotrials.entity.custom.MagmaSkeletonEntity;
import net.okamiz.thezubitotrials.entity.layer.TZTModelLayers;

@Environment(EnvType.CLIENT)
public class MagmaSkeletonRenderer extends BipedEntityRenderer<MagmaSkeletonEntity, MagmaSkeletonModel<MagmaSkeletonEntity>> {
    private static final Identifier TEXTURE = new Identifier(TheZubitoTrials.MOD_ID,"textures/entity/magma_skeleton.png");

    @Override
    public Identifier getTexture(MagmaSkeletonEntity entity) {
        return TEXTURE;
    }

    public MagmaSkeletonRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new MagmaSkeletonModel<>(ctx.getPart(TZTModelLayers.MAGMA_SKELETON)), 0.3f);
    }

}
