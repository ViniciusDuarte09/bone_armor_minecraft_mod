package net.msvic.bonearmor.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.RegistryObject;
import net.msvic.bonearmor.ModRegistries;

//This class control the foods, potions and the items who interect with player
public class Consumables {

    public static final FoodProperties UNDEAD_WINE_PROPERTIES = new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.2f)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1000, 1), 1.0f)
            .build();

    public static final RegistryObject<Item> UNDEAD_WINE_ITEM = ModRegistries.ITEMS.register("undead_wine",
            () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .craftRemainder(Items.GLASS_BOTTLE)
                    .food(UNDEAD_WINE_PROPERTIES)));


    public static void start(){}

}