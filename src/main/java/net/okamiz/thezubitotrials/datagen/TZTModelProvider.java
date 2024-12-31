package net.okamiz.thezubitotrials.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;
import net.minecraft.util.Identifier;
import net.okamiz.thezubitotrials.item.TZTItems;

import java.util.Optional;

public class TZTModelProvider extends FabricModelProvider {
    public TZTModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }


    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.registerArmor(((ArmorItem) TZTItems.DARK_FLAME_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) TZTItems.DARK_FLAME_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) TZTItems.DARK_FLAME_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) TZTItems.DARK_FLAME_BOOTS));

    }
}
