package net.okamiz.thezubitotrials.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.okamiz.thezubitotrials.TheZubitoTrials;
import net.okamiz.thezubitotrials.entity.TZTEntities;

public class TZTItems {


    public static final Item EXECUTIONNER_AXE = registerItem("eternal_executionner_axe",
            new SwordItem(ToolMaterials.NETHERITE, 15, -3.5F, new FabricItemSettings()));


    public static final Item MAGMA_SKELETON_SPAWN_EGG = registerItem("magma_skeleton_spawn_egg",
            new SpawnEggItem(TZTEntities.MAGMA_SKELETON, 16777215,16777215, new FabricItemSettings()));
    public static final Item DARK_FOREST_SPIDER_SPAWN_EGG = registerItem("dark_forest_spider_spawn_egg",
            new SpawnEggItem(TZTEntities.DARK_FOREST_SPIDER, 16777215,16777215, new FabricItemSettings()));
    public static final Item PIGLIN_EXECUTIONNER_SPAWN_EGG = registerItem("piglin_executionner_spawn_egg",
            new SpawnEggItem(TZTEntities.PIGLIN_EXECUTIONNER, 16777215,16777215, new FabricItemSettings()));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(TheZubitoTrials.MOD_ID, name), item);
    }

    public static void registerTZTItems(){
        TheZubitoTrials.LOGGER.info("Register Items for " + TheZubitoTrials.MOD_ID);
    }
}
