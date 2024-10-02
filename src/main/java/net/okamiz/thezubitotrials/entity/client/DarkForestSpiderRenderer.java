package net.okamiz.thezubitotrials.entity.client;


import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import net.okamiz.thezubitotrials.TheZubitoTrials;
import net.okamiz.thezubitotrials.entity.custom.DarkForestSpiderEntity;
import net.okamiz.thezubitotrials.entity.layer.TZTModelLayers;

public class DarkForestSpiderRenderer<T extends DarkForestSpiderEntity> extends MobEntityRenderer<T, DarkForestSpiderModel<T>> {
    private static final Identifier TEXTURE = new Identifier(TheZubitoTrials.MOD_ID,"textures/entity/dark_forest_spider.png");
    public DarkForestSpiderRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new DarkForestSpiderModel<>(ctx.getPart(TZTModelLayers.DARK_FOREST_SPIDER)), 1f);
    }

    @Override
    public Identifier getTexture(T entity) {
        return TEXTURE;
    }
}
