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


                    entries.add(TZTItems.DARK_FLAME_HELMET);
                    entries.add(TZTItems.DARK_FLAME_CHESTPLATE);
                    entries.add(TZTItems.DARK_FLAME_LEGGINGS);
                    entries.add(TZTItems.DARK_FLAME_BOOTS);


                    entries.add(TZTItems.KEY_OF_THE_ETERNAL_FLAME);
                    entries.add(TZTItems.KEY_OF_THE_DARKEST_FOREST);

                    entries.add(TZTItems.ETERNAL_FLAME);
                    entries.add(TZTItems.DARK_FOREST_SOUL);
                    entries.add(TZTItems.MAGMATIC_BONE);


                    entries.add(TZTItems.MAGMA_SKELETON_SPAWN_EGG);
                    entries.add(TZTItems.DARK_FOREST_SPIDER_SPAWN_EGG);
                    entries.add(TZTItems.PIGLIN_EXECUTIONNER_SPAWN_EGG);

                    }).build());

    public static void registerItemGroups(){
        TheZubitoTrials.LOGGER.info("Registering Item Groups for " + TheZubitoTrials.MOD_ID);
    }
}
