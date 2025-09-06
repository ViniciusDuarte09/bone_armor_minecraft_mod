package net.msvic.bonearmor.GUI;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.RegistryObject;
import net.msvic.bonearmor.ModRegistries;
import net.msvic.bonearmor.item.Bones;
import net.msvic.bonearmor.item.Consumables;
import net.msvic.bonearmor.item.Weapons;

public class CustomCreativeTab {

    public static final RegistryObject<CreativeModeTab> BONE_ARMOR_TAB = ModRegistries.CREATIVE_MOD_TAB.register("bone_amor_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(Weapons.PUTRID_STAFF.get()))
                    .title(Component.translatable("creativetab.bone_amor_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(Bones.HARD_BONE.get());
                        pOutput.accept(Weapons.PUTRID_STAFF.get());
                        pOutput.accept(Consumables.UNDEAD_WINE_ITEM.get());
                    })
                    .build());

    public static void start(){}
}
