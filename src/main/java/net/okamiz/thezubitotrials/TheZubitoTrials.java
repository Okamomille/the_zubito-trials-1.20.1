package net.okamiz.thezubitotrials;

import net.fabricmc.api.ModInitializer;

import net.okamiz.thezubitotrials.entity.TZTEntities;
import net.okamiz.thezubitotrials.util.TZTRegistries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TheZubitoTrials implements ModInitializer {
	public static final String MOD_ID = "thezubitotrials";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		TZTEntities.registerTZTEntities();
		TZTRegistries.registerTZTStuffs();

	}
}