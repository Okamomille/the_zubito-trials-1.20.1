package net.okamiz.thezubitotrials.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.okamiz.thezubitotrials.TheZubitoTrials;
import net.okamiz.thezubitotrials.entity.TZTEntities;
import net.okamiz.thezubitotrials.util.TZTArmorMaterials;

public class TZTItems {

    // WEAPONS -----------------------------

    public static final Item EXECUTIONNER_AXE = registerItem("eternal_executionner_axe",
            new SwordItem(ToolMaterials.NETHERITE, 15, -3.5F, new FabricItemSettings()));


    // ARMORS -----------------

    public static final Item DARK_FLAME_HELMET = registerItem("dark_flame_helmet",
            new ArmorItem(TZTArmorMaterials.DARK_FLAME, ArmorItem.Type.HELMET,new FabricItemSettings()));
    public static final Item DARK_FLAME_CHESTPLATE = registerItem("dark_flame_chestplate",
            new ArmorItem(TZTArmorMaterials.DARK_FLAME, ArmorItem.Type.CHESTPLATE,new FabricItemSettings()));
    public static final Item DARK_FLAME_LEGGINGS = registerItem("dark_flame_leggings",
            new ArmorItem(TZTArmorMaterials.DARK_FLAME, ArmorItem.Type.LEGGINGS,new FabricItemSettings()));
    public static final Item DARK_FLAME_BOOTS = registerItem("dark_flame_boots",
            new ArmorItem(TZTArmorMaterials.DARK_FLAME, ArmorItem.Type.BOOTS,new FabricItemSettings()));


    // ITEMS ---------------

    public static final Item ETERNAL_FLAME = registerItem("eternal_flame",
            new Item(new FabricItemSettings()));
    public static final Item MAGMATIC_BONE = registerItem("magmatic_bone",
            new Item(new FabricItemSettings()));
    public static final Item DARK_FOREST_SOUL = registerItem("dark_forest_soul",
            new Item(new FabricItemSettings()));

    public static final Item KEY_OF_THE_ETERNAL_FLAME = registerItem("key_of_the_eternal_flame",
            new Item(new FabricItemSettings()));
    public static final Item KEY_OF_THE_DARKEST_FOREST = registerItem("key_of_the_darkest_forest",
            new Item(new FabricItemSettings()));


    // SPAWN EGGS ------------------------

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
