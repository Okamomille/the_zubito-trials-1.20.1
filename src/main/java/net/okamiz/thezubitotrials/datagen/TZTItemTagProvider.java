package net.okamiz.thezubitotrials.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.okamiz.thezubitotrials.item.TZTItems;

import java.util.concurrent.CompletableFuture;

public class TZTItemTagProvider extends FabricTagProvider.ItemTagProvider {


    public TZTItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    public void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(TZTItems.DARK_FLAME_HELMET, TZTItems.DARK_FLAME_CHESTPLATE,TZTItems.DARK_FLAME_LEGGINGS,TZTItems.DARK_FLAME_BOOTS)
        ;

    }
}
