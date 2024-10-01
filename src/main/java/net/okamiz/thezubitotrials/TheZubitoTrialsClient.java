package net.okamiz.thezubitotrials;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.okamiz.thezubitotrials.entity.TZTEntities;
import net.okamiz.thezubitotrials.entity.client.MagmaSkeletonModel;
import net.okamiz.thezubitotrials.entity.client.MagmaSkeletonRenderer;
import net.okamiz.thezubitotrials.entity.layer.TZTModelLayers;

public class TheZubitoTrialsClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {


		EntityModelLayerRegistry.registerModelLayer(TZTModelLayers.MAGMA_SKELETON, MagmaSkeletonModel::getTexturedModelData);

		EntityRendererRegistry.register(TZTEntities.MAGMA_SKELETON, MagmaSkeletonRenderer::new);
	}
}