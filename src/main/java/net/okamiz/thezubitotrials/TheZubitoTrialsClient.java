package net.okamiz.thezubitotrials;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.okamiz.thezubitotrials.entity.TZTEntities;
import net.okamiz.thezubitotrials.entity.client.*;
import net.okamiz.thezubitotrials.entity.layer.TZTModelLayers;

public class TheZubitoTrialsClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {


		EntityModelLayerRegistry.registerModelLayer(TZTModelLayers.MAGMA_SKELETON, MagmaSkeletonModel::getTexturedModelData);
		EntityModelLayerRegistry.registerModelLayer(TZTModelLayers.DARK_FOREST_SPIDER, DarkForestSpiderModel::getTexturedModelData);
		EntityModelLayerRegistry.registerModelLayer(TZTModelLayers.PIGLIN_EXECUTIONNER, PiglinExecutionnerModel::getTexturedModelData);

		EntityRendererRegistry.register(TZTEntities.MAGMA_SKELETON, MagmaSkeletonRenderer::new);
		EntityRendererRegistry.register(TZTEntities.DARK_FOREST_SPIDER, DarkForestSpiderRenderer::new);
		EntityRendererRegistry.register(TZTEntities.PIGLIN_EXECUTIONNER, PiglinExecutionnerRenderer::new);
	}
}