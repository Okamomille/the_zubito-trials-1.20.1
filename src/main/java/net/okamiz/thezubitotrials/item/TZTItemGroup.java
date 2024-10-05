package net.okamiz.thezubitotrials.item;


import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.okamiz.thezubitotrials.TheZubitoTrials;

public class TZTItemGroup {

    public static final ItemGroup THE_ZUBITO_TRIALS_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TheZubitoTrials.MOD_ID, "the_zubito_trials_item_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.the_zubito_trials_group"))
                    .icon(() -> new ItemStack(TZTItems.EXECUTIONNER_AXE)).entries((displayContext, entries) -> {

                    entries.add(TZTItems.EXECUTIONNER_AXE);

                    }).build());

    public static void registerItemGroups(){
        TheZubitoTrials.LOGGER.info("Registering Item Groups for " + TheZubitoTrials.MOD_ID);
    }
}
