package net.okamiz.thezubitotrials.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.okamiz.thezubitotrials.TheZubitoTrials;

public class TZTItems {


    public static final Item EXECUTIONNER_AXE = registerItem("eternal_executionner_axe",
            new SwordItem(ToolMaterials.NETHERITE, 15, -3.5F, new FabricItemSettings()));



    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(TheZubitoTrials.MOD_ID, name), item);
    }

    public static void registerTZTItems(){
        TheZubitoTrials.LOGGER.info("Register Items for " + TheZubitoTrials.MOD_ID);
    }
}
