package net.okamiz.thezubitotrials.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;
import net.okamiz.thezubitotrials.item.TZTItems;

public class TZTLootTableModifiers {

    private static final Identifier PIGLIN_EXECUTIONNER_ID =
            new Identifier("thezubitotrials", "entities/piglin_executionner");

    private static final Identifier MAGMA_SKELETON_ID =
            new Identifier("thezubitotrials", "entities/magma_skeleton");

    //private static final Identifier DARK_FOREST_ORC_ID =
    //        new Identifier("thezubitotrials", "entities/dark_forest_orc");


    public static void modifyLootTables(){
        LootTableEvents.MODIFY.register(((resourceManager, lootManager, id, tableBuilder, source) -> {


            if(PIGLIN_EXECUTIONNER_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.7f)) // 1f = 100% of the time
                        .with(ItemEntry.builder(TZTItems.ETERNAL_FLAME))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build()); // Number of Items

                tableBuilder.pool(poolBuilder.build());
            }

            if(MAGMA_SKELETON_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.9f)) // 1f = 100% of the time
                        .with(ItemEntry.builder(TZTItems.MAGMATIC_BONE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build()); // Number of Items

                tableBuilder.pool(poolBuilder.build());
            }

            //if(DARK_FOREST_ORC_ID.equals(id)) {
            //    LootPool.Builder poolBuilder = LootPool.builder()
            //            .rolls(ConstantLootNumberProvider.create(1))
            //            .conditionally(RandomChanceLootCondition.builder(0.7f)) // 1f = 100% of the time
            //            .with(ItemEntry.builder(TZTItems.DARK_FOREST_SOUL))
            //            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build()); // Number of Items
            //
            //    tableBuilder.pool(poolBuilder.build());
            //}



        }));
    }

}

