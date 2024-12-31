package net.okamiz.thezubitotrials;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;
import net.okamiz.thezubitotrials.datagen.TZTItemTagProvider;
import net.okamiz.thezubitotrials.datagen.TZTModelProvider;

public class TheZubitoTrialsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(TZTItemTagProvider::new);
		pack.addProvider(TZTModelProvider::new);
	}


}
